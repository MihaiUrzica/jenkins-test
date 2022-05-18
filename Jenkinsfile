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

        stage('run/deploy'){
            steps{
                bat 'cd demo & gradle bootRun'
            }

        }

    }

}