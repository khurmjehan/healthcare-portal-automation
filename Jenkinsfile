pipeline {
    agent any

    tools {
        jdk 'Java21'
    }

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
            echo 'Publishing Cucumber HTML Test Report...'
            cucumber fileIncludePattern: '**/*.json',
                     sortingMethod: 'NATURAL'
        }
    }
}

