package dio.padroes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class DioPadroesProjetosSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(DioPadroesProjetosSpringApplication.class, args);
	}

}
