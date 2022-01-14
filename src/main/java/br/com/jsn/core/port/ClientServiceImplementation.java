package br.com.jsn.core.port;

import java.util.List;

import br.com.jsn.core.model.ClientModel;


public class ClientServiceImplementation implements ClientServicePort {
	
	
	private final ClientRepositoryPort clientRepositoryPort;
	
	
	public ClientServiceImplementation(ClientRepositoryPort clientRepositoryPort) {
		this.clientRepositoryPort = clientRepositoryPort ;
	}

	@Override
	public List<ClientModel> listar() {
		// TODO Auto-generated method stub
		return clientRepositoryPort.listar();
	}

	@Override
	public ClientModel registrar(ClientModel client) {
		// TODO Auto-generated method stub
		return clientRepositoryPort.registrar(client);
	}



}
