pipeline {
  agent any
  stages {
    stage('Compile') {
      steps {
        sh '''git update-index --add --chmod=+x gradlew
./gradlew compileJava'''
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