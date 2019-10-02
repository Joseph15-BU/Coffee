package Tea;

import behaviors.display;

public class Green_Tea extends Tea implements display {
    public Green_Tea(int sugar, int milk) {
        super(sugar, milk);
    }

    public void display() {
        String s = super.getType() + ":" +" Green tea" + " is now ready";
        System.out.println(s);
    }
}
