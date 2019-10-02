package Tea;

import behaviors.display;

public class Yellow_Tea extends Tea implements display {
    public Yellow_Tea(int sugar, int milk) {
        super(sugar, milk);
    }

    public void display() {
        String s = super.getType() + ":" +" Yellow_Tea" + " is now ready";
        System.out.println(s);
    }
}
