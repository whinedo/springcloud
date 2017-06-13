package es.whinedo.pilots.cloud.lab1.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import es.whinedo.pilots.cloud.lab1.model.Player;

@RestResource(path="players",rel="player")
public interface IPlayerRepository extends CrudRepository<Player, Long>{
	
	List<Player> findAll();

}
