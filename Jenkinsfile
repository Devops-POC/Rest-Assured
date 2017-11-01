pipeline {	
    agent any    
    stages {
        stage('git checkout') {
            steps {
                checkout scm
                sh 'ls -ltr'
            }            
        }    
        stage('Docker Build'){		                          
                sh 'docker images'
		def customImage = docker.build("restassure-demo:${env.BUILD_ID}")
		sh 'docker images'
		customImage.inside {
		sh 'ls -ltr'
		}           
        }        
    }
}
