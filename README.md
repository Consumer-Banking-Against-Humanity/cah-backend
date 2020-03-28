# cah-backend

## Build Image
```
./build-image.sh
```

### Build and Run Image
```
./run-image.sh
```

### Build and run with docker
```
./run-docker.sh
```

### Test the Application
Use any online websocket client such as [this one](https://output.jsbin.com/fatenun), use the following as the endpoint:
```
http://localhost:8080/ws/chat/{topic}/{username}
```
CONNECT, SEND messages, and CLOSE!
