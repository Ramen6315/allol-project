package anylol.all.about.lol.controller;

import anylol.all.about.lol.domain.Build;
import anylol.all.about.lol.riot.DataDragon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RuneController {
    @Autowired
    DataDragon dataDragon;

    @GetMapping("/runes")
    public List<Build> getRunes() {
        List<Build> runes = dataDragon.getAllRunes();

        return runes;
    }
}
