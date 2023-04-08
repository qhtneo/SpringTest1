package com.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class maincontroller {

	@GetMapping("/")
	public String index() {
		return "index"; //template 폴더에 있는 html 파일 이름
	}
}
