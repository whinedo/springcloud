package es.whinedo.pilots.cloud.dao;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import es.whinedo.pilots.cloud.domain.Word;

@FeignClient("NOUN")
public interface NounClient {

	
	 @RequestMapping(value="/", method=RequestMethod.GET)
     public Word getWord();

}
