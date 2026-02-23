package br.com.asminasdacidade.shared.dto;

import java.time.Instant;

public record GreetingResponse(String message, Instant generatedAt) {
}
