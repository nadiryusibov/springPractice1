package az.ingress.ms10_demo1.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Data
@Configuration
@ConfigurationProperties(prefix = "company")
public class BankConfig {
    @Value("${bank.name}")
    private String bankName;
    @Value("${bank.opened}")
    private Integer bankOpened;
    @Value("${bank.location}")
    private String bankLocation;
    @Value("${bank.head.office}")
    private String bankHeadOffice;
    private List<String> branches;
}
