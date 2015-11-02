package sample.web.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import sample.domain.SimpleController;

@Controller
public class HomeController {
	
	@Autowired
	@Qualifier("specific")
	private SimpleController _simpleController;

    @RequestMapping("/")
    public String index(@RequestParam(value="name", required=false, defaultValue="Teste") String name, Model model) {
        model.addAttribute("name", name +  " " + _simpleController.getSimpleValue());
        model.addAttribute("data", _simpleController.getListValue());
        return "home/index";
    }

}
