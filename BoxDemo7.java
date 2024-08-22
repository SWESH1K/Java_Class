class MyBox5 {
    double width;
    double height;
    double depth;
    MyBox5(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    double volume() {
        return width*height*depth;
    }
}
public class BoxDemo7 {
    public static void main(String[] args) {
        MyBox5 mybox1 = new MyBox5(10, 20, 15);
        MyBox5 mybox2 = new MyBox5(2, 6, 9);
        double vol;

        // Calling the volume of the box 1
        vol = mybox1.volume();
        System.out.println("The volume of box1 is " + vol);
        // Calling the volume of the box 2
        vol = mybox2.volume();
        System.out.println("The volume of box2 is " + vol);
    }
}
