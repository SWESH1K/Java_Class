class Box { // 2310080053
    double width;
    double height;
    double depth;
}

public class BoxDemo {
    public static void main(String[] args) {
        Box myBox = new Box();
        double vol;

        // Giving value to myBox instance variables
        myBox.width = 10;
        myBox.height = 20;
        myBox.depth = 15;

        // Finding the volume of the box
        vol = myBox.depth * myBox.height * myBox.width;

        System.out.println("The volum of box is " + vol);
    }
}
