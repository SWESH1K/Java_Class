class MyBox3 {
    double width;
    double height;
    double depth;

    double volume() {
        return width*height*depth;
    }
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}
public class BoxDemo5 {
    public static void main(String[] args) {
        MyBox3 mybox1 = new MyBox3();
        MyBox3 mybox2 = new MyBox3();
        double vol;

        // Giving value to mybox1 instance variables
        mybox1.setDim(10, 20, 15);

        // Giving value to mybox2 instance variables
        mybox2.setDim(3, 6, 9);

        // Calling the volume of the box 1
        vol = mybox1.volume();
        System.out.println("The volume of box1 is " + vol);
        // Calling the volume of the box 2
        vol = mybox2.volume();
        System.out.println("The volume of box2 is " + vol);
    }
}
