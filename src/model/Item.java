package model;

import pattern.IObserver;

import java.util.LinkedHashSet;
import java.util.Set;

public abstract class Item {

    private double totalPrice;
    private Set<IObserver> observadores;
    private int stock;

    public Item(double totalPrice, int stock) {
        this.totalPrice = totalPrice;
        this.observadores = new LinkedHashSet<>();
        this.stock = stock;
    }

    public void venta() {
        this.setStock(this.stock - 1);
        System.out.println("Producto vendido!");

        this.notificarObservadores();
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void addObserver(IObserver o) {
        this.observadores.add(o);
    }

    public void notificarObservadores() {
        for(IObserver observador : this.observadores)
            observador.notificacion("El producto se vendio!");
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
