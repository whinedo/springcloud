package es.whinedo.pilots.cloud.lab6sentenserver.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import es.whinedo.pilots.cloud.lab6sentenceserver.dao.AdjectiveDaoImpl;
import es.whinedo.pilots.cloud.lab6sentenceserver.dao.ArticleDaoImpl;
import es.whinedo.pilots.cloud.lab6sentenceserver.dao.NounClient;
import es.whinedo.pilots.cloud.lab6sentenceserver.dao.SubjectDaoImpl;
import es.whinedo.pilots.cloud.lab6sentenceserver.dao.VerbDaoImpl;
import es.whinedo.pilots.cloud.lab6sentenceserver.dao.WordDao;
import es.whinedo.pilots.cloud.lab6sentenceserver.domain.Word;
import es.whinedo.pilots.cloud.lab6sentenceserver.service.SentenceServiceImpl;

public class SentenceServiceImplTest {

	//	Class under test:
	private SentenceServiceImpl service;
	
	@Before
	public void setup() {

		service = new SentenceServiceImpl();
		
		//	Establish Mock Dependencies:
		WordDao subject = Mockito.mock(SubjectDaoImpl.class);
		WordDao verb = Mockito.mock(VerbDaoImpl.class);
		WordDao article = Mockito.mock(ArticleDaoImpl.class);
		WordDao adjective = Mockito.mock(AdjectiveDaoImpl.class);
		NounClient noun = Mockito.mock(NounClient.class);

		service.setSubjectService(subject);
		service.setVerbService(verb);
		service.setArticleService(article);
		service.setAdjectiveService(adjective);
		service.setNounService(noun);
		
		//	Describe Mock Behaviors:
		Mockito.when(subject.getWord()).thenReturn(new Word("1"));
		Mockito.when(verb.getWord())	.thenReturn(new Word("2"));
		Mockito.when(article.getWord())	.thenReturn(new Word("3"));
		Mockito.when(adjective.getWord()).thenReturn(new Word("4"));
		Mockito.when(noun.getWord())	.thenReturn(new Word("5"));
	}
	
	@Test
	public void test() {
		//	We should get the sentence built in the correct order:
		Assert.assertEquals("1 2 3 4 5.", service.buildSentence());
	}

}
