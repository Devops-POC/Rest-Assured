node{
    stage ('test'){
    sh 'ls -ltr'
    checkout scm
    sh 'ls -ltr'
    echo 'inside jenkins'
    sh 'whoami'
    sh 'docker images'
        def customImage = docker.build("restassure-demo:${env.BUILD_ID}")
	sh 'docker images'
        customImage.inside {
            sh 'ls -ltr'
        }
    }
}
