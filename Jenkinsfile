pipeline{

    agent any

    stages {

        stage('build') {
            steps {
                SH './gradlew.bat clean build -x test'
            }
        }

    }

}