def call ()
{
    sh """
    docker build -t springboot:latest .
    docker save -o /opt/springboot.tar springboot:latest
    """
}