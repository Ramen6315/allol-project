package anylol.all.about.lol.riot;

import anylol.all.about.lol.domain.Summoner;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "DataDragon", url = "https://ddragon.leagueoflegends.com/cdn/11.15.1/data/ko_KR")
public interface DataDragon {

    @GetMapping(value = "/runesReforged.json")
    String getAllRunes();
}
