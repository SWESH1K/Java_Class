import java.util.Scanner;

class LivingBeing {
    void introduction() {
        System.out.println("I am a living being");
    }
}

class Human extends LivingBeing {
    void introduction() {
        System.out.println("Hello, I am a human.");
    }
}

class Monkey extends LivingBeing {
    void introduction() {
        System.out.println("Hello, I am a Monkey.");
    }
}

public class Living_DynamicPolymorphism {
    public static void main(String[] args) {
        LivingBeing obj;
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        if(name.equals("rohan")) {
            obj = new Monkey();
        }
        else {
            obj = new Human();
        }

        obj.introduction();
    }
}