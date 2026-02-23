package br.com.asminasdacidade.usecase;

import br.com.asminasdacidade.application.usecase.GetGreetingUseCase;
import br.com.asminasdacidade.domain.model.Greeting;
import br.com.asminasdacidade.domain.port.GreetingRepository;
import org.junit.jupiter.api.Test;

import java.time.Instant;

import static org.assertj.core.api.Assertions.assertThat;

class GetGreetingUseCaseTest {

    @Test
    void shouldReturnGreetingFromRepository() {
        Greeting expected = new Greeting("olá", Instant.parse("2024-01-01T00:00:00Z"));
        GreetingRepository repository = () -> expected;

        GetGreetingUseCase useCase = new GetGreetingUseCase(repository);

        Greeting result = useCase.execute();

        assertThat(result).isEqualTo(expected);
    }
}
