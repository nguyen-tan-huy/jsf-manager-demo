package model;

public class Product {
    private String id;
    private String name;
    private String image;
    private double price;
    private String idCatelog;

    public Product() {
    }

    public Product(String id, String name, String image, double price, String idCatelog) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.price = price;
        this.idCatelog = idCatelog;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getIdCatelog() {
        return idCatelog;
    }

    public void setIdCatelog(String idCatelog) {
        this.idCatelog = idCatelog;
    }
}
