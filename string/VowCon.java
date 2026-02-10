public class VowCon {

    static  void vowConsonant(String str){
        str = str.toLowerCase();
        int countV = 0;
        int countC = 0;
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'  || str.charAt(i) == 'o'  || str.charAt(i) == 'u' ) {
                countV++;
            } else if(str.charAt(i) >='a' && str.charAt(i)<='z') {
                countC++;
            }

        }  System.out.println("the number vowel " + countV);
           System.out.println("the number consonant " + countC);

    }

    public static void main(String[] args) {
        vowConsonant("akash is Engineer");
    }
    
}
