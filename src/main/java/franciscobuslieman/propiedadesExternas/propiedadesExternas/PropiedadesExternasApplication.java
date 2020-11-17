package franciscobuslieman.propiedadesExternas.propiedadesExternas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PropiedadesExternasApplication {

	public static void main(String[] args) {


		ApplicationContext ctx = SpringApplication.run(PropiedadesExternasApplication.class, args);

		UserPassword userPassword = (UserPassword)ctx.getBean("userPassword");

		System.out.println(userPassword.getUser());
		System.out.println(userPassword.getPassword());
	}

}
