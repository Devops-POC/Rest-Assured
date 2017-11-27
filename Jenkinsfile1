
node{
    stage ('git checkout'){
	    echo "RESt Assured testing"
    	sh 'ls -ltr'	    
    	checkout scm	    
    	sh 'ls -ltr'    	   
    	sh 'docker images'        
	def customImage = docker.build("restassured-demo:${env.BUILD_ID}")
	    sh "docker run -i restassured-demo:${env.BUILD_ID}"
	sh "docker ps -a | grep restassured-demo:${env.BUILD_ID} | awk \'{print $1}\' > outFile "
	containerID = readFile 'outFile'
	echo "The current container id is ${containerID}"	
	sh 'docker images'
	    echo "pull req test"
        }
}
