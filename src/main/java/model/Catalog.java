package model;

public class Catalog {
    private String id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public Catalog() {
    }

    public Catalog(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Catalog(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }
}
