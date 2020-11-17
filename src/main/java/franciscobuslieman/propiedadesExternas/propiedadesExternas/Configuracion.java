package franciscobuslieman.propiedadesExternas.propiedadesExternas;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.PlaceholderConfigurerSupport;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:datasource.properties")
public class Configuracion {

    @Value("${francisco.user}")
    String user;

    @Value("${francisco.password}")
    String password;

    @Bean
    UserPassword userPassword(){
        UserPassword userPassword = new UserPassword();
        userPassword.setUser(user);
        userPassword.setPassword(password);
        return userPassword;
    }


   public static PropertySourcesPlaceholderConfigurer properties(){
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }
}
