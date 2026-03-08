package com.Skamarah.fplpulse.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
public class LiveGameweekResponseDto {

    @JsonProperty("elements")
    public List<PlayerLiveDataDto> gameweekResponse;

    public List<PlayerLiveDataDto> getGameweekResponse() {
        return gameweekResponse;
    }

    public void setGameweekResponse(List<PlayerLiveDataDto> gameweekResponse) {
        this.gameweekResponse = gameweekResponse;
    }
}
