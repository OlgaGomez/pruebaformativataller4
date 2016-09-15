package py.edu.facitec.springtaller.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import py.edu.facitec.springtaller.dao.VendedorDAO;
import py.edu.facitec.springtaller.model.Vendedor;

@Controller
@Transactional
public class VendedorController {
	
	@Autowired
	private VendedorDAO vendedorDao;
	
	@RequestMapping(value="/vendedor", method=RequestMethod.POST)
	public String registrar(Vendedor vendedor) {
		vendedorDao.guardar(vendedor, vendedor.getId());
		System.out.println("Ingrese registrar");
		return "Vendedores/ok";
	}
	
	//url a responder
		@RequestMapping("/vendedor.form")
		public String formulario(){
			
			
			
			
			//carpeta/pagina
			return "vendedor/form";
		}
	
	
	
	
	

}
