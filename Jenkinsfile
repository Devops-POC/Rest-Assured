pipeline {
    agent any    
    stages {
        stage('checkout stage') {
            step{
                checkout scm
                sh 'ls -ltr'
                sh 'docker images'
                customImage = docker.build("restaasure-demo:${env.BUILD_ID}")
	            sh 'docker images'                
            }            
        }            
    }
}
