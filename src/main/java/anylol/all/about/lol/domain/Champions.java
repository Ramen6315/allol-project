package anylol.all.about.lol.domain;

import lombok.Getter;

import java.util.List;
import java.util.Map;

@Getter
public class Champions {
    private String type;

    private String format;

    private String version;

    private Map<String, Champion> data;

    @Getter
    private static class Champion {
        private String id;

        private String key;

        private String name;

        private String title;

        private String blurb;

        private Info info;

        private Image image;

        private List<String> tags;

        private String partype;

        private Stats stats;

        @Getter
        private static class Stats {
            private double hp;

            private double hpperlevel;

            private double mp;

            private double mpperlevel;

            private double movespeed;

            private double armor;

            private double armorperlevel;

            private double spellblock;

            private double spellblockperlevel;

            private double attackrange;

            private double hpregen;

            private double hpregenperlevel;

            private double mpregen;

            private double mpregenperlevel;

            private double crit;

            private double critperlevel;

            private double attackdamage;

            private double attackdamageperlevel;

            private double attackspeedperlevel;

            private double attackspeed;
        }
    }

    @Getter
    private static class Info {
        private int attack;

        private int defense;

        private int magic;

        private int difficulty;
    }

    @Getter
    private static class Image {
        private String full;
    }
}
