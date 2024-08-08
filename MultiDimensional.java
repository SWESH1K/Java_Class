public class MultiDimensional { // 2310080053
    public static void main(String[] args) {
        int twoD[][] = new int[4][5];
        int k = 10;

        for(int i=0; i<4; i++) {
            for(int j=0; j<5; j++) {
                twoD[i][j] = k;
                k++;
            }
        }

        for(int i=0; i<4; i++) {
            for(int j=0; j<5; j++) {
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }
    }
}
