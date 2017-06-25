package es.whinedo.pilots.cloud.sentenceserver.domain;

import java.util.Map;
import java.util.TreeMap;

import es.whinedo.pilots.cloud.sentenceserver.domain.Role;

/**
 * Model of a Sentence, composed of Words.
 * 
 */
public class Sentence {

	// ordered by role so to make easier print the sentence
	private Map<Role,String> words = new TreeMap<>(); 
	
	public void add(Word word){
		words.put(word.getRole(),word.getWord());
	}
	
	@Override
	public String toString() {
	  StringBuilder sb = new StringBuilder();
	  for (Role role: words.keySet()){
		  sb.append(words.get(role)).append(' ');
	  }
	  return sb.toString();
	}
}
