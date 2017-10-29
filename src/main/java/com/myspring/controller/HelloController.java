package com.myspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myspring.model.Article;
import com.myspring.model.HelloLog;
import com.myspring.service.IHelloService;

@Controller
@RequestMapping("rest")
public class HelloController {

	@Autowired
	IHelloService helloService;
	
	@GetMapping("helloList/{id}/{name}")
	public ResponseEntity<List<HelloLog>> getArticleByIdName(@PathVariable("id") Long id,
			@PathVariable("name") String name) {
		List<HelloLog> list = helloService.findByAVeryComplicatedQuery(id, name);
		return new ResponseEntity<List<HelloLog>>(list, HttpStatus.OK);
	}
	
	@GetMapping("helloList")
	public ResponseEntity<List<HelloLog>> getAllHelloLog() {
		List<HelloLog> list = helloService.getAll();
		return new ResponseEntity<List<HelloLog>>(list, HttpStatus.OK);
	}
}
