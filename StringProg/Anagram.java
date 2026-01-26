
import java.lang.reflect.Array;
import java.util.Arrays; 

public class Anagram {
    public static  Boolean anagram(String str1,String str2){
     
    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();

    if (str1.length()!= str2.length()) {
      return  false;
    } 

    char string1 [] = str1.toCharArray();
    char string2 [] = str2.toCharArray();
     
           // sort both arrays
        Arrays.sort(string1);
        Arrays.sort(string2);

        return Arrays.equals(string1, string2);

    }
    public static void main(String[] args) {
        Anagram obj = new Anagram();
       
        if (obj.anagram("rat", "tar")) {
            System.out.println("String is  Anagram");
        } else {
            System.out.println("String are not Anagram");
        }
    }
}
