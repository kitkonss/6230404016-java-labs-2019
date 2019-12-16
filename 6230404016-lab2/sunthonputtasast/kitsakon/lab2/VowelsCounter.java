/**
 * count vowels in the sentences.
*
* Author: Kitsakon Sunthonputtasast
* ID: 623040401-6
* Sec: 1
* Date: December 16, 2019
*
**/
package sunthonputtasast.kitsakon.lab2;
public class VowelsCounter {
    public static void main(String args[]) {
        int count = 0;
        String word = args[0];
        for (int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
             c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ) {
                count++ ;
            }
        }
        System.out.println("Total number of towels is " + count);
    } 
} 