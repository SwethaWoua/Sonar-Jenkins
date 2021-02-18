pipeline {
    agent any
    stages {
        stage('Clone sources') {
            steps {
                git branch: 'main', url: 'https://github.com/SwethaWoua/JenkinSonar.git'
            }
            }
    stages {
        stage('Build') {
            steps {
                echo 'Building..'
            }
        }
   }