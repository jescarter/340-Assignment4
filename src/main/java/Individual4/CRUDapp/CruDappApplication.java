package Individual4.CRUDapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses=CruDappApplication.class)
public class CruDappApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruDappApplication.class, args);
	}

}
