package es.whinedo.pilots.cloud.lab1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Team {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	private String location;
	
	private String mascotte;
	

	public Team() {
		super();
	}

	public Team(Long id, String name, String location, String mascotte) {
		this();
		this.id = id;
		this.name = name;
		this.location = location;
		this.mascotte = mascotte;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getMascotte() {
		return mascotte;
	}

	public void setMascotte(String mascotte) {
		this.mascotte = mascotte;
	}
	
	

}
