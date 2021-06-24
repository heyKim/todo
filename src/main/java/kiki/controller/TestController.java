package kiki.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String home() {
		return "This is home";
	}
	
	@ResponseBody
	@RequestMapping(value="/homeTest", method=RequestMethod.GET)
	public String homeTest() {
		String value = "Test_prd!";
		return value;
	}
	
}
