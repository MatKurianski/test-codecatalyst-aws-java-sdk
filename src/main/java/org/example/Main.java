package org.example;

import software.amazon.awssdk.auth.token.credentials.ProfileTokenProvider;
import software.amazon.awssdk.services.codecatalyst.CodeCatalystClient;
import software.amazon.awssdk.services.codecatalyst.model.CreateProjectRequest;

public class Main {
    public static void main(String[] args) {
        var client = CodeCatalystClient.builder()
                .tokenProvider(ProfileTokenProvider.create("codecatalyst"))
                .build();

        client.createProject(
                CreateProjectRequest.builder()
                        .displayName("test")
                        .spaceName("matheus.kurianski")
                        .build()
        );
    }
}