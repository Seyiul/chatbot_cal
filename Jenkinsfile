pipeline {
  agent any
  stages {
    stage('Compile') {
      steps {
        sh '.\\gradlew'
      }
    }

    stage('Unit test') {
      steps {
        sh './gradlew test'
      }
    }

    stage('Build') {
      steps {
        sh '''./gradlew build
./gradlew clean bootJar'''
      }
    }

  }
}