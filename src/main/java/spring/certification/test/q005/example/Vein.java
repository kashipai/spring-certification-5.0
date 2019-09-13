package spring.certification.test.q005.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

/**
 * Tube for carrying blood.
 */
@Setter
@Getter
@Component
public class Vein {

    /**
     * {@link Vein} class is dependent on {@link Blood} class.
     * With mocking framework we can easily substitute this instance to test
     * {@link Vein} class in isolation.
     */
    private Blood blood;

    @Autowired
    public Vein(Blood blood) {
        this.blood = blood;
    }

    public boolean isFreshBlood() {
        return this.blood.getOxygenRatio() > this.blood.getCarbonDioxideRatio();
    }
}
