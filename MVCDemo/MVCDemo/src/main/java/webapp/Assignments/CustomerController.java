package webapp.Assignments;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CustomerController {
  @RequestMapping(value = "/customerregistration", method = RequestMethod.GET)
  public String registration(@ModelAttribute("customerregistration") Customer customerregistration) {

   return "customerregistration";
  }

 @RequestMapping(value = "/customerregistration", method = RequestMethod.POST)
  public String registrationHandle(@Valid @ModelAttribute("customerregistration") Customer customerregistration,
      BindingResult result) {



   if (result.hasErrors()) {
      return "customerregistration";
    }
    return "success";
  }
}
