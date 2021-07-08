package anylol.all.about.lol.riot;

import anylol.all.about.lol.domain.Summoner;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class RiotApiTest {
    @Autowired
    RiotApi riotApi;

    @Test
    void getSummonerInfo() {
        //when
        Summoner summoner = riotApi.getSummoner("큰고모부");
        
        //then
        assertThat(summoner.getName()).isEqualTo("큰고모부");
    }

}