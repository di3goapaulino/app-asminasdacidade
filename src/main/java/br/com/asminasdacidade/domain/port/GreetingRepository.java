package br.com.asminasdacidade.domain.port;

import br.com.asminasdacidade.domain.model.Greeting;

public interface GreetingRepository {
    Greeting getDefaultGreeting();
}
