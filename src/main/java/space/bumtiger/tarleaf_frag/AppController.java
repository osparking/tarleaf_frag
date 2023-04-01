package space.bumtiger.tarleaf_frag;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
	@GetMapping("/")
	public String newProductView(Model model) {
		model.addAttribute("menus", null);
		return "index";
	}
}
