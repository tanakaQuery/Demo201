package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MainController {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@RequestMapping(path = "/sample", method = RequestMethod.GET)
	public ModelAndView fetch(ModelAndView mav) {
		List<HouseData> houseList = jdbcTemplate.query("SELECT * FROM houses", new HouseMapper());
		List<InquiryData> inquiryList = jdbcTemplate.query("SELECT * FROM inquiries", new InquiryMapper());
		List<String> buyerList = jdbcTemplate.query("SELECT * FROM buyers", new BuyerMapper());
		List<SellerData> sellerList = jdbcTemplate.query("SELECT * FROM sellers", new SellerMapper());

		mav.setViewName("home");
		mav.addObject("houseList", houseList);
		mav.addObject("inquiryList", inquiryList);
		mav.addObject("buyerList", buyerList);
		mav.addObject("sellerList", sellerList);

		return mav;
	}

	@RequestMapping(path = "/delete", method = RequestMethod.POST)
	public ModelAndView delete(@RequestParam(value="id", required=true)int id, ModelAndView mav) {
		jdbcTemplate.update("DELETE FROM houses WHERE id = ?", id);
		jdbcTemplate.update("UPDATE sellers SET houseID = 0 WHERE houseID = ?", id);
		jdbcTemplate.update("DELETE FROM inquiries WHERE houseID = ?", id);
		
		mav.setViewName("redirect:/sample");
		return mav;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView form(ModelAndView mav) {
		mav.setViewName("index");
		mav.addObject("managerAccount", new ManagerAccount());

		return mav;
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView login(@ModelAttribute("managerAccount") ManagerAccount data, ModelAndView mav) {
		if (data.getLoginID().equals("田中") && data.getPassword().equals("111")) {
			mav.setViewName("redirect:/sample");
			mav.addObject("data", data);
		} else {
			mav.setViewName("redirect:/");
		}

		return mav;
	}

}
