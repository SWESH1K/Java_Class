class ForLoopContinue {
    public static void main(String args[]){
        for(int i=0;i<10;i++){
            System.out.print(i+" ");
            if(i%2 == 0) continue;
            //Continue is used to skip that particular point and then continue the remaining
            System.out.println(" ");
        }
    }
}
