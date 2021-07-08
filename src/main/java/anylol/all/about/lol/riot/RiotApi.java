package anylol.all.about.lol.riot;

import anylol.all.about.lol.domain.Summoner;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "riotApi", url = "https://kr.api.riotgames.com", configuration = {FeignConfiguration.class})
public interface RiotApi {

    @GetMapping(value = "/lol/summoner/v4/summoners/by-name/{summonerName}?api_key=RGAPI-9d807a64-d3b0-4ca7-a697-b44d46cfe51d")
    Summoner getSummoner(@PathVariable("summonerName") String summonerName);
}
