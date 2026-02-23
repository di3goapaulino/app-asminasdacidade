package br.com.asminasdacidade.domain.model;

import java.time.Instant;

public record Greeting(String message, Instant generatedAt) {
}
