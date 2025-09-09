package br.com.dio.projeto.padroes.dio_padroes_java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto Spring Boot gerado via Spring Initializr no VS Code.
 * Os seguintes módulos foram selecionados:
 * - Spring Data JPA
 * - Spring Web
 * - H2 Database
 * - OpenFeign
 * 
 * @author victorvlima
 */
@EnableFeignClients
@SpringBootApplication
public class DioPadroesJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DioPadroesJavaApplication.class, args);
	}

}
