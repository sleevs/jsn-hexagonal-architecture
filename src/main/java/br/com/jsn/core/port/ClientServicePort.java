package br.com.jsn.core.port;

import java.util.List;

import br.com.jsn.core.model.ClientModel;

public interface ClientServicePort {
	

	public List<ClientModel> listar();
	public ClientModel registrar(ClientModel client);


}
