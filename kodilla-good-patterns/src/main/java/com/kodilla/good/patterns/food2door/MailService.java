package com.kodilla.good.patterns.food2door;



public class MailService implements InformationService {
    public void inform(User user, Product product) {
        System.out.println(user.getNick() + " " + user.getMail() + " ordered " + product.getQuanityProduct() + " " + product.getSupplier());
}
}
