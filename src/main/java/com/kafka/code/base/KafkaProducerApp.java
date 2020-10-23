package com.kafka.code.base;

import java.util.Properties;

//import KafkaProducer packages
import org.apache.kafka.clients.producer.KafkaProducer;

//import ProducerRecord packages
import org.apache.kafka.clients.producer.ProducerRecord;


public class KafkaProducerApp {
    private static final String topic = "fooTopic";

    public static void main(String[] args) {
        Properties props = new Properties();
        props.put("bootstrap.servers","localhost:9092");
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

        try (KafkaProducer<String, String> producer = new KafkaProducer(props)) {
            int counter = 0;

            while (counter <= 100) {
                String msg = "Message " + counter;
                //Use key if you want all the messages to go to a single partition
                ProducerRecord<String, String> message1 = new ProducerRecord<>(topic, msg);
                producer.send(message1);
                counter++;
            }

        } catch (Exception e) {
            System.out.println("Failed to send message by the producer");
        }
    }
}
