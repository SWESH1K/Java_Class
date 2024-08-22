class MyBox4 {
    double width;
    double height;
    double depth;

    MyBox4() {
        System.out.println("Constructing Box...");
        width = 10;
        height = 20;
        depth = 15;
    }

    double volume() {
        return width*height*depth;
    }
}
public class BoxDemo6 {
    public static void main(String[] args) {
        MyBox4 mybox1 = new MyBox4();
        MyBox4 mybox2 = new MyBox4();
        double vol;

        // Calling the volume of the box 1
        vol = mybox1.volume();
        System.out.println("The volume of box1 is " + vol);
        // Calling the volume of the box 2
        vol = mybox2.volume();
        System.out.println("The volume of box2 is " + vol);
    }
}
