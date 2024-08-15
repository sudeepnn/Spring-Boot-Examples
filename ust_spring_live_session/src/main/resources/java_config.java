package main.resources;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "ust_spring_live_session")
@PropertySource("classpath:data.properties")
public class java_config {

}
