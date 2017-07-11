package es.whinedo.pilots.cloud.lab9;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SentenceController {

	@RequestMapping("/")
	public String sentence() {
		return "sentence";
	}
}
