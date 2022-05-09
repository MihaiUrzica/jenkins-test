pipeline{

    agent any

    stages {

        stage('build') {
            steps {
//             bat 'gradle wrapper –gradle-version 5.1.1 '
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