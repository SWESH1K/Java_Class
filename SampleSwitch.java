public class SampleSwitch { // 2310080053
    public static void main(String[] args) {
        for(int i=0; i<6; i++) {
            switch (i) {
                case 0:
                    System.out.println("i is a zero.");
                    break;
                case 1:
                    System.out.println("i is a one.");
                    break;
                case 2:
                    System.out.println("i is a two.");
                    break;
                case 3:
                    System.out.println("i is a three.");
                    break;
                default:
                    System.out.println("i is greater than four.");
                    break;
            }
        }
    }
}
