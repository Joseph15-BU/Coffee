import Coffee.Americano;
import Coffee.Espresso;
import Coffee.Latte;
import Tea.Black_Tea;
import Tea.Green_Tea;
import Tea.Yellow_Tea;

import java.util.Scanner;

public class Main {
    public static void main(String []args){
        maker();
    }
    public static void maker(){
        Scanner input = new Scanner(System.in);
        System.out.println("PLease choose Coffee or Tea");
        String bev = input.nextLine();
        bev.toLowerCase();
        if (bev.equals("coffee")){
            System.out.println("please choose coffee type Americano, Latte, Espresso");
            String coffee = input.nextLine();
            coffee.toLowerCase();
            if (coffee.equals("americano")){
                System.out.println("enter amount of sugar(max is 3)");
                int sugar = input.nextInt();
                System.out.println("enter amount of milk");
                int milk = input.nextInt();
                Americano a = new Americano(sugar, milk);
                a.display();
            }
            if (coffee.equals("espresso")){
                System.out.println("enter amount of sugar(max is 3)");
                int sugar = input.nextInt();
                System.out.println("enter amount of milk");
                int milk = input.nextInt();
                Espresso e = new Espresso(sugar, milk);
                e.display();
            }
            if (coffee.equals("latte")){
                System.out.println("enter amount of sugar(max is 3)");
                int sugar = input.nextInt();
                System.out.println("enter amount of milk");
                int milk = input.nextInt();
                Latte l = new Latte(sugar, milk);
                l.display();
            }
        }
        else if (bev.equals("tea")){
            System.out.println("please choose Tea type yellow, green, black");
            String tea = input.nextLine();
            tea.toLowerCase();
            if (tea.equals("black")){
                System.out.println("enter amount of sugar(max is 3)");
                int sugar = input.nextInt();
                System.out.println("enter amount of milk");
                int milk = input.nextInt();
                Black_Tea b = new Black_Tea(sugar, milk);
                b.display();
            }
            if (tea.equals("yellow")){
                System.out.println("enter amount of sugar(max is 3)");
                int sugar = input.nextInt();
                System.out.println("enter amount of milk");
                int milk = input.nextInt();
                Yellow_Tea y = new Yellow_Tea(sugar, milk);
                y.display();
            }
            if (tea.equals("green")){
                System.out.println("enter amount of sugar(max is 3)");
                int sugar = input.nextInt();
                System.out.println("enter amount of milk");
                int milk = input.nextInt();
                Green_Tea g = new Green_Tea(sugar, milk);
                g.display();
            }
        }
    }
}
