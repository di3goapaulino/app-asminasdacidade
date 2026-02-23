package br.com.asminasdacidade.infrastructure.repository;

import br.com.asminasdacidade.domain.model.Greeting;
import br.com.asminasdacidade.domain.port.GreetingRepository;
import org.springframework.stereotype.Repository;

import java.time.Instant;

@Repository
public class InMemoryGreetingRepository implements GreetingRepository {

    @Override
    public Greeting getDefaultGreeting() {
        return new Greeting("App inicial da As Minas da Cidade no ar!", Instant.now());
    }
}
