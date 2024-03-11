package com.spring.springboot.myFirstWebApp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class SayHelloController {

	//http://localhost:8080/say-Hello
	
	@RequestMapping("say-Hello")
	@ResponseBody
	public String sayHello() {
		return "Hello! What's up?";
	}
	@RequestMapping("say-Hello-html")
	@ResponseBody
	public String sayHelloHtml() {
		// very complex so use view instead of this
		StringBuilder sb = new StringBuilder();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>My first HTML page </title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("My first HTML page with body");
		sb.append("</body>");
		sb.append("</html>");
		return sb.toString();
		}
	// JSP --> One of the best view Technology
	@RequestMapping("say-Hello-jsp")
	public String sayHelloJsp() {
		return "sayHello";
	}
	
}
