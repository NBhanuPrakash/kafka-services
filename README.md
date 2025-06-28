1. Start ZooKeeper
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
2. Start Kafka Broker (Server)
.\bin\windows\kafka-server-start.bat .\config\server.properties
3. Create a Kafka Topic
.\bin\windows\kafka-topics.bat --create --bootstrap-server localhost:9092 --topic nntechie-topic --partitions 4 --replication-factor 1
4. List All Topics
.\bin\windows\kafka-topics.bat --list --bootstrap-server localhost:9092
5. Describe a Topic
.\bin\windows\kafka-topics.bat --describe --bootstrap-server localhost:9092 --topic nntechie-topic
6. Start Kafka Console Producer
.\bin\windows\kafka-console-producer.bat --broker-list localhost:9092 --topic nntechie-topic
7. Start Kafka Console Consumer
.\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic nntechie-topic --from-beginning --group ms-group-01


