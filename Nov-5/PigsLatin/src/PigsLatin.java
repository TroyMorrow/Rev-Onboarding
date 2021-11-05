public class PigsLatin {
    public static void main(String[] args) {

    }

    public String PL(String sentence){
        String words[] = sentence.split(" ");
        String pigLatin[words.length];
        for(String word : words){
            if(word.charAt(0) == 'A' || word.charAt(0) == 'E'|| word.charAt(0) == 'i' || word.charAt(0) == 'O' || word.charAt(0) == 'U'){
                word = word + "way";
            }else if(word.charAt(0) == 'a' || word.charAt(0) == 'e'|| word.charAt(0) == 'i' || word.charAt(0) == 'o' || word.charAt(0) == 'u'){
                word = word + "way";
            }else{
                char letter = word.charAt(0);
                //from here I would move the letter at index 0 to the end of the string and then add "ay" to the end of the word
            }
    }
}
