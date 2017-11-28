def pr_ID = 30
node {
    stage('build'){
        echo "building"
    }
stage('Merge approval'){
    input "Approve Pull Request ?"
    echo "Merge status"
    //setGitHubPullRequestStatus context: 'Mergesuccess', message: 'Success', state: 'SUCCESS'
  }

stage ('Merge Pull Request'){
    git credentialsId: '97b642fd-9553-426c-ae13-8fb7d75cea8b', url: 'https://github.com/Devops-POC/Rest-Assured.git'
    
    sh "git fetch origin pull/${pr_ID}/head:Devops-POC-patch-2"

    sh 'git merge --no-ff --log -m "Merge pull request ${pr_ID} from Devops-POC/Devops-POC-patch-2" Devops-POC-patch-2'
    sh "git tag pull_req_${pr_ID}"
    withCredentials([[$class: 'UsernamePasswordMultiBinding', credentialsId: '97b642fd-9553-426c-ae13-8fb7d75cea8b', usernameVariable: 'GIT_USERNAME', passwordVariable: 'GIT_PASSWORD']]) {

    sh "git tag"
    sh "git push https://${env.GIT_USERNAME}:${env.GIT_PASSWORD}@github.com/Devops-POC/Rest-Assured.git --all"
        sh "git push https://${env.GIT_USERNAME}:${env.GIT_PASSWORD}@github.com/Devops-POC/Rest-Assured.git --tags"
        

    }
   //end of pipeline
    sh 'ls -ltr'
    
}
 
}
