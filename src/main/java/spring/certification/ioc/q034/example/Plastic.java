package spring.certification.ioc.q034.example;

import org.springframework.stereotype.Component;

import lombok.Getter;

/**
 * A synthetic material.
 */
@Getter
@Component("plastic")
public class Plastic {
    private final String materialName = "plastic";
}
