package anylol.all.about.lol.controller;

import anylol.all.about.lol.domain.*;
import anylol.all.about.lol.riot.DataDragon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/data")
public class RuneController {
    @Autowired
    DataDragon dataDragon;

    @GetMapping("/runes")
    public List<Build> getRunes() {
        return dataDragon.getAllRunes();
    }

    @GetMapping("/items")
    public Items getItems() {
        return dataDragon.getAllItems();
    }

    @GetMapping("/champions")
    public Champions getChampions() {
        return dataDragon.getAllChampions();
    }

    @GetMapping("/versions")
    public List<Version> getVersions() {
        return dataDragon.getAllVersions();
    }

    @GetMapping("/reamls")
    public Realms getReamls() {
        return dataDragon.getRealms();
    }

    @GetMapping("/profileicons")
    public ProfileIcons getProfileIcons() {
        return dataDragon.getProfileIcons();
    }
}
