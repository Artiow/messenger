docker stop "$1_$2_1"
docker rm   "$1_$2_1"
docker rmi  "$1_$2:latest"