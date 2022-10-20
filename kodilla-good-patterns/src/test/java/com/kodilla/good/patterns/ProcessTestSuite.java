package com.kodilla.good.patterns;

import com.kodilla.good.patterns.Foof2Door.ExtraFoodShop;
import com.kodilla.good.patterns.Foof2Door.GlutenFreeShop;
import com.kodilla.good.patterns.Foof2Door.HealthyShop;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ProcessTestSuite {


    @Test
    public void testProcessExtraFoodShopAcceptedMoreThan0() {
        //Given
        ExtraFoodShop extraFoodShop = new ExtraFoodShop();

        //When
        boolean result = extraFoodShop.process("Extra Food Shop", "apple", 20, "kg");

        //Then
        Assertions.assertTrue(result);
    }

    @Test
    public void testProcessExtraFoodShopRejectedEqualsZero() {
        //Given
        ExtraFoodShop extraFoodShop = new ExtraFoodShop();

        //When
        boolean result = extraFoodShop.process("Extra Food Shop", "apple", 0, "kg");

        //Then
        Assertions.assertFalse(result);
    }

    @Test
    public void testProcessGlutenFreeShopAcceptedKgLessThan100() {
        //Given
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();

        //When
        boolean result = glutenFreeShop.process("Gluten Free Shop", "apple", 20, "kg");

        //Then
        Assertions.assertTrue(result);
    }

    @Test
    public void testProcessGlutenFreeShopAcceptedPcsLessThan100() {
        //Given
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();

        //When
        boolean result = glutenFreeShop.process("Gluten Free Shop", "apple", 20, "pcs");

        //Then
        Assertions.assertTrue(result);
    }

    @Test
    public void testProcessGlutenFreeShopAcceptedPcsMoreThan100() {
        //Given
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();

        //When
        boolean result = glutenFreeShop.process("Gluten Free Shop", "apple", 200, "pcs");

        //Then
        Assertions.assertTrue(result);
    }

    @Test
    public void testProcessGlutenFreeShopRejectedKgMoreThan100() {
        //Given
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();

        //When
        boolean result = glutenFreeShop.process("Gluten Free Shop", "apple", 200, "kg");

        //Then
        Assertions.assertFalse(result);
    }

    @Test
    public void testProcessHealthyShopAcceptedWithUnits() {
        //Given
        HealthyShop healthyShop = new HealthyShop();

        //When
        boolean result = healthyShop.process("Gluten Free Shop", "apple", 200, "kg");

        //Then
        Assertions.assertTrue(result);
    }

    @Test
    public void testProcessHealthyShopRejectedWithoutUnits() {
        //Given
        HealthyShop healthyShop = new HealthyShop();

        //When
        boolean result = healthyShop.process("Gluten Free Shop", "apple", 200, null);

        //Then
        Assertions.assertFalse(result);
    }
}
