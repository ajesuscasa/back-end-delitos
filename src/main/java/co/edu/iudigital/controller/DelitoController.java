package co.edu.iudigital.controller;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.edu.iudigital.dto.DelitoDto;
import co.edu.iudigital.service.iface.IDelitoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Tag;


@RestController
@RequestMapping("/delitos")

@Api(value="/delitos", tags= {"Delitos"})
@SwaggerDefinition(tags = {
		@Tag(name = "Delitos", description = "Gestion API delitos")
})
public class DelitoController {
	
	private static final Logger log = LoggerFactory.getLogger( DelitoController.class);
	 
	 @Autowired
	 private IDelitoService delitoService;
	 
	 @Autowired
	 public DelitoController() {
		 
	 }
	 
	@ApiOperation(value = "Obtiene todos los delitos",
			response = DelitoDto.class,
			responseContainer = "List",
			produces = "aplication/json",
			httpMethod = "Get")
	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	public List<DelitoDto> index(){
		log.info("inicio index controlador");
		return delitoService.finfAll();
		
	}
	 
}
