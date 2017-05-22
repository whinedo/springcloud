package es.whinedo.pilots.cloud.lab1.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import es.whinedo.pilots.cloud.lab1.model.Team;

public interface ITeamRepository extends CrudRepository<Team, Long>{
	
	List<Team> findAll();

}
