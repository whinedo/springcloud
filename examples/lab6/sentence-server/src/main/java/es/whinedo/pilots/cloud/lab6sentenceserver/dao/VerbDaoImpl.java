package es.whinedo.pilots.cloud.lab6sentenceserver.dao;


import org.springframework.stereotype.Component;

@Component("verbService")
public class VerbDaoImpl extends WordDaoImpl {

	@Override
	public String getPartOfSpeech() {
		return VERB;
	}

	
}
