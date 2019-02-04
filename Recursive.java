import java.util.ArrayList;
public class Recursive{
  static ArrayList<String> words = new ArrayList<String>();
  public static void makeAllWords(int k, String word, int maxLetter){
    if(k == 0){
      words.add(word);
      return;}
    for(int i = 97; i <= 97 + maxLetter; i++){
      makeAllWords(k - 1, word + (char) i, maxLetter);}
  }
  public static String printArray(ArrayList<String> value){
    String output = "";
    for(int i = 0; i < words.size(); i++){
      output += words.get(i);
      output += " ";
    }
    return output;
  }
  public static void main(String[] args){
    makeAllWords(2, "", 26);
    System.out.println(printArray(words));
  }
}
