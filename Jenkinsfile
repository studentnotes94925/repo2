pipeline {
    agent any
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
