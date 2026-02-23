package br.com.asminasdacidade.application.usecase;

import br.com.asminasdacidade.domain.model.Greeting;
import br.com.asminasdacidade.domain.port.GreetingRepository;
import org.springframework.stereotype.Service;

@Service
public class GetGreetingUseCase {

    private final GreetingRepository greetingRepository;

    public GetGreetingUseCase(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public Greeting execute() {
        return greetingRepository.getDefaultGreeting();
    }
}
