def pr_ID = 32

stage 'build' 
node {
//git 'https://github.com/cloudbees/todo-api.git' withEnv(["PATH+MAVEN=${tool 'm3'}/bin"]) {
//sh "mvn -B –Dmaven.test.failure.ignore=true clean package"
//}
//stash excludes: 'target/', includes: '**', name: 'source'
//}
stage 'test'
parallel 'integration': {
node {
//unstash 'source' withEnv(["PATH+MAVEN=${tool 'm3'}/bin"]) {
//sh "mvn clean verify" 
  //      }
}
}, 'quality': {
node {
//unstash 'source' withEnv(["PATH+MAVEN=${tool 'm3'}/bin"]) {
//sh "mvn sonar:sonar" 
  //      }
} 
}
stage 'mail'
timeout(time: 7, unit: 'DAYS') {
//input message: 'Do you want to Merge code?', submitter: 'ops'
}

/*stage ('Merge Pull Request'){
    git credentialsId: '97b642fd-9553-426c-ae13-8fb7d75cea8b', url: 'https://github.com/Devops-POC/Rest-Assured.git'
    
    sh "git fetch origin pull/${pr_ID}/head:Devops-POC-patch-2"
    sh 'git merge --no-ff --log -m "Merge pull request ${pr_ID} from Devops-POC/Devops-POC-patch-2" Devops-POC-patch-2'
    sh "git tag pull_req_${pr_ID}"
    withCredentials([[$class: 'UsernamePasswordMultiBinding', credentialsId: '97b642fd-9553-426c-ae13-8fb7d75cea8b', usernameVariable: 'GIT_USERNAME', passwordVariable: 'GIT_PASSWORD']]) {
    sh "git tag"
    sh "git push https://${env.GIT_USERNAME}:${env.GIT_PASSWORD}@github.com/Devops-POC/Rest-Assured.git --all"
        sh "git push https://${env.GIT_USERNAME}:${env.GIT_PASSWORD}@github.com/Devops-POC/Rest-Assured.git --tags"
        } 
    }
*/
}
