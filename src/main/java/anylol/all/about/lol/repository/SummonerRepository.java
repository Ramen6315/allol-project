package anylol.all.about.lol.repository;

import anylol.all.about.lol.domain.Summoner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SummonerRepository extends JpaRepository<Summoner, Long> {

    boolean existsByName(String summonerName);

    Summoner findByName(String summonerName);

}
