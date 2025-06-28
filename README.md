🧩 Apache Kafka – Local Setup & Commands (Windows)
🚀 Kafka Setup Instructions (Windows)

✅ 1. Start ZooKeeper

.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

✅ 2. Start Kafka Broker (Server)

.\bin\windows\kafka-server-start.bat .\config\server.properties

📦 Kafka Topic Management
🎯 Create a Kafka Topic

.\bin\windows\kafka-topics.bat --create --bootstrap-server localhost:9092 --topic nntechie-topic --partitions 4 --replication-factor 1

📜 List All Topics

.\bin\windows\kafka-topics.bat --list --bootstrap-server localhost:9092

🔍 Describe a Topic

.\bin\windows\kafka-topics.bat --describe --bootstrap-server localhost:9092 --topic nntechie-topic

💬 Kafka Console Utilities

.\bin\windows\kafka-console-producer.bat --broker-list localhost:9092 --topic nntechie-topic

📥 Start Kafka Console Consumer

.\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic nntechie-topic --from-beginning --group ms-group-01


