pipeline {
    agent any    
    stages {
        stage('checkout stage') {
            steps {
                checkout scm
                sh 'ls -ltr'
                sh 'docker images'
                def customImage = docker.build("restaasure:demo:${env.BUILD_ID}")
	            sh 'docker images'
                customImage.inside {
                    sh 'ls -ltr'
                }
            }            
        }            
    }
}
