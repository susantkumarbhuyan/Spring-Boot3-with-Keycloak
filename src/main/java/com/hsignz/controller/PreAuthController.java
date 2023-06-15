package com.hsignz.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/preauth")
public class PreAuthController {
//	@RolesAllowed(value = { "teamlead", "manager" })
	@PreAuthorize("hasPermission('null', 'teamlead,manager')")
	@GetMapping("/create")
	public String create() {
		return "Success - create";
	}

	// @RolesAllowed(value = { "manager" })
	@PreAuthorize("hasPermission('null','manager')")
	@GetMapping("/delete")
	public String delete() {
		return "Success - delete";
	}

	// @RolesAllowed(value = { "teamlead", "manager", "senior" })
	@PreAuthorize("hasPermission(#username, 'preferred_username','teamlead,manager,senior')")
	@GetMapping("/modify")
	public String modify(String username) {
		return "Success - modify";
	}

	@GetMapping("/api/view")
	public String view() {
		return "Success - view";
	}
}
