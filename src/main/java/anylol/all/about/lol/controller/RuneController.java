package anylol.all.about.lol.controller;

import anylol.all.about.lol.riot.DataDragon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RuneController {
    @Autowired
    DataDragon dataDragon;

    @GetMapping("/runes")
    public String getRunes() {
        return dataDragon.getAllRunes();
    }
}
