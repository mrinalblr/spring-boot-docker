pipeline {
    agent { any }
    
    stages {
        stage('init'){
            steps{
                sh 'echo initializing step'
            }
        }
        stage('build') {
            steps {
                sh 'docker build . -t stackfortech/spring-boot-docker:1.0.0'
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
