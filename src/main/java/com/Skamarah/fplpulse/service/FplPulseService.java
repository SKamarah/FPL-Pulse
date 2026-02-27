package com.Skamarah.fplpulse.service;

import com.Skamarah.fplpulse.config.WebClientConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
import tools.jackson.databind.JsonNode;

@Service
public class FplPulseService {
    @Autowired
    private WebClientConfig webClientConfig;

    public Mono<String> getLiveGameweekData(int gameweek) {
        return webClientConfig.fplWebClient().get()
                .uri("/event/" + gameweek + "/live/")
                .retrieve()
                .bodyToMono(String.class);
    }

    public Mono<JsonNode> getBootstrapStatic() {
        return webClientConfig.fplWebClient().get()
                .uri("/bootstrap-static/")
                .retrieve()
                .bodyToMono(JsonNode.class);
    }
}
