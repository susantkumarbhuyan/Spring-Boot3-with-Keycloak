package com.hsignz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.security.RolesAllowed;

@RestController
@RequestMapping("/demo")
public class DemoController {
	@RolesAllowed(value = { "teamlead", "manager" })
	@GetMapping("/create")
	public String create() {
		return "Success - create";
	}

	@RolesAllowed(value = { "manager" })
	@GetMapping("/delete")
	public String delete() {
		return "Success - delete";
	}

	@RolesAllowed(value = { "teamlead", "manager", "senior" })
	@GetMapping("/modify")
	public String modify() {
		return "Success - modify";
	}

	@GetMapping("/view")
	public String view() {
		return "Success - view";
	}
}
