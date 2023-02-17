docker run -d --name polar-postgres --net catalog-network -e POSTGRES_USER=user -e POSTGRES_PASSWORD=password -e POSTGRES_DB=polardb_catalog -p 5432:5432 postgres:14.4

docker run -d --name catalog-service --net catalog-network -p 9001:9001 -e SPRING_DATASOURCE_URL=jdbc:postgresql://polar-postgres:5432/polardb_catalog -e SPRING_CLOUD_CONFIG_URI=http://host.docker.internal:8888 -e SPRING_PROFILES_ACTIVE=testdata catalog-service

gradlew bootBuildImage --imageName ghcr.io/olegc12h/catalog-service --publishImage -PregistryUrl=ghcr.io -PregistryName=OlegC12h -PregistryToken=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