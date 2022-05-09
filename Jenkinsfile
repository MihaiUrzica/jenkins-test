pipeline{

    agent any

    stages {

        stage('build') {
            bat './gradlew clean build -x test'
        }

    }

}