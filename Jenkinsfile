node {
    stage('build'){
        echo "building"
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
    sh '''
    git fetch origin pull/16/head:Devops-POC-patch-2
    git merge --no-ff --log -m "Merge pull request #16 from Devops-POC/Devops-POC-patch-2" Devops-POC-patch-2
    '''
    withCredentials([[$class: 'UsernamePasswordMultiBinding', credentialsId: '97b642fd-9553-426c-ae13-8fb7d75cea8b', usernameVariable: 'GIT_USERNAME', passwordVariable: 'GIT_PASSWORD']]) {

    
    sh "git push https://${env.GIT_USERNAME}:${env.GIT_PASSWORD}@github.com/Devops-POC/Rest-Assured.git master"
    }
    '''
    sh 'ls -ltr'
    
}
 
}
