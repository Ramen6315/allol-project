package anylol.all.about.lol.service;

import anylol.all.about.lol.domain.MatchList;
import anylol.all.about.lol.domain.Summoner;
import anylol.all.about.lol.repository.SummonerRepository;
import anylol.all.about.lol.riot.RiotApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SummonerService {
    @Autowired
    RiotApi riotApi;

    @Autowired
    SummonerRepository summonerRepository;

    public Summoner getSummoner(String summonerName) {
        if(summonerRepository.existsByName(summonerName)) {
            Summoner existSummoner = summonerRepository.findByName(summonerName);
            log.debug("이미 존재 하는 아이디 입니다 : " + existSummoner.getName());
            return existSummoner;
        }
        Summoner summoner = riotApi.getSummoner(summonerName);

        return summonerRepository.save(summoner);
    }

    public MatchList getMatches(String summonerName) {
        Summoner summoner = summonerRepository.findByName(summonerName);
        return riotApi.getMatches(summoner.getAccountId());
    }
}
