
node{
    stage ('git checkout'){
    	sh 'ls -ltr'
    	checkout scm
    	sh 'ls -ltr'
    	echo 'inside jenkins'
	sh 'whoami'    
    	sh 'docker images'
        def customImage = docker.build("restassure-demo:${env.BUILD_ID}")
	//print customImage
	sh 'docker images'
	sh "sudo docker cp 74c97214054:Rest-Assured/target/surefire-reports/emailable-report.html ."
        customImage.inside {
	sh 'pwd'
        sh 'ls -ltr'	
        }
    }
}
