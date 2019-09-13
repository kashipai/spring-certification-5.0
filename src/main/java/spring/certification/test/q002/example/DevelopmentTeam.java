package spring.certification.test.q002.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Getter;

/**
 * A team of software developers.
 */
@Getter
@Component
public class DevelopmentTeam {

    private List<Developer> developers;

    @Autowired
    public DevelopmentTeam(List<Developer> developers) {
        this.developers = developers;
    }
}
