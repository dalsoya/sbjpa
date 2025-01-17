package com.example.sbjpa.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

	@GetMapping({ "/", "" })
	public String index() {
		return "index";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@GetMapping("/signup")
	public String signup() {
		return "signup";
	}

	@GetMapping("/post/create")
	public String post_create() {
		return "/post/create";
	}

	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("principal");

		return "redirect:/";
	}

	@GetMapping("/post/{id}")
	public String post() {
		return "/post/detail";
	}

}
