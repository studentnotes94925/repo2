pipeline {
    agent any

    stages {

    options{ timestamps() };

    stages {
        stage('Test') {
            steps {
                echo "Hello World 4!"
                sh "mvn test"
		cleanWs()
            }
        }

    }
}
