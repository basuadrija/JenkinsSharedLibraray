#This is a shared library for maven 
def call()
{
    sh 'mvn clean install'
}
