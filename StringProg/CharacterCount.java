public class CharacterCount {

    String countChar(String word){
      int count[] = new  int[256];
      String result = "";
      for (int i = 0; i < word.length(); i++) {
        char ch = word.charAt(i);
        count[ch]++;
    
      }

      for (int i = 0; i < 256; i++) {
          if (count[i]>0) {
            result = result +(char) i +"="+ count[i]+"\n";
          }
      }
      return  result;

    }
    
    public static void main(String[] args) {
         CharacterCount obj = new CharacterCount();
        String word = "Aaditya";
        System.out.println(obj.countChar(word));
    }
}
