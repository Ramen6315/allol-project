package anylol.all.about.lol.riot;

import anylol.all.about.lol.domain.MatchList;
import anylol.all.about.lol.domain.RotationChampion;
import anylol.all.about.lol.domain.Summoner;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "riotApi", url = "https://kr.api.riotgames.com", configuration = {FeignConfiguration.class})
public interface RiotApi {

    @GetMapping(value = "/lol/summoner/v4/summoners/by-name/{summonerName}?api_key=RGAPI-089cd6a9-0813-4ee7-9025-f2708484dc45")
    Summoner getSummoner(@PathVariable("summonerName") String summonerName);

    @GetMapping(value = "/lol/match/v4/matchlists/by-account/{encryptedAccountId}?api_key=RGAPI-089cd6a9-0813-4ee7-9025-f2708484dc45")
    MatchList getMatches(@PathVariable("encryptedAccountId") String encryptedAccountId);

    @GetMapping(value = "/lol/platform/v3/champion-rotations?api_key=RGAPI-089cd6a9-0813-4ee7-9025-f2708484dc45")
    RotationChampion getRotationChampion();
}
