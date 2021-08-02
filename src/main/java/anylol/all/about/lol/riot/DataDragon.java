package anylol.all.about.lol.riot;

import anylol.all.about.lol.domain.Build;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "DataDragon", url = "https://ddragon.leagueoflegends.com/cdn/11.15.1/data/ko_KR")
public interface DataDragon {

    @GetMapping(value = "/runesReforged.json")
    List<Build> getAllRunes();
}
