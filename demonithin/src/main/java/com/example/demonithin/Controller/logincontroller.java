package com.example.demonithin.Controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller



public class logincontroller {
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String loginpage() {
		return "login";
		
	}
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String welcomenpage(ModelMap model,@RequestParam String Email,@RequestParam String Password) {
		if(Email.equals("admin") && Password.equals("root")) {
		return "welcome";
		
	}
	model.put("errormsg","incorrect passwod");
	  return "login";

	
		
	

}
}
	


