package com.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PreviewProductServiceTest {

    private Product book;
    private PreviewProductService previewProductService;





    @BeforeMethod
    public void beforeMethod() {
//   setup data
        book = new Product();
        book.setId(1L);
        book.setTitle("Witcher");
        book.setPrice(55D);
        System.out.println(book);
        previewProductService = new PreviewProductService(book);
    }

    @AfterMethod
    public void afterMethod(){
//   clean data
        book=null;
        previewProductService=null;
    }

    @Test
    public void showTitleWithoutDiscount(){
        assertEquals(previewProductService.showTitle(), book.getTitle());

    }

    @Test
    public void showTitleWithDiscount(){
        double discount = 25.5;
        book.setHasDiscount(true);
        book.setDiscount(25.5);
        assertEquals(previewProductService.showTitle(), book.getTitle() + "("+discount+")");

    }
}
