package reflection;

public class Suitable {
    private String seed = "SweetHeart";
    public double latte = 3.0;
    protected int nut = 22;

    private void doSomething(String a,int b){
        System.out.println("Bunny Drop");
        System.out.println(a+b);
    }

    public boolean drinkLatte(double x){
        System.out.println(x);
        return true;
    }

    protected int makeNut(int z){
        System.out.println(z);
        return 0;
    }

}
