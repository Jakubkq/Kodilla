package com.kodilla.good.patterns.allegro;

import java.time.LocalDateTime;

public interface OrderRepository {
    void createOrder(User user, LocalDateTime from, String deliveryMethod);
}
