package vn.edu.iuh.fit.ktpm_20042961_dangthiquyentran;

import net.datafaker.Faker;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.embedded.netty.NettyWebServer;
import org.springframework.jms.core.JmsTemplate;
import vn.edu.iuh.fit.ktpm_20042961_dangthiquyentran.models.Product;
import vn.edu.iuh.fit.ktpm_20042961_dangthiquyentran.models.ProductOrder;
import vn.edu.iuh.fit.ktpm_20042961_dangthiquyentran.repositories.ProductRepository;
import vn.edu.iuh.fit.ktpm_20042961_dangthiquyentran.services.ConvertJson;
import vn.edu.iuh.fit.ktpm_20042961_dangthiquyentran.services.EncryptionText;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class Ktpm20042961DangThiQuyenTranApplicationTests {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private JmsTemplate jmsTemplate;
    @Test
    void contextLoads() {
        Faker faker = new Faker();
        for (int i = 0; i < 10; i++) {
            Product product = new Product();
            product.setName(faker.animal().name());
            product.setQuantity(faker.number().numberBetween(1,200));
            product.setPrice(faker.number().randomDouble(2,1000,1000000));
            product.setImage(faker.internet().image());
            productRepository.save(product);
        }
    }

    @Test
    void sendMessage(){
        jmsTemplate.convertAndSend("QuyenTran","lam ny tui nha");

    }
    @Test
    void testJsonEncrypt(){
        Product product = productRepository.findById((long) 1).get();
        Product product1 = productRepository.findById((long) 2).get();
        List<ProductOrder> productOrders = new ArrayList<>();
        ProductOrder productOrder = new ProductOrder();
        productOrder.setProduct(product);
        productOrder.setQuantity(100);
        productOrders.add(productOrder);

        ProductOrder productOrder1 = new ProductOrder();
        productOrder.setProduct(product1);
        productOrder.setQuantity(100);
        productOrders.add(productOrder1);

        ConvertJson convertJson = new ConvertJson();
        EncryptionText encryptionText = new EncryptionText();
        String json = convertJson.convertListObjectToJson(productOrders);
        System.out.println(json);
        jmsTemplate.convertAndSend("QuyenTran",encryptionText.enCrypt(json));

    }
}
