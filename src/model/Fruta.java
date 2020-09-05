package model;

public class Fruta extends Item {

    private String name;
    private double weight = 0.0;
    private double pricePerKg = 0.0;

    public Fruta(String name, double weight, double pricePerKg) {
        super(weight * pricePerKg, 20);
        this.name = name;
        this.weight = weight;
        this.pricePerKg = pricePerKg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPricePerKg() {
        return pricePerKg;
    }

    public void setPricePerKg(double pricePerKg) {
        this.pricePerKg = pricePerKg;
    }

}