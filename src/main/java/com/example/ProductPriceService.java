package com.example;

public class ProductPriceService {

    private Product product;
    public ProductPriceService(Product product){
        this.product = product;
    }


    public Product calculateDiscount() {
        this.product.setDiscount(this.product.getPrice() / 2d);
        this.product.setHasDiscount(true);
        return product;

    }
}
