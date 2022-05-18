pipeline{

    agent any

    stages {

        stage('build') {
            steps {
                bat 'cd demo & gradlew clean build -x test'
            }
        }


        stage('test') {
            steps {
                bat 'cd demo & gradlew test'
            }
        }

    }

}