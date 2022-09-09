package lk.himash.springGithubActions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringGithubActionsApplication {
	
	private final static Logger log = LoggerFactory.getLogger(SpringGithubActionsApplication.class);

	@GetMapping("/getMessage")
	public String getMessage() {
		log.info("Application start successfully...!");
		return "Message Read Successsfully...!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringGithubActionsApplication.class, args);
	}

}
