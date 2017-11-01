pipeline {
    agent any
    environment {
    JAVA_HOME="/usr/bin/java"
    M3_HOME="/opt/maven/apache-maven-3.5.2"
    PATH = "$M3_HOME/bin:$PATH:$JAVA_HOME"
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
                sh 'mvn -version'
                //sh 'mvn test'
            }   
        }        
    }
}
