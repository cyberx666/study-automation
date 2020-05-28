package com.example;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;
 import static org.testng.Assert.*;

public class FixtureDescription {





    @BeforeMethod
    public void beforeMethod(){
        System.out.println("before mothod");
    }

    @Test
    public void discountShouldBeCalculatedTest(){

       Product book = new Product();
       book.setId(1L);
       book.setPrice(550);
       book.setTitle("Witcher");
        System.out.println(book);
        ProductPriceService priceService = new ProductPriceService(book);
        priceService.calculateDiscount();
}


}
