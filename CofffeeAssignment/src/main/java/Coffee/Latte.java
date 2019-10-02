package Coffee;

import behaviors.display;

public class Latte extends Coffee implements display {
    public Latte(int sugar, int milk) {
        super(sugar, milk);
    }
    public void display(){
        String s = super.getType() + ":" +" Latte" + " is now ready";
        System.out.println(s);
    }
}
