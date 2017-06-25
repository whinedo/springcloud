package es.whinedo.pilots.cloud.sentenceserver.dao;
import es.whinedo.pilots.cloud.sentenceserver.domain.Word;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@FeignClient("SUBJECT")
public interface SubjectClient {

	
	 @RequestMapping(value="/", method=RequestMethod.GET)
     public Word getWord();

}
