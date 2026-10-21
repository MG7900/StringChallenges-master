import java.util.ArrayList;

/***
 * Problem: Write a method that takes a sentence and reverses
 * each word individually without changing their positions.
 * Expected output: avaJ si emosewa
 */

public class E_WordReverser {

    public static void main(String[] args) {
        E_WordReverser e = new E_WordReverser();
    }

    public E_WordReverser() {
        String sentence = "Java is awesome";
        reverseWords(sentence);  // Output: avaJ si emosewa
    }

    public void reverseWords(String sentence) {
        /* TODO: your code goes here */

        int start_of_word = 0;
        String reversed_sentence = "";
        ArrayList<String> new_words = new ArrayList<String>();
        //ArrayList from https://www.w3schools.com/java/java_arraylist.asp

        //obtain the length of the sentence
        //check how many spaces there are
        //use that to figure out how many words are there
        for(int i = 0; i < sentence.length(); i++){
            if(sentence.charAt(i) == ' '){
                new_words.add(sentence.substring(start_of_word, i));
                start_of_word = start_of_word + 1;
                //this is to get to the word on the right of the space character
            }
        }

        if(start_of_word < sentence.length()){
            new_words.add(sentence.substring(start_of_word));
        }

        //for every element in arraylist
        for(int x = 0; x < new_words.size(); x++) {
            String current_word = new_words.get(x);
            String reversed_word = "";

            for(int l = current_word.length() - 1; l >= 0; l--){
                reversed_word = reversed_word + current_word.charAt(l);
            }
            reversed_sentence = reversed_sentence + reversed_word + " ";
        }
        System.out.println(reversed_sentence);
    }
}
