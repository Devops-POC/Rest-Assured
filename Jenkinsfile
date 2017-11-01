pipeline {
    agent any
    environment {
    //JAVA_HOME="/usr/lib/jvm/java-8-openjdk-amd64"
    //M3_HOME="/opt/maven/apache-maven-3.5.2"
    //PATH = "$M3_HOME/bin:$PATH:$JAVA_HOME"
  }
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
