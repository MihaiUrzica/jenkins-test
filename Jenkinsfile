pipeline{

    agent any

    stages {

        stage('build') {
            steps {
                bat 'cd demo'
                bat 'gradlew clean build -x test'
            }
        }


        stage('test') {
            steps {
                bat 'gradlew test'
            }
        }

    }

}