package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController {

	@ModelAttribute
	public ManagerAccount setUpForm() {
		return new ManagerAccount();
	}

	@RequestMapping("/login")
	public String result(@Validated ManagerAccount account, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			return "index";
		}

		String loginID = account.getLoginID();
		String password = account.getPassword();
		model.addAttribute("loginID", loginID);
		model.addAttribute("password", password);

		return "index";
	}

}
