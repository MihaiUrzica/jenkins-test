pipeline{

    agent any

    stages {

        stage('build') {
            './gradlew clean build -x test'
        }

    }

}