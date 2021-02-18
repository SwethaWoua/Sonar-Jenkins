pipeline {
    agent any
    stages{
    stage('Quality Gate Status Check'){
    steps{
         script{
        withSonarQubeEnv('sonarserver') {
                 sh "./gradlew sonarqube"
        }}
      }
    }


    }
}