pipeline {
    agent any

    environment {
        TEST_ENV = "Jenkins-GitHub-Automation"
    }

    stages {

        stage('Pre-Check') {
            steps {
                echo "🚀 Pipeline started successfully"
                echo "Environment: ${TEST_ENV}"
            }
        }

        stage('Workspace Info') {
            steps {
                echo "📂 Checking workspace"
                sh '''
                    pwd
                    ls -la
                '''
            }
        }

        stage('System Info') {
            steps {
                echo "🖥️ System details"
                sh '''
                    whoami
                    uname -a
                '''
            }
        }

        stage('Dummy Build') {
            steps {
                echo "⚙️ Running dummy build step"
                sh 'sleep 5'
                echo "✅ Build step completed"
            }
        }

        stage('Final Test') {
            steps {
                echo "🎉 Jenkins + GitHub setup is WORKING!"
            }
        }
    }

    post {
        success {
            echo "🟢 Pipeline SUCCESS"
        }
        failure {
            echo "🔴 Pipeline FAILED"
        }
        always {
            echo "📌 Pipeline execution finished"
        }
    }
}
