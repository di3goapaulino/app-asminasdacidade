package br.com.asminasdacidade.interfaces.rest;

import br.com.asminasdacidade.application.usecase.GetGreetingUseCase;
import br.com.asminasdacidade.domain.model.Greeting;
import br.com.asminasdacidade.shared.dto.GreetingResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/greetings")
public class GreetingController {

    private final GetGreetingUseCase getGreetingUseCase;

    public GreetingController(GetGreetingUseCase getGreetingUseCase) {
        this.getGreetingUseCase = getGreetingUseCase;
    }

    @GetMapping
    public ResponseEntity<GreetingResponse> getGreeting() {
        Greeting greeting = getGreetingUseCase.execute();
        GreetingResponse response = new GreetingResponse(greeting.message(), greeting.generatedAt());

        return ResponseEntity.ok(response);
    }
}
