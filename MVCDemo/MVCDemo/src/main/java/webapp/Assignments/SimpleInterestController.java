package webapp.Assignments;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class SimpleInterestController {

@RequestMapping(value = "/interest", method = RequestMethod.GET)

	public String sayHello1() {

	 return "interest";
}

 @RequestMapping(value = "/interest", method = RequestMethod.POST)
	 public String simple(ModelMap model, @RequestParam int PA, @RequestParam int RATE, @RequestParam int TIME) 
	 {

	 double si = (PA * RATE * TIME) / 100;
	 model.addAttribute("simpleinterest" ,si);
	 return "simpleInterest";
	 }
}
	 
