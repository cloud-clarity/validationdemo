package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
@SpringBootApplication
public class ValidationdemoApplication {


	@GetMapping("/")
	public ModelAndView getForm() {
		return new ModelAndView("form")
				.addObject("shoe", new Shoe(Type.Toffla.toString(), new Integer(43)))
				.addObject("types", Type.values());
	}


	// testar validering
	@PutMapping("submit")
	public ModelAndView put(@Valid Shoe shoe, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			return new ModelAndView("form")
					.addObject(shoe)
					.addObject("types", Type.values());
		}

		return new ModelAndView("result")
				.addObject(shoe);
	}





	public static void main(String[] args) {
		SpringApplication.run(ValidationdemoApplication.class, args);
	}
}
