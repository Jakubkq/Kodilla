package com.kodilla.good.patterns.allegro;

public class MailService implements InformationService {
    public void inform(User user) {
        System.out.println(user.getName() + " your order succeed!");
    }
}
