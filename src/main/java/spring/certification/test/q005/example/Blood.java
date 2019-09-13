package spring.certification.test.q005.example;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

/**
 * Red liquid.
 */
@Setter
@Getter
@Component
public class Blood {
    private int oxygenRatio;
    private int carbonDioxideRatio;
}
