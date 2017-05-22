package es.whinedo.pilots.cloud.lab1.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import es.whinedo.pilots.cloud.lab1.model.Team;

@RestResource(path="teams",rel="team")
public interface ITeamRepository extends CrudRepository<Team, Long>{
	
	List<Team> findAll();

}
