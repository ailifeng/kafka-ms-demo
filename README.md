#### instructions 
```
# send message via rest api
http://localhost:8080/greetings?message=ai

# send message via kafka-console-producer
kafka-console-producer --broker-list pg1:9092 --topic greetings

# sample message
{"timestamp":1580385464696,"message":"ai"}
```

#### class introduction
```
Greetings - Message Class
GreetingsController - REST API Controller
GreetingsLister - StreamListener Class
GreetingsService - Service Layer to write message to Kafka
GreetingsStreams - InBound and OutBound Channel
StreamKafkaApplciation - application class
StreamsConfig - Stream configuration class
```

