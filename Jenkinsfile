pipeline {
    agent any
    environment {
    M3_HOME="/opt/maven/apache-maven-3.5.2"
    PATH = "$M3_HOME/bin:$PATH"
  }
    stages {
        stage('checkout stage') {
            steps {
                checkout scm
                sh 'ls -ltr'
            }            
        }    
        stage('Maven test'){
            steps{                
                echo "PATH is: $PATH"
                sh 'mvn test'
            }   
        }        
    }
}
