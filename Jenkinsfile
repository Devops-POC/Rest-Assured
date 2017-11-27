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


}
node {
    stage('code merge'){
        publishers {
        mergeGithubPullRequest {
            mergeComment('merged by Jenkins')
            onlyAdminsMerge()
            
            deleteOnMerge()
        }
    }
    }
}
