package com.example;

public class PreviewProductService {
    private Product product;

    public PreviewProductService(Product product) {
        this.product = product;
    }

    public String showTitle(){
        if (this.product.isHasDiscount()){
            return this.product.getTitle()+" (" + this.product.getDiscount() + ")";
        }
        return this.product.getTitle();
    }
}
