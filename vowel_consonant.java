public class vowel_consonant {
    public static void main(String[] args) {
        char c = 'X';

        if((c>='a' && c<='z') || (c>='A' && c<='Z')) {
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U') {
                System.out.println(c + " is a vowel.");
            }
            else {
                System.out.println(c + " is not a vowel.");
            }
        }
        else {
            System.out.println("Given input is not an alphabet.");
        }
    }
}
