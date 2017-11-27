node {
    stage('build'){
        echo "building"
    }
}
stage('Deploy approval'){
    input "Deploy to prod?"
    echo "approval"
    //setGitHubPullRequestStatus context: 'Mergesuccess', message: 'Success', state: 'SUCCESS'
    //
}
node {
    stage('deploy to prod'){
        echo "deploying"
    }
}
