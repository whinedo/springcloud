package es.whinedo.pilots.cloud.lab2client;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.context.properties.ConfigurationProperties;

@RestController

@ConfigurationProperties(prefix="wordConfig")
public class LuckyWordController {

	private String luckyWord;
	private String preamble;

	@RequestMapping("/lucky-word")
	public String showLuckyWord() {
		return preamble + ": " + luckyWord;
	}

	public String getLuckyWord() {
		return luckyWord;
	}

	public void setLuckyWord(String luckyWord) {
		this.luckyWord = luckyWord;
	}

	public String getPreamble() {
		return preamble;
	}

	public void setPreamble(String preamble) {
		this.preamble = preamble;
	}
	
}
