package es.whinedo.pilots.cloud.lab1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.whinedo.pilots.cloud.lab1.model.Team;
import es.whinedo.pilots.cloud.lab1.repositories.ITeamRepository;

@RestController
public class RestFulController {

	
	@Autowired
	private ITeamRepository teamRepository;
	
	@RequestMapping("/teams")
	public List<Team> getTeams()
	{
		return teamRepository.findAll();
	}
	
	@RequestMapping("/teams/{id}")
	public Team getTeam(@PathVariable("id") String id)
	{
		return teamRepository.findOne(Long.valueOf(id));
	}
	
	
}
