package br.com.jsn.adapter.outboud;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import br.com.jsn.adapter.entity.ClientEntity;
import br.com.jsn.core.model.ClientModel;
import br.com.jsn.core.port.ClientRepositoryPort;



@Component
@Primary
public class ClientDao implements ClientRepositoryPort{
	
	
	private final ClientPersistence clientPersistence; 
	
	
	public ClientDao( ClientPersistence clientPersistence) {
		this.clientPersistence =clientPersistence;
	}

	@Override
	public List<ClientModel> listar() {
	
		List<ClientModel> listaClient = new ArrayList<>();
		List<ClientEntity> lista = clientPersistence.findAll();

		for (ClientEntity a : lista) {
			ClientModel client = new ClientModel();

			client.setEmail(a.getEmail());
			client.setEndereco(a.getEndereco());
			client.setId(a.getId());
			client.setNome(a.getNome());
			client.setSenha(a.getSenha());
			client.setTipo(a.getTipo());

			listaClient.add(client);
		}
		return listaClient;
	}

	@Override
	public ClientModel registrar(ClientModel client) {
		// TODO Auto-generated method stub
		return null;
	}

}
