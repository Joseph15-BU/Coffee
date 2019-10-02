package Tea;

import behaviors.display;

public class Black_Tea extends Tea implements display {
    public Black_Tea(int sugar, int milk) {
        super(sugar, milk);
    }

    public void display() {
        String s = super.getType() + ":" +" Black_Tea" + " is now ready";
        System.out.println(s);
    }
}
