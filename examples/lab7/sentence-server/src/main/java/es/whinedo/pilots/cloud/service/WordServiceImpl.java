package es.whinedo.pilots.cloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.whinedo.pilots.cloud.dao.AdjectiveClient;
import es.whinedo.pilots.cloud.dao.ArticleClient;
import es.whinedo.pilots.cloud.dao.NounClient;
import es.whinedo.pilots.cloud.dao.SubjectClient;
import es.whinedo.pilots.cloud.dao.VerbClient;
import es.whinedo.pilots.cloud.domain.Word;

@Service
public class WordServiceImpl implements WordService {

	@Autowired VerbClient verbClient;
	@Autowired SubjectClient subjectClient;
	@Autowired ArticleClient articleClient;
	@Autowired AdjectiveClient adjectiveClient;
	@Autowired NounClient nounClient;
	
	
	@Override
	public Word getSubject() {
		return subjectClient.getWord();
	}
	
	@Override
	public Word getVerb() {
		return verbClient.getWord();
	}
	
	@Override
	public Word getArticle() {
		return articleClient.getWord();
	}
	
	@Override
	public Word getAdjective() {
		return adjectiveClient.getWord();
	}
	
	@Override
	public Word getNoun() {
		return nounClient.getWord();
	}	
}
