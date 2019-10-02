package Coffee;

import behaviors.display;

public class Americano extends Coffee implements display {

    public Americano(int sugar, int milk) {
        super(sugar, milk);
    }

    public void display() {
        String s = super.getType() + ":" +" Americano" + " is now ready";
        System.out.println(s);
    }
}
