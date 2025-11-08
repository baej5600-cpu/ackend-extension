package com.example.backendextension.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Value("${api.title:Backend Extension API}")
    private String title;

    @Value("${api.version:v1}")
    private String version;

    @Value("${api.description:API documentation for reservation, place, review, and share endpoints}")
    private String description;

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info().title(title).version(version).description(description))
                .addServersItem(new Server().url("/").description("Default Server"));
    }
}
