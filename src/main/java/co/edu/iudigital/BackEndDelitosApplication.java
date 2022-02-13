package co.edu.iudigital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;


@SpringBootApplication
@EnableAsync
public class BackEndDelitosApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackEndDelitosApplication.class, args);
	}

}
