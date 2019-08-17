pipeline {
    agent any
    environment{
       mavenHome = tool name: 'usr/local/maven', type: 'maven'
       mavenCMD = "${mavenHome}/bin/mvn"
    }
    stages {
        stage('init'){
            steps{
                sh 'echo initializing step'
            }
        }
        stage('build') {

            steps {
                sh "${mavenCMD} clean package"
                sh 'docker build . -t stackfortech/spring-boot-docker:1.0.0'
            }
        }
        stage('deploy'){
            steps{
                sh 'docker rm -f spring-boot-docker-app || true'
                sh 'docker run -p 8082:8082 -d --name spring-boot-docker-app stackfortech/spring-boot-docker:1.0.0'
            }
        }

    }
    post{
        always {
            echo 'This will always run'
            deleteDir()
        }
        success {
            echo 'This will run only if successful'
        }
        failure {
            echo 'This will run only if failed'
        }
        unstable {
            echo 'This will run only if the run was marked as unstable'
        }
        changed {
            echo 'This will run only if the state of the Pipeline has changed'
            echo 'For example, if the Pipeline was previously failing but is now successful'
        }
    }
}
