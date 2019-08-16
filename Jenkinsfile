pipeline {
    agent { docker { image 'maven:3.3.3' } }
    environment {
        DISBALE_AUTH = 'true'
        DB_ENGINE = 'sqlite'
    }
    stages {
        stage('init'){
            steps{
                sh 'echo initializing step'
                sh '''
                    echo multiline steps work too
                    ls -lah 
                '''
            }
        }
        stage('build') {
            steps {
                sh 'printenv'
                sh 'mvn --version'
            }
        }
        stage('Test') {
            steps {
                sh './gradlew check'
            }
        }
    }
    post{
        always {
            echo 'This will always run'
            junit 'build/reports/**/*.xml'
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
