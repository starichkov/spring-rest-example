package org.starichkov.java.spring.entities;

/**
 * @author Vadim Starichkov
 * @since 21.10.2016 16:21
 */
public class SampleStructure {
    private final String name;
    private final int version;

    public SampleStructure() {
        name = "Sample structure";
        version = 1;
    }

    public String getName() {
        return name;
    }

    public int getVersion() {
        return version;
    }
}
