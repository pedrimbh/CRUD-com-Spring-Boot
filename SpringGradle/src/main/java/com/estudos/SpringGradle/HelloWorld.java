package com.estudos.SpringGradle;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

@RestController
@RequestMapping("/")
public class HelloWorld {

		@GetMapping
		public String sayHello() {
			return "Hello guys";
		}
		
		@PostMapping("/post")
		public String helloPost(@RequestBody Map<String, Object> payload) {
			return payload.get("name").toString();
			
		}
		
		
		
		
		
		@GetMapping("/second")
		@ResponseBody
		@ResponseStatus( code =HttpStatus.NO_CONTENT)
		//public String secondFun(@RequestParam("name") String name) {
		public String secondFun(@RequestParam(value = "name", required = false) String name) {
			
				return "Subpath " + name;

		}
		
//		@GetMapping("/second")
//		//public String secondFun(@RequestParam("name") String name) {
//		public String secondFun(final WebRequest webrequest) {
//			String name = webrequest.getParameter("name"); 
//			if(name != null) {
//				return "Subpath " + name;
//
//			}
//			return "Subpath " ;
//
//		}
}
