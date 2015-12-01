import java.util.HashMap;

public class UniqueCharacters {

  public static boolean hasUniqueCharacters(String s) {
    HashMap<Integer, Integer> characterMap = new HashMap<Integer, Integer>();
    for(int i = 0;i < s.length(); i++) {
      if(characterMap.get(s.charAt(i) - '0') != null) {
        return false;
      }
      else {
        characterMap.put(s.charAt(i) - '0', 1);
      }
    }
    return true;
  }

  
  public static void main(String[] args) {
    System.out.println(hasUniqueCharacters("Strings"));
  }
}
