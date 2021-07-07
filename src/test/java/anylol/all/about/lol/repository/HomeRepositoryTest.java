package anylol.all.about.lol.repository;

import anylol.all.about.lol.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class HomeRepositoryTest {
    @Autowired
    public HomeRepository homeRepository;

    @Test
    void save() {
        //given
        User user = new User("name");

        //when
        User result = homeRepository.save(user);

        //then
        assertThat(result.getName()).isEqualTo("name");
    }

}