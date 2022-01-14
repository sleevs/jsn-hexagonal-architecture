package br.com.jsn.adapter.inboud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.jsn.core.model.ClientModel;
import br.com.jsn.core.port.ClientServicePort;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/client_api")
public class ClientController {
	
	@Autowired
	ClientServicePort clientServicePort;
	
	@GetMapping("/listar")
	public List<ClientModel> listarClients(){
		return clientServicePort.listar() ;
	}
	
	@PostMapping("/registrar")
	public ClientModel registro(@RequestBody ClientModel client){
		return clientServicePort.registrar(client) ;
	}

}
