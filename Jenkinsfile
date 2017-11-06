
node{
    stage ('git checkout'){
    	sh 'ls -ltr'	    
    	checkout scm	    
    	sh 'ls -ltr'    	   
    	sh 'docker images'        
	def customImage = docker.build("restassure-demo:${env.BUILD_ID}")	
	sh "docker run -i restassured-demo:${env.BUILD_ID}"
	sh "docker ps -a | grep \\"restassured-demo:${env.BUILD_ID}\\" | awk \\'{ print $1 }\\' > outFile"
	containerID = readFile 'outFile'
	echo "The current container id is ${containerID}"
	sh 'docker images'
	//sh "docker cp a74c97214054:Rest-Assured/target/surefire-reports/emailable-report.html ."
        customImage.inside {
	sh 'pwd'
        sh 'ls -ltr'	
        }
    }
}
