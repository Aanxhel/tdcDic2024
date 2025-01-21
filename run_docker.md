
agregar la imagen docker
```
docker container run -e MARIADB_RANDOM_ROOT_PASSWORD=yes -d -p 3306:3306 mariadb:jammy
```

```
docker container run \
-dp 3306:3306 \
--name world-db \
--env MARIADB_USER=ehecatl \
--env MARIADB_PASSWORD=24KubApp! \
--env MARIADB_ROOT_PASSWORD=adminKubDB# \
--env MARIADB_DATABASE=world-db \
--volume world-db:/var/lib/mysql \
mariadb:jammy
```

crear persistencia 
```
docker volume create world-db
```

ver listado 
docker volume ls

docker pull phpmyadmin:5.2.1-apache
docker pull phpmyadmin:5.2.1-apache

docker container run \
--name phpmyadmin \
-d \
-e PMA_ARBITRARY=1 \
-p 8080:80 \
phpmyadmin:5.2.1-apache


docker network create world-db