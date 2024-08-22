class MyBox {
    double width;
    double height;
    double depth;

    void volume() {
        System.out.print("The Volume is ");
        System.out.println(width * depth * height);
    }
}
public class BoxDemo3 {
    public static void main(String[] args) {
        MyBox mybox1 = new MyBox();
        MyBox mybox2 = new MyBox();
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
        mybox1.volume();
        // Calling the volume of the box 2
        mybox2.volume();
    }
}
