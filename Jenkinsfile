pipeline{

    agent any

    stages {

        stage('build') {
            steps {
//                 bat 'gradle init'
//                 bat 'gradle wrapper --gradle-version 2.13'
                bat './gradlew clean build -x test'
            }
        }

        stage('test') {
            steps {
                bat './gradlew test'
            }
        }

    }

}