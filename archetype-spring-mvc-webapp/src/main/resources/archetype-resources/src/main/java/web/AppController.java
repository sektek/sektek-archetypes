package ${package}.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/app")
public class AppController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getRoot(Model model) {
		model.addAttribute("demoString", "Hello World");
		return "demo";
	}
}