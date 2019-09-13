package spring.certification.ioc.q021.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Getter;

/**
 * A living being.
 */
@Getter
@Component
public class Creature {

    private Heart heart;

    /**
     * Single constructor doesn't have to be annotated with {@link Autowired}.
     * It will be used anyway.
     */
    public Creature(Heart heart) {
        this.heart = heart;
    }
}
