package az.ingress.ms10_demo1.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Map;

@Data
@Configuration
@ConfigurationProperties(prefix = "bank")
public class BankConfig2 {
    private String name;
    private Integer opened;
    private String location;
    private String headoffice;
//    private List<String> branches;

    // Contact classini include edek bu classa

    private List<Contact> contacts;
    private Map<String,String> address;
    private Map<Integer,Branch> branchess;
}
