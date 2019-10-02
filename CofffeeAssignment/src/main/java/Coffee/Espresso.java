package Coffee;

import behaviors.display;

public class Espresso extends Coffee implements display {
    public Espresso(int sugar, int milk) {
        super(sugar, milk);
    }

    public void display() {
        String s = super.getType() + ":" +" Espresso" + " is now ready";
        System.out.println(s);
    }
}
