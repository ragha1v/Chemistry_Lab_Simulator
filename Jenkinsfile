pipeline {
  agent any
  stages {
    stage('Build Gradle') {
            steps {
                // Configure the Gradle build step
                gradle {
                    // Set the path to your Gradle build script
                    gradleFile 'path/to/build.gradle'
                    // Set the tasks you want to execute
                  
                    tasks 'build'
                }
            }
    }
    stage('Maven Build') {
        steps {
            sh 'mvn clean package'
        }
    }

    stage("build") {
      steps {
        withSonarQubeEnv('SonarQube') {
                    sh 'mvn clean install sonar:sonar'
                }
      }
    }
    stage("test") {
      steps {
        echo 'testing the application'
      }
    }
    stage("deploy") {
      steps {
        echo 'deploying the application'
      }
    }
    }
}
