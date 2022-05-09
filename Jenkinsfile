pipeline{

    agent any

    stages {

        stage('build') {
            sh 'chmod +x gradlew'
            sh './gradlew clean build -x test'
        }

    }

}