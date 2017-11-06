
node{
    stage ('git checkout'){
    	sh 'ls -ltr'	    
    	checkout scm	    
    	sh 'ls -ltr'    	   
    	sh 'docker images'        
	def customImage = docker.build("restassured-demo:${env.BUILD_ID}")	
	def cmdAWK = /'docker ps -a | grep "restassured-demo:${env.BUILD_ID}" | awk '{print $1}' > outFile'
	
print "$cmdAWK"	
	sh 'docker images'	
        }
}
