import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/entrega")
public class entrega {
	
		
		@GetMapping
		public String hello () {
			return "Hello World! Seja Bem Vindos ao spring!";
		}
	

@GetMapping	

public String objetivo () {
	return "Terminar o curso e conseguir um trabalho para poder dar o melhor para minha familia";
	
}

@GetMapping
public String Bsm() {
	return "Mentalidade de crescimento, Orientação a Objeto, ";
	
}

}