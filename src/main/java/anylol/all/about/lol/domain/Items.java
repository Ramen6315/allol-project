package anylol.all.about.lol.domain;

import lombok.Getter;

import java.util.List;
import java.util.Map;

@Getter
public class Items {
    private String type;

    private String version;

    private Map<String, Data> data;

    @Getter
    public static class Data {
        private String name;

        private String description;

        private String colloq;

        private String plaintext;

        private Image image;

        private Gold gold;

        private List<String> tags;

        private Map<String, Boolean> maps;
    }

    @Getter
    public static class Image {
        private String full;
    }

    @Getter
    public static class Gold {
        private String base;

        private String purchasable;

        private String total;

        private String sell;
    }
}
