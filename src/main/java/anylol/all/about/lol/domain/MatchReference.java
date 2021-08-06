package anylol.all.about.lol.domain;

import lombok.Getter;

@Getter
public class MatchReference {
    private long gameId;

    private String role;

    private int season;

    private String platformId;

    private int champion;

    private int queue;

    private String lane;

    private long timeStamp;
}
