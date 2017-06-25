package es.whinedo.pilots.cloud.sentenceserver.service;


import java.util.concurrent.Executor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import es.whinedo.pilots.cloud.sentenceserver.dao.AdjectiveClient;
import es.whinedo.pilots.cloud.sentenceserver.dao.ArticleClient;
import es.whinedo.pilots.cloud.sentenceserver.dao.NounClient;
import es.whinedo.pilots.cloud.sentenceserver.dao.SubjectClient;
import es.whinedo.pilots.cloud.sentenceserver.dao.VerbClient;
import es.whinedo.pilots.cloud.sentenceserver.domain.Word;
import es.whinedo.pilots.cloud.sentenceserver.domain.Role;
import rx.Observable;
import rx.schedulers.Schedulers;

@Service
public class WordServiceImpl implements WordService {

	@Autowired 
	private VerbClient verbClient;
	
	@Autowired 
	private SubjectClient subjectClient;
	
	@Autowired 
	private ArticleClient articleClient;
	
	@Autowired 
	private AdjectiveClient adjectiveClient;
	
	@Autowired 
	private NounClient nounClient;
	
	@Autowired 
	private Executor executor;	//	Source of threads
	
	
	@Override
	@HystrixCommand(fallbackMethod="getFallbackSubject")
	public Observable<Word> getSubject() {
		//	This 'reactive' observable is backed by a regular Java Callable, which can run in a different thread:
		return Observable.fromCallable(
			() ->  new Word (subjectClient.getWord().getWord(), Role.subject)
		).subscribeOn(Schedulers.from(executor));
	}
	
	@Override
	@HystrixCommand(fallbackMethod="getFallbackVerb")
	public Observable<Word> getVerb() {
		return Observable.fromCallable(
			() ->  new Word (verbClient.getWord().getWord(), Role.verb)
		).subscribeOn(Schedulers.from(executor));
	}
	
	@Override
	@HystrixCommand(fallbackMethod="getFallbackArticle")
	public Observable<Word> getArticle() {
		return Observable.fromCallable(
			() ->  new Word (articleClient.getWord().getWord(), Role.article)
		).subscribeOn(Schedulers.from(executor));
	}
	
	@Override
	@HystrixCommand(fallbackMethod="getFallbackAdjective")
	public Observable<Word> getAdjective() {
		return Observable.fromCallable(
			() ->  new Word (adjectiveClient.getWord().getWord(), Role.adjective)
		).subscribeOn(Schedulers.from(executor));
	}
	
	@Override
	@HystrixCommand(fallbackMethod="getFallbackNoun")
	public Observable<Word> getNoun() {
		return Observable.fromCallable(
			() ->  new Word (nounClient.getWord().getWord(), Role.noun)
		).subscribeOn(Schedulers.from(executor));
	}	
	
	
	
	public Word getFallbackSubject() {
		return new Word("Someone", Role.subject);
	}
	
	public Word getFallbackVerb() {
		return new Word("does", Role.verb);
	}
	
	public Word getFallbackArticle() {
		return new Word("", Role.article);
	}
	
	public Word getFallbackAdjective() {
		return new Word("", Role.adjective);
	}
	
	public Word getFallbackNoun() {
		return new Word("something", Role.noun);
	}

}
