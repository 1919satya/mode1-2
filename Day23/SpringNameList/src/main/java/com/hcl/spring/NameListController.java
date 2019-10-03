package com.hcl.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NameListController {
	@RequestMapping("/names")
	public ModelAndView nameDemo(){
		List<String>lstNames=new ArrayList<String>();
		lstNames.add("Sindhu");
		lstNames.add("Raju");
		lstNames.add("rakesh");
		lstNames.add("alekaya");
		lstNames.add("yesh");
		return new ModelAndView("ShowPage","lists",lstNames);
	}

}
