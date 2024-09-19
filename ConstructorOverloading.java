class ConsOverloadingDemo {
    double width;
    double height;
    double depth;

    ConsOverloadingDemo(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    ConsOverloadingDemo() {
        this.width = -1;
        this.height = -1;
        this.depth = -1;
    }
    ConsOverloadingDemo(double len) {
        this.width = this.height = this.depth = len;
    }

    double volume() {
        return width*height*depth;
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        ConsOverloadingDemo mybox1 = new ConsOverloadingDemo(10, 20, 15);
        ConsOverloadingDemo mybox2 = new ConsOverloadingDemo();
        ConsOverloadingDemo mybox3 = new ConsOverloadingDemo(10);
        double vol;
        //Volume of first box
        vol = mybox1.volume();
        System.out.println("The Volume of box 1 is " + vol);
        //Volume of Second box
        vol = mybox2.volume();
        System.out.println("The Volume of box 2 is " + vol);
        //Volume of Third box
        vol = mybox3.volume();
        System.out.println("The Volume of box 3 is " + vol);
    }
}
