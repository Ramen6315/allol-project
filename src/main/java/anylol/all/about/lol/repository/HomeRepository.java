package anylol.all.about.lol.repository;

import anylol.all.about.lol.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeRepository extends JpaRepository<User, Long> {
}
