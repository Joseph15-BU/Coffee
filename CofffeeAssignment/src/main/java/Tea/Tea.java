package Tea;

public class Tea {
    private  String type = "Tea";
    private int sugar;
    private  int milk;

    public Tea(int sugar, int milk) {
        this.type = "Tea";
        this.sugar = sugar;
        this.milk = milk;
    }

    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        if (sugar > 3) {
            System.out.println("exceeded number of sugar");
            this.sugar = 3;
        }else {
            this.sugar = sugar;
        }
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
