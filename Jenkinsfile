pipeline {
  agent any
  stages {
    stage('Checkout') {
      steps {
        git branch: 'master',
            credentialsId: 'heyKim_github_id',
            url: 'https://github.com/heyKim/todo.git'
      }
    }

    stage('Environment') {
      steps {
        sh 'chmod 755 ./gradlew'
        sh 'java -version'
        sh 'printenv|sort'
      }
    }

    stage('Clean') {
       steps {
         sh './gradlew clean'
       }
    }

    stage('Test') {
       steps {
         sh './gradlew test' // unit test
       }
    }

    stage('Build') {
       steps {
         sh './gradlew build -x test'
       }
    }
  }
}