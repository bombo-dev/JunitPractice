package org.assertj.examples.data;

public class WesterosHouse {
    private String name;
    private String describe;

    public WesterosHouse(String name, String describe) {
        this.name = name;
        this.describe = describe;
    }

    public String getName() {
        return name;
    }

    public String sayTheWords() {
        return describe;
    }
}
