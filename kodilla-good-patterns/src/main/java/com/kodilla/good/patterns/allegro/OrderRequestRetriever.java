package com.kodilla.good.patterns.allegro;

import java.time.LocalDateTime;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        User user = new User("Jakub", "Bubas", "Chełm, 22-100 Małachowksiego");
        LocalDateTime orderFrom = LocalDateTime.of(2022, 5, 7, 23, 55);
        String deliveryMethod = "Paczkomat";

        return new OrderRequest(user, orderFrom, deliveryMethod);
    }
}
