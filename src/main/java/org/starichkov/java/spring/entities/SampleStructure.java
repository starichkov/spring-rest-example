package org.starichkov.java.spring.entities;

import lombok.Getter;

import java.security.SecureRandom;

/**
 * @author Vadim Starichkov
 * @since 21.10.2016 16:21
 */
@Getter
public class SampleStructure {
    private final String name;
    private final int version;

    public SampleStructure() {
        name = "Sample structure";
        version = new SecureRandom().nextInt();
    }
}
