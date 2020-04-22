package com.example.fruits;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {
  public OpenAPI customOpenAPI() {
    return (new OpenAPI()).components(new Components())
      .info((new Info()).title("Fruit Application API").description("This is Fruit Application API From F5 Demo"));
  }
}
