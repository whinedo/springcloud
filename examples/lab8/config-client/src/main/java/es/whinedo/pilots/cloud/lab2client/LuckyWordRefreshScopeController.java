package es.whinedo.pilots.cloud.lab2client;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.beans.factory.annotation.Value;

@RestController
@RefreshScope
public class LuckyWordRefreshScopeController{


	@Value("${wordConfig.lucky-word}") 
	private String luckyWord;

	@Value("${wordConfig.preamble}") 
	private String preamble;

	@RequestMapping("/scope/lucky-word")
	public String showLuckyWord() {
		return preamble + ": " + luckyWord;
	}

	
}
