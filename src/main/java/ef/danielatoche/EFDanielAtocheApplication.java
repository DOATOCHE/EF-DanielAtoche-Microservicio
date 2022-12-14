package ef.danielatoche;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class EFDanielAtocheApplication {

	public static void main(String[] args) {
		SpringApplication.run(EFDanielAtocheApplication.class, args);
	}

}
