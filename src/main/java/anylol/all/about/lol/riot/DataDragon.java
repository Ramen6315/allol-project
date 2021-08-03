package anylol.all.about.lol.riot;

import anylol.all.about.lol.domain.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "DataDragon", url = "https://ddragon.leagueoflegends.com")
public interface DataDragon {

    @GetMapping(value = "/cdn/11.15.1/data/ko_KR/runesReforged.json")
    List<Build> getAllRunes();

    @GetMapping(value = "/cdn/11.15.1/data/ko_KR/item.json")
    Items getAllItems();

    @GetMapping(value = "/cdn/11.15.1/data/ko_KR/champion.json")
    Champions getAllChampions();

    @GetMapping(value = "/api/versions.json")
    List<Version> getAllVersions();

    @GetMapping(value = "/realms/kr.json")
    Realms getRealms();

    @GetMapping(value = "/cdn/11.15.1/data/ko_KR/profileicon.json")
    ProfileIcons getProfileIcons();
}
