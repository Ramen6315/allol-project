package anylol.all.about.lol.controller;

import anylol.all.about.lol.domain.Summoner;
import anylol.all.about.lol.service.SummonerService;
import com.merakianalytics.orianna.Orianna;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SummonerController {
    @Autowired
    SummonerService summonerService;


    @GetMapping("/summoner/{summonerName}")
    public Summoner getSummoner(@PathVariable String summonerName) {
        Orianna.getRunes();
        return summonerService.getSummoner(summonerName);
    }
}
