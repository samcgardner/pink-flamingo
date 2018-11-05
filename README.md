#Pink Flamingo
A web service implementing Pink Flamingo FizzBuzz. 

#Building
This is a standard gradle project, and all the usual suspect commands work.
A small wrapper around the Dockerfile, `build-docker-image.sh`, is provided
which simply ensures that a copyable JAR has been built. It's perfectly
safe to call `docker build` directly as long as you ensure this happens first.

#Example Usage
Unless configured otherwise using a non-empty config.yml, the service will sit on 8080. Thus we can build and run
a docker container to demonstrate with as follows.

```bash
./gradlew shadowJar
docker build -t pink-flamingo .
docker run -p 8080:8080 pink-flamingo
```

We can then test the service by, for example...

```bash
curl -X GET 'http://localhost:8080?from=0&to=10'
["Pink Flamingo","Flamingo","Flamingo","Flamingo","4","Flamingo","Fizz","7","Flamingo","Fizz"]
```