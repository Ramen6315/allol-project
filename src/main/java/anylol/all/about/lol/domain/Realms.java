package anylol.all.about.lol.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class Realms {
    private GameDataVersion n;

    @Getter
    public static class GameDataVersion {
        private String item;

        private String rune;

        private String mastery;

        private String summoner;

        private String champion;

        private String profileicon;

        private String map;

        private String language;

        private String sticker;
    }

    @JsonProperty(value = "v")
    private String version;

    @JsonProperty(value = "l")
    private String region;
}
