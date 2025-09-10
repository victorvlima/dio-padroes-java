package br.com.dio.projeto.padroes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

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
//@ComponentScan(basePackages = {"br.com.dio.projeto.padroes"})
public class DioPadroesJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DioPadroesJavaApplication.class, args);
	}

}
