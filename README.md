#每個應用記得端口要改否則會衝突

#docker打包image，也可以直接使用IDE 內建的plugin
docker build -t <your tag name> .
#執行並設置端口連接, -d是背景執行
docker run -d -p 8080:8080 myorg/myapp
#查看image, container status
docker image ls 
docker container ls 
#進入容器
docker run -ti --entrypoint /bin/sh <your tag name>

