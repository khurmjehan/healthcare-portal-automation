pipeline {
    agent any

    tools {
        jdk 'Java21'
        maven 'Maven3'
    }

    stages {
        stage('Checkout Code') {
            steps {
                echo 'Checking out Healthcare Portal Automation codebase...'
            }
        }

        stage('Compile & Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Execute BDD Test Suite') {
            steps {
                sh 'mvn test'
            }
        }
    }

    post {
        always {
            echo 'Publishing Cucumber Execution Reports...'
            cucumber buildStatus: 'UNSTABLE',
                     fileIncludePattern: '**/cucumber.json',
                     jsonReportDirectory: 'target/cucumber-reports'
        }
    }
}
