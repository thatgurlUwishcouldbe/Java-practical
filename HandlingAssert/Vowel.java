package Rrr;

public class Vowel {
    public static boolean isVowel(char C){
        assert Character.isLetter(C): "Input is letter";
        
        C = Character.toLowerCase(C);
        assert "aeiou".indexOf(C) >= 0 || "aeiou".indexOf(C) == -1 : "Post-condition failed";
        return "aeiou".indexOf(C) >= 0; 
    } 
    
    public static void main(String[] args) {
        //isVowel('R');
        isVowel('O');
        isVowel('1');
    }
}
