package br.com.asminasdacidade.bdd.config;

import br.com.asminasdacidade.AppAsMinasDaCidadeApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(
        classes = AppAsMinasDaCidadeApplication.class,
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
)
public class CucumberSpringConfiguration {
}
