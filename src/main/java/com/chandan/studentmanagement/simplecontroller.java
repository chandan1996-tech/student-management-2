package com.chandan.studentmanagement;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class simplecontroller {
	@GetMapping("/add")
	String add() {
		return "Chandan";
	}

}
