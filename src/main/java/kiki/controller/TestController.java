package kiki.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class TestController {
	
	private static final Logger log = LoggerFactory.getLogger(TestController.class);

	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String home() {
		return "This is home";
	}
	
	@ResponseBody
	@RequestMapping(value="/homeTest", method=RequestMethod.GET)
	public String homeTest() {
		String value = "Test webhook test again...!!";
		return value;
	}
	
	@GetMapping("/liveness")
	public String liveness() {
		log.info("liveness check");
		return "OK";
	}
	@GetMapping("/readiness")
	public String readyness() {
		log.info("readiness check");
		return "OK";
	}

	
}
