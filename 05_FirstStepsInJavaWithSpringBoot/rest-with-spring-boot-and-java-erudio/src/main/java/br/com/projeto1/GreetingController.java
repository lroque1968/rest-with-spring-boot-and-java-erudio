package br.com.projeto1;

/*
 	para testar a conexão
 	http://localhost:8080/greeting?name=Luis -- passando o parâmetro - name
 	http://localhost:8080/greeting				sem passar o parâmetro - utiliza o defaultValue - World

	Cada vez que a página é recarregada, incrementa o ID de Greeting
*/

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();			// gera um id do tipo Long
	
	@RequestMapping("/greeting")
	public Greeting greeting(
			@RequestParam(value = "name", defaultValue = "World")
			String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));		// incrementAndGet - incrementa o id
	}
}
