package spring.certification.ioc.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Getter;

/**
 * Household appliance which stores food and drinks.
 */
@Getter
@Component
public class Refrigerator {

    private Beverage beverage;

    @Autowired
    public Refrigerator(Beverage beverage) {
        this.beverage = beverage;
    }
}
