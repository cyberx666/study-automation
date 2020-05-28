package com.example;
import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
//import static org.testng.Assert.*;

public class ProductPriceServiceTest {
    private Product book;
    private ProductPriceService priceService;





    @BeforeMethod
    public void beforeMethod() {
//   setup data
        book = new Product();
        book.setId(1L);
        book.setTitle("Witcher");
        book.setPrice(55D);
        System.out.println(book);
        priceService = new ProductPriceService(book);
    }

    @AfterMethod
        public void afterMethod(){
//   clean data
        book=null;
        priceService=null;
    }

    @Test
    public void discountShouldBeCalculatedTest(){
        priceService = new ProductPriceService(book);
        priceService.calculateDiscount();
        System.out.println(book);
        assertEquals(book.getDiscount(), 27.5, "Wrong discount calculated");
    }

    @Test
    public void hasDiscountShouldBeTest(){
        System.out.println("hasDiscountShouldBeTest");

        ProductPriceService priceService = new ProductPriceService(book);
        priceService.calculateDiscount();


        assertTrue(book.isHasDiscount(), "Product should have Discount");
    }


    

}
