package es.whinedo.pilots.cloud.lab1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import es.whinedo.pilots.cloud.lab1.model.Player;
import es.whinedo.pilots.cloud.lab1.model.Team;
import es.whinedo.pilots.cloud.lab1.repositories.ITeamRepository;

@SpringBootApplication
public class Lab1Application {

	@Autowired
	private ITeamRepository teamRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(Lab1Application.class, args);
	}
	
	@PostConstruct
	public void init() {
		List<Team> list = new ArrayList<>();

	  	Set<Player> set = new HashSet<>();
	  	set.add(new Player("Big Easy", "Showman"));
	  	set.add(new Player("Buckets", "Guard"));
	  	set.add(new Player("Dizzy", "Guard"));
	  	
	  	list.add(new Team("Harlem", "Globetrotters", set));
	  	list.add(new Team("Washington","Generals",null));

	  	teamRepository.save(list);
	  }   
}
