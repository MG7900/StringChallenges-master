/***
 * Problem: You are given a long string containing a hidden word.
 * Write a function that finds and prints
 * the word hidden between two markers ("start" and "end").
 * Expected output: Hidden word: Hello
 */

public class C1_HiddenWordFinder {

    public static void main(String[] args) {
        C1_HiddenWordFinder c = new C1_HiddenWordFinder();
    }

    public C1_HiddenWordFinder() {
        String sentence = "This is a test startHelloend string.";
        findHiddenWord(sentence);  // Output: Hidden word: Hello
    }

    public void findHiddenWord(String sentence) {
        /* TODO: your code goes here */
        int end_index = sentence.lastIndexOf("end");
        int start_start_index = sentence.lastIndexOf("start",end_index);
        int start_end_index = start_start_index + 5;
        String hidden_word_index = sentence.substring(start_end_index,end_index);
        System.out.println("Hidden word: " + hidden_word_index);
    }

}
