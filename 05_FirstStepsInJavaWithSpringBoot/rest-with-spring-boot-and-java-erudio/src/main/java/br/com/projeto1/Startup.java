package br.com.projeto1;

/*
  	Primeira parte do projeto do curso 2 de Java com Rest.
  	Montagem do projeto com Spring Starter Project.
  	
  	Teste da conexão com o localhost:8080/greeting
  						 e localhost:8080/greeting?name=luis
  						 
  	Projeto salvo no Git
  	
  	Continua no projeto Calculadora.
*/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Startup {

	public static void main(String[] args) {
		SpringApplication.run(Startup.class, args);
	}

}
