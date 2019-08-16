pipeline {
    agent { docker { image 'maven:3.3.3' } }
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
                sh 'mvn --version'
            }
        }
    }
}
