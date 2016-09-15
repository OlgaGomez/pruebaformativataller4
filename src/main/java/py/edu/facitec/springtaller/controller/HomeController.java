package py.edu.facitec.springtaller.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//indicamos que se encargara e la peticiones del usuario
@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String index(){

		//pagina a ser visualizada
		return "home";
	}
}