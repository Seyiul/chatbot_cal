pipeline {
  agent any
  stages {
    stage('Compile') {
      steps {
        sh './gradlew clean'
      }
    }

    stage('Unit test') {
      steps {
        sh './gradlew test'
      }
    }

    stage('Build') {
      steps {
        sj './gradlew build'
      }
    }

  }
}