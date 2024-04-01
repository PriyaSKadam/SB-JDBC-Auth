package in.priya.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
	
	
	@GetMapping(value = "/admin")
	public String admin()
	{
		String str="<H1>Welcome Admin</H1>";
		return str;
	}
	
	@GetMapping(value = "/user")
	public String user()
	{
		String str="<H1>Welcome User</H1>";
		return str;
	}
	
	@GetMapping(value = "/")
	public String welcomeMsg()
	{
		String str="Welcome to AshokIT";
		return str;
	}

}
