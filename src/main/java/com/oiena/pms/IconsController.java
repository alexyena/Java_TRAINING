package com.oiena.pms;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IconsController {

	@RequestMapping(value = "icons", method = RequestMethod.GET)
	public String icons(Locale locale, Model model) {

		return "pages/icons";
	}
}
