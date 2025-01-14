package Patterns.Strategy.Example1;

public class NetBanking implements PaymentMethod{
    String name;
    String password;

    public NetBanking(String name, String password) {
        this.name = name;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid $"+amount+" via NetBanking");
    }
}
