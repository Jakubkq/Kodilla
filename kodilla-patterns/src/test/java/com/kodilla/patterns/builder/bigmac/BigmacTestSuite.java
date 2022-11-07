package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void bigMacBuilder() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .burgers(2)
                .sauce("barbecue")
                .ingredient("salad")
                .roll("sesam")
                .ingredient("cheese")
                .build();
        System.out.println(bigmac);

        //When
        int numOfIngredients=bigmac.getIngredients().size();

        //Then
        Assert.assertEquals(2, numOfIngredients);


    }
}
