package anylol.all.about.lol.controller;

import anylol.all.about.lol.domain.MatchList;
import anylol.all.about.lol.domain.RotationChampion;
import anylol.all.about.lol.domain.Summoner;
import anylol.all.about.lol.riot.RiotApi;
import anylol.all.about.lol.service.SummonerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SummonerController {

    //TODO: championRatation 해결
    @Autowired
    RiotApi riotApi;

    @Autowired
    SummonerService summonerService;

    @GetMapping("/summoner/{summonerName}")
    public Summoner getSummoner(@PathVariable String summonerName) {
        return summonerService.getSummoner(summonerName);
    }

    @GetMapping("/summoners/{summonerName}/matches")
    public MatchList getMatches(@PathVariable String summonerName) {
        return summonerService.getMatches(summonerName);
    }

    @GetMapping("/champion-rotations")
    public RotationChampion getRotationChampion() {
        return riotApi.getRotationChampion();
    }
}
