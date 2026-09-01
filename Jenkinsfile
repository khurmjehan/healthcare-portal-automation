pipeline {
    agent any

    stages {
        stage('Checkout Code') {
            steps {
                echo 'Checking out Healthcare Portal Automation codebase...'
            }
        }

        stage('Compile & Build') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Execute BDD Test Suite') {
            steps {
                bat 'mvn test'
            }
        }
    }

    post {
        always {
            echo 'Pipeline execution complete.'
        }
    }
}
