#### Every Single Application should use their owned port

#### Docker build image, you can the IDE bundled Plugin to build also, up to you 

`docker build -t <your tag name> .`

#### Docke run and set the port to connect host port , -d is daemon running

`docker run -d -p 8080:8080 <your tag name>`

#### Check images and containers status

`docker image ls` 

`docker container ls` 

#### Link to container inside shell

`docker run -ti --entrypoint /bin/sh <your tag name>`

#### Guys, if you still have any problems, Jess is always free for you  :)))
