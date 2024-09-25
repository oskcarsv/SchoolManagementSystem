package org.example;

public class Course {

    private int id;
    private String name;
    private String description;
    private String numberOfCredits;
    private String version;

    public Course() {
    }

    public Course(int id, String name, String description, String numberOfCredits, String version) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.numberOfCredits = numberOfCredits;
        this.version = version;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(String numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
