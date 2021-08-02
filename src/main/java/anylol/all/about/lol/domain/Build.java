package anylol.all.about.lol.domain;

import lombok.Getter;

import java.util.List;

@Getter
public class Build {
    private long id;

    private String key;

    private String icon;

    private String name;

    private List<Slot> slots;

    @Getter
    public static class Slot {
        private List<Rune> runes;
    }

    @Getter
    public static class Rune {
        private long id;

        private String key;

        private String icon;

        private String name;

        private String shortDesc;

        private String longDesc;
    }
}
