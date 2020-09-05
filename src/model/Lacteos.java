package model;

public class Lacteos extends Item{

    private String name;
    private String dateExpiration;
    private String marca;

    public Lacteos(String name, String marca, double price, String dateExpiration) {
        super(price, 10);
        this.name = name;
        this.dateExpiration = dateExpiration;
        this.marca = marca;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(String dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
