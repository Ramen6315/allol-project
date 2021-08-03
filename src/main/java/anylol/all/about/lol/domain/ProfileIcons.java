package anylol.all.about.lol.domain;

import lombok.Getter;

import java.util.List;
import java.util.Map;

@Getter
public class ProfileIcons {
    private String type;

    private String version;

    private Map<String, Data> data;

    @Getter
    public static class Data {
        private String id;

        private Image image;
    }

    @Getter
    private static class Image {
        private String full;

        private String sprite;
    }

}
