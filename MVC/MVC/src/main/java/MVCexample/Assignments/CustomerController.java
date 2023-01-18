package MVCexample.Assignments;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * TODO suschint This type ...
 *
 */
@Controller
public class CustomerController {
  @RequestMapping(value = "/customerRegistration", method = RequestMethod.GET)
  public String registration(@ModelAttribute("customerRegistration") Customer customerRegistration) {

    return "customerRegistration";
  }

  @RequestMapping(value = "/customerRegistration", method = RequestMethod.POST)
  public String registrationHandle(@Valid @ModelAttribute("customerRegistration") Customer customerRegistration,
      BindingResult result) {

    if (result.hasErrors()) {
      return "customerRegistration";
    }
    return "success";
  }
}
