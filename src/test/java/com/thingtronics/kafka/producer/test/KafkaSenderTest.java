package com.thingtronics.kafka.producer.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.thingtronics.kafka.producer.Sender;

@RunWith(SpringRunner.class)
@SpringBootTest
@DirtiesContext
public class KafkaSenderTest {
	private static final String HELLOWORLD_TOPIC = "test";

	  @Autowired
	  private Sender sender;

	  @Test
	  public void testSend() throws Exception {
	    sender.send(HELLOWORLD_TOPIC, "hi hello thingtronics!");

	  }
}