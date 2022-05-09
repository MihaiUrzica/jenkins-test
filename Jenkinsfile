pipeline{

    agent any

    stages {

        stage('build') {
            steps {
                sh 'gradle wrapper --gradle-version 2.13'
                sh './gradlew clean build -x test'
            }
        }

        stage('test') {
            steps {
                sh './gradlew test'
            }
        }

    }

}