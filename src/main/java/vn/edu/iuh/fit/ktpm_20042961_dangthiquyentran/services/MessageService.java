package vn.edu.iuh.fit.ktpm_20042961_dangthiquyentran.services;

import jakarta.jms.JMSException;
import jakarta.jms.Message;
import jakarta.jms.TextMessage;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageService {
        @JmsListener(destination = "QuyenTran")
    public void receiveMessage(final Message jsonMessage) throws JMSException {
        String messageData = null;
        String response = null;
        if (jsonMessage instanceof TextMessage) {
            System.out.println(((TextMessage) jsonMessage).getText());
            //1. read message data
            //2. ==> decode
            //3. check for quantity
            //4. make order or reject
            //5. send email
        }
    }
}
