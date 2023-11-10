package com.demo.codepipeline;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

    @GetMapping("/")
	public String index() {
		return "<h1>Running from ECS Cluster</h1>";
	}
    
}
