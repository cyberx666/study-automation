package com.example;

public class Product {

    private long id;
    private String title;
private boolean hasDiscount;
    public String getTitle() {
        return title;
    }

    public boolean isHasDiscount() {
        return hasDiscount;
    }

    public void setHasDiscount(boolean hasDiscount) {
        this.hasDiscount = hasDiscount;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    private double price;
    private double discount;

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", hasDiscount=" + hasDiscount +
                ", price=" + price +
                ", discount=" + discount +
                '}';
    }
}