package es.whinedo.pilots.cloud.lab1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Player {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	private String position;
	
	

	public Player() {
		super();
	}

	public Player(Long id, String name, String position) {
		this();
		this.id = id;
		this.name = name;
		this.position = position;
	}
	
	public Player(String name, String position) {
		this();
		this.name = name;
		this.position = position;
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

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}



}
