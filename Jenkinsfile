pipeline {
  agent any
  stages {
    stage('Compile') {
      steps {
        sh './gradlew.bat compileJava'
      }
    }

    stage('Unit test') {
      steps {
        sh './gradlew.bat test'
      }
    }

    stage('Build') {
      steps {
        sj './gradlew.bat build'
      }
    }

  }
}