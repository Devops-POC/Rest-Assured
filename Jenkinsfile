
node{
    stage ('git checkout'){
    	sh 'ls -ltr'
    	checkout scm
    	sh 'ls -ltr'
    	echo 'inside jenkins'
	sh 'whoami'    
    	sh 'docker images'
        def customImage = docker.build("restassure-demo:${env.BUILD_ID}")
	echo '$customImage'
	sh 'docker images'
	    sh "docker cp 6c178a0abbd7:Rest-Assured/target/surefire-reports/emailable-report.html ."
        customImage.inside {
	sh 'pwd'
        sh 'ls -ltr'	
        }
    }
}
