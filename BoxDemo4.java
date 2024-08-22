class MyBox2 {
    double width;
    double height;
    double depth;

    double volume() {
        return width*height*depth;
    }
}
public class BoxDemo4 {
    public static void main(String[] args) {
        MyBox2 mybox1 = new MyBox2();
        MyBox2 mybox2 = new MyBox2();
        double vol;

        // Giving value to mybox1 instance variables
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        // Giving value to mybox2 instance variables
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        // Calling the volume of the box 1
        vol = mybox1.volume();
        System.out.println("The volume of box1 is " + vol);
        // Calling the volume of the box 2
        vol = mybox2.volume();
        System.out.println("The volume of box2 is " + vol);
    }
}
