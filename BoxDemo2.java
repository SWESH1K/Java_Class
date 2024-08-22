public class BoxDemo2 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        // Giving value to mybox1 instance variables
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        // Giving value to mybox2 instance variables
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        // Finding the volume of the box 1
        vol = mybox1.depth * mybox1.height * mybox1.width;
        System.out.println("The volume of box1 is " + vol);
        // Finding the volume of the box 1
        vol = mybox2.depth * mybox2.height * mybox2.width;
        System.out.println("The volume of box1 is " + vol);
    }
}
