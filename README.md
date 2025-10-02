# hello-api

## Test
``` bash
$ curl http://localhost:8080/hello | jq
  % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                                 Dload  Upload   Total   Spent    Left  Speed
100   113    0   113    0     0   6200      0 --:--:-- --:--:-- --:--:--  6277
{
  "timesptamp": 1759380628698,
  "message": "Hello, World!",
  "koreatime": "2025-10-02T13:50:28.698214+09:00[Asia/Seoul]"
}
```

# Build
```bash
$ ./gradlew clean bootJar
```


## Run
```bash
$ java -jar build/lib/hello-api-<VERSION>.jar
```

## Remote Run
```bash
# scp -i <KEY.pem> start.sh ubuntu@<SERVER_IP>:~/app/hello-api/

$  ssh -i <KEY.pem>  ubuntu@<SERVER_IP> "cd /home/ubuntu/app/hello-api;pwd;./start.sh"
/home/ubuntu/app/hello-api
```
