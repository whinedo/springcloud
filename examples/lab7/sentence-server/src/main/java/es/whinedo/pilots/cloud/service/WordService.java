package es.whinedo.pilots.cloud.service;

import es.whinedo.pilots.cloud.domain.Word;

public interface WordService {

	Word getSubject();
	Word getVerb();
	Word getArticle();
	Word getAdjective();
	Word getNoun();
	
}
