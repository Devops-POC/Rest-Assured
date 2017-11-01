pipeline {
    agent any
    stages {
        stage('checkout stage') {
            steps {
                checkout scm
                sh 'ls -ltr'
            }            
        }    
        stage('Maven test'){
            steps{
                withMaven('maven-3.5.2'){
                    sh "mvn test"
                }
                
            }   
        }        
    }
}
