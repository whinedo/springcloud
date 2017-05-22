package es.whinedo.pilots.cloud.lab1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

	@RequestMapping("/")
	public String hi()
	{
		return "hello";
	}
}
