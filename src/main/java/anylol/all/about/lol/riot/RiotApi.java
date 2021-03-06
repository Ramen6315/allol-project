package anylol.all.about.lol.riot;

import anylol.all.about.lol.domain.MatchList;
import anylol.all.about.lol.domain.RotationChampion;
import anylol.all.about.lol.domain.Summoner;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "riotApi", url = "https://kr.api.riotgames.com", configuration = {FeignConfiguration.class})
public interface RiotApi {

    @GetMapping(value = "/lol/summoner/v4/summoners/by-name/{summonerName}?api_key=")
    Summoner getSummoner(@PathVariable("summonerName") String summonerName);

    @GetMapping(value = "/lol/match/v4/matchlists/by-account/{encryptedAccountId}?api_key=")
    MatchList getMatches(@PathVariable("encryptedAccountId") String encryptedAccountId);

    @GetMapping(value = "/lol/platform/v3/champion-rotations?api_key=")
    RotationChampion getRotationChampion();
}
