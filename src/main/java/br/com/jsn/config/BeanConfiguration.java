package br.com.jsn.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import br.com.jsn.JsnHexagonalArchitectureApplication;
import br.com.jsn.core.port.ClientRepositoryPort;
import br.com.jsn.core.port.ClientServiceImplementation;

@Configuration
@ComponentScan(basePackageClasses = JsnHexagonalArchitectureApplication.class)
public class BeanConfiguration {
	

    @Bean
    ClientServiceImplementation clientServiceImplementation(ClientRepositoryPort repository) {
        return new ClientServiceImplementation(repository);
    }


}
