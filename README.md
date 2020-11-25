# KafkaSpringPubSub
Spring Kafka Pub Sub Example
A Kafka server, a Kafka broker and a Kafka node are same.

Use .sh instead of .cmd and .bat in mac.

# Setup envirnment variable for zookeeper bin dir
# Start Zookeeper
zkserver

# To start kafka
cd C:\Workplace\kafka

.\bin\windows\kafka-server-start.bat .\config\server.properties

# To create topic
cd C:\Workplace\kafka\bin\windows

kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic test

# To Create Producer
cd C:\Workplace\kafka\bin\windows

kafka-console-producer.bat --broker-list localhost:9092 --topic test

# To create kafka Consumer
cd C:\Workplace\kafka\bin\windows

kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic test

# Using Producer Console
{"name":"b", "salary":1000} 

# To Stop Kafka
cd C:\Workplace\kafka\bin\windows

kafka-server-stop.bat 

zookeeper-server-stop.bat
