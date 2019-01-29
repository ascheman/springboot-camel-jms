package net.aschemann.demo.springboot.jmsconsumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.TextMessage;

@Component
@Slf4j
public class JmsConsumer {

    @JmsListener(destination = "foo")
    public void jmsConsumer(TextMessage message) {
        log.info("Received '{}'", message);
    }
}
