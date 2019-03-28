node{
    stage('SCM Checkout'){
      git'https://github.com/mtafsir/TestProject/tree/master/demo'
    }
    stage('Compile-Package){
      sh 'mvn package'
    
    }
    dir('subDir') {
    checkout scm
    }
}
