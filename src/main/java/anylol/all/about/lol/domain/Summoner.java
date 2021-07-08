package anylol.all.about.lol.domain;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
public class Summoner {
    @Id
    private String id;

    private String accountId;

    private int profileIconId;

    private long revisionDate;

    public String name;

    private String puuid;

    private long summonerLevel;
}
