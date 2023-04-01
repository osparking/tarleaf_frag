package space.bumtiger.tarleaf_frag;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
	@GetMapping("/")
	public String newProductView(Model model) {
		var menus = new ArrayList<Menu>();
		menus.add(new Menu("/product", "product"));
		menus.add(new Menu("/service", "service"));
		
		model.addAttribute("menus", menus);
		return "index";
	}
}
