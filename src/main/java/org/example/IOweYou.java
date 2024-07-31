package org.example;

import java.util.HashMap;

public class IOweYou {
    private HashMap<String, Double> owes;

    public IOweYou() {
        this.owes = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        this.owes.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        return this.owes.getOrDefault(toWhom, 0.0);
    }

    public static void main(String[] args) {
        IOweYou iOweYou = new IOweYou();
        iOweYou.setSum("Arthur", 51.5);
        iOweYou.setSum("Michael", 30.0);

        System.out.println(iOweYou.howMuchDoIOweTo("Arthur"));
        System.out.println(iOweYou.howMuchDoIOweTo("Michael"));
        System.out.println(iOweYou.howMuchDoIOweTo("Matti"));
    }
}
