package es.whinedo.pilots.cloud.sentenceserver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.whinedo.pilots.cloud.sentenceserver.dao.AdjectiveClient;
import es.whinedo.pilots.cloud.sentenceserver.dao.ArticleClient;
import es.whinedo.pilots.cloud.sentenceserver.dao.NounClient;
import es.whinedo.pilots.cloud.sentenceserver.dao.SubjectClient;
import es.whinedo.pilots.cloud.sentenceserver.dao.VerbClient;
import es.whinedo.pilots.cloud.sentenceserver.domain.Word;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class WordServiceImpl implements WordService {

	@Autowired VerbClient verbClient;
	@Autowired SubjectClient subjectClient;
	@Autowired ArticleClient articleClient;
	@Autowired AdjectiveClient adjectiveClient;
	@Autowired NounClient nounClient;
	
	
	@Override
	@HystrixCommand(fallbackMethod="getFallbackSubject")
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
	@HystrixCommand(fallbackMethod="getFallbackAdjective")
	public Word getAdjective() {
		return adjectiveClient.getWord();
	}
	
	@Override
	@HystrixCommand(fallbackMethod="getFallbackNoun")
	public Word getNoun() {
		return nounClient.getWord();
	}	


	public Word getFallbackSubject() {
		return new Word("Someone");
	}
	
	public Word getFallbackAdjective() {
		return new Word("");
	}
	
	public Word getFallbackNoun() {
		return new Word("something");
	}
}
