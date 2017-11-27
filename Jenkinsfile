node {
    stage('build'){
        echo "building"
    }
}
stage('Deploy approval'){
    input "Deploy to prod?"
    echo "approval"
    //setGitHubPullRequestStatus context: 'Mergesuccess', message: 'Success', state: 'SUCCESS'

    //adding additional commit
    // adding one more comit

    //comments
    // commit 1

    // commit 2
    //commit 3
    //commit 4


}

stage ('Merge Pull Request'){
    git credentialsId: '97b642fd-9553-426c-ae13-8fb7d75cea8b', url: 'https://github.com/Devops-POC/Rest-Assured.git'
    sh 'ls -ltr'
    
}
 
