package anylol.all.about.lol.domain;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Getter;

@Getter
public class Version {
    private String version;

    public Version(String version) {
        this.version = version;
    }
}
