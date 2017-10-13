package designpattern.factory;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Main {
    public static void main(String[] arrs){
//        ICoffee capuCoffee = CoffeeFactory.makeCoffee("capu");
//        ICoffee capuCoffee = CoffeeFactory.makeCoffee("latte");
        ICoffee capuCoffee = CoffeeFactory.makeCoffee("geisha");
        if (capuCoffee != null) {
            System.out.println(capuCoffee.getFlavor());
        }

        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] digest = md5.digest("123456".getBytes());
            System.out.println(new String(digest));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}