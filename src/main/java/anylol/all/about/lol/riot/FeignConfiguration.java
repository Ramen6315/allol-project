package anylol.all.about.lol.riot;


import feign.Retryer;
import org.springframework.context.annotation.Bean;

public class FeignConfiguration {
    @Bean
    public Retryer retryer() {
        return new Retryer.Default(1500, 2000, 2);
    }
}
