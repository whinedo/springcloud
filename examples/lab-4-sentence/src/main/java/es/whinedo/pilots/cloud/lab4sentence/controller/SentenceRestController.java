package es.whinedo.pilots.cloud.lab4sentence.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.net.URI;

@RestController
public class SentenceRestController {

	@Autowired
	private DiscoveryClient client;

	@RequestMapping("/sentence")
	public @ResponseBody String getSentence() 
	{
		//return getWord("LAB-4-SUBJECT") + " " + getWord("LAB-4-VERB") + " " + getWord("LAB-4-ARTICLE") + " "
     		//	 + getWord("LAB-4-ADJECTIVE") + " "+ getWord("LAB-4-NOUN") + ".";

		return getWord("lab-4-subject") + " " + getWord("LAB-4-VERB") + " " + getWord("LAB-4-ARTICLE") + " "
     			 + getWord("LAB-4-ADJECTIVE") + " "+ getWord("LAB-4-NOUN") + ".";
	}
  
	public String getWord(String service)
	{
		List<ServiceInstance> list = client.getInstances(service);
	
		System.out.println(client.getInstances(service));

		if (list != null && list.size() > 0 )
		{
			URI uri = list.get(0).getUri();

			if (uri !=null )
			{
				return (new RestTemplate()).getForObject(uri,String.class);
  			}
    		}
    		
		//return null;
		return "";
  	}

}
