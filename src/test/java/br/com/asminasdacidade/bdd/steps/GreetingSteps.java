package br.com.asminasdacidade.bdd.steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class GreetingSteps {

    @Autowired
    private TestRestTemplate restTemplate;

    private ResponseEntity<Map> response;

    @Dado("que a API esta em execucao")
    public void queApiEstaEmExecucao() {
        assertThat(restTemplate).isNotNull();
    }

    @Quando("eu consultar o endpoint de saudacao")
    public void euConsultarEndpointSaudacao() {
        response = restTemplate.getForEntity("/api/v1/greetings", Map.class);
    }

    @Entao("devo receber status {int}")
    public void devoReceberStatus(int status) {
        assertThat(response.getStatusCode().value()).isEqualTo(status);
    }

    @Entao("a resposta deve conter a mensagem padrao")
    public void respostaDeveConterMensagemPadrao() {
        assertThat(response.getBody()).containsEntry("message", "App inicial da As Minas da Cidade no ar!");
        assertThat(response.getBody()).containsKey("generatedAt");
    }
}
