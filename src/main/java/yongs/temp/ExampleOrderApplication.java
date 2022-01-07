package yongs.temp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ExampleOrderApplication {
 
	public static void main(String[] args) {
		SpringApplication.run(ExampleOrderApplication.class, args);
	}
	@GetMapping("/")
    public String home() throws Exception {
        return "Hello, example-order";
    }
}