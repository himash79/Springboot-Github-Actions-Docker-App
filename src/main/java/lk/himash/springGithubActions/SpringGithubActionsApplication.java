package lk.himash.springGithubActions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringGithubActionsApplication {

	@GetMapping("/getMessage")
	public String getMessage() {
		return "Message Read Successsfully...!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringGithubActionsApplication.class, args);
	}

}
