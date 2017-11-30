"# Rest-Assured" 
Test and Validation of REST Services using Rest-Assured. Tests are developed using testng and test is triggered from Maven.
Dockerfile in the repository does all the server setup over ubuntu image and installs Maven, GIT, JDK.
# Testing Pull Request

Step 1:

Make sure docker is installed in the server, before running maven test.
Use below commands for installing Docker in Ubuntu server.
Test changes

docker_setup.sh
---------------
curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo apt-key add -


sudo add-apt-repository "deb [arch=amd64] https://download.docker.com/linux/ubuntu $(lsb_release -cs) stable"

sudo apt-get update 

apt-cache policy docker-ce

sudo apt-get install -y docker-ce

sudo systemctl status docker

docker


Step 2 :

Create Docker image from Dockerfile

docker build -f Dockerfile -t demo:restassured . -- to create a docker image locally

docker images                                    -- to list available docker images locally

docker run -it demo:restassured bash             -- to run and login into container

docker#container : 

cd Rest-Assured/target

list available reports:

ls -ltr

cd surefire-reports | more emailable-report.html

docker cp <containerId>:/filepathto<emailable-report.html> /host/path/target

docker ps                                        -- to list running containers

docker ps -a                                     -- to list all containers 




