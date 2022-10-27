package win.doyto.query.demo;

import lombok.Generated;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcOperations;
import win.doyto.query.core.DataQueryClient;
import win.doyto.query.jdbc.JdbcDataQueryClient;
import win.doyto.query.web.WebMvcConfigurerAdapter;

@SpringBootApplication
public class DoytoQueryDemoApplication extends WebMvcConfigurerAdapter {

    @Generated
    public static void main(String[] args) {
        SpringApplication.run(DoytoQueryDemoApplication.class, args);
    }


    @Bean
    public DataQueryClient userQueryZClient(JdbcOperations jdbcOperations) {
        return new JdbcDataQueryClient(jdbcOperations);
    }
}
