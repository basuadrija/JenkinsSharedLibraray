def call ()
{
    sh """
    docker build -t springboot:latest .
    docker save -o springboot.tar springboot:latest
    """
}