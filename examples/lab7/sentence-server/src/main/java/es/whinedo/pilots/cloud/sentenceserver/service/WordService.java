package es.whinedo.pilots.cloud.sentenceserver.service;

import es.whinedo.pilots.cloud.sentenceserver.domain.Word;

public interface WordService {

	Word getSubject();
	Word getVerb();
	Word getArticle();
	Word getAdjective();
	Word getNoun();
	
}
