/***
 * Problem: In social media, hashtags always start with the "#" symbol.
 * Write a method that extracts and prints all the hashtags from a given string.
 * Expected output: Hashtag: #coding, Hashtag: #Java
 */

public class B_HashtagExtractor {
    String hashtag;

    public static void main(String[] args) {
        B_HashtagExtractor b = new B_HashtagExtractor();
    }

    public B_HashtagExtractor() {
        String post = "I love #coding and #Java!";
        extractHashtags(post); // Output: Hashtag: #coding, Hashtag: #Java
    }

    public void extractHashtags(String post) {
        /* TODO: your code goes here */

        int hash_tag_count = 0;

        for(int x = 0; x < post.length(); x++){
            if (post.charAt(x) == '#'){
                hash_tag_count = hash_tag_count + 1;
            }
        }

        //above looping for hashtagsw

        int search_from_index = 0;
        for (int i = 0; i < hash_tag_count; i++){

            int hash_index = post.indexOf('#', search_from_index);
            int space_index = post.indexOf(' ', hash_index);

            if(space_index == -1){
                space_index = post.length();
            }

            hashtag = post.substring(hash_index, space_index);
            System.out.println("Hashtag " + (i + 1) + ": " + hashtag);
            search_from_index = space_index;
            //so that the next iteration starts after the position where the previous hashtag was found
        }
    }

}
