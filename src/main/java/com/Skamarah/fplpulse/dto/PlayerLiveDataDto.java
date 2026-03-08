package com.Skamarah.fplpulse.dto;

import java.util.List;

public class PlayerLiveDataDto {

    public Integer id;

    public PlayerStatsDto stats;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public PlayerStatsDto getStats() {
        return stats;
    }

    public void setStats(PlayerStatsDto stats) {
        this.stats = stats;
    }


}
