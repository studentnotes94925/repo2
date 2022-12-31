pipeline {
    agent any

    stages {

    options{ timestamps() };

    stages {
        stage('Test') {
            steps {
                cleanWs()
                echo "Hello World 4!"
                sh "mvn test"

            }
        }

    }
}
