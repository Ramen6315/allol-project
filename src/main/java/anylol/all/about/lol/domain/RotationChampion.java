package anylol.all.about.lol.domain;

import lombok.Getter;

import java.util.List;

@Getter
public class RotationChampion {
    private int maxNewPlayerLevel;

    private List<Integer> freeChampionIdsForNewPlayers;

    private List<Integer> freeChampionIds;
}
