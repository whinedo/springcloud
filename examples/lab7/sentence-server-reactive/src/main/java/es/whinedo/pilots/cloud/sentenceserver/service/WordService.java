package es.whinedo.pilots.cloud.sentenceserver.service;

import es.whinedo.pilots.cloud.sentenceserver.domain.Word;
import rx.Observable;

public interface WordService {

	Observable<Word> getSubject();
	Observable<Word> getVerb();
	Observable<Word> getArticle();
	Observable<Word> getAdjective();
	Observable<Word> getNoun();	

}
