package ca.practice.interview;

public class StringReverse {


    public String reverseString () {
        String s = "vijay";
        char c;
        String reverse = "";
        for(int i=0; i<s.length(); i++) {
           c =  s.charAt(i);
    reverse = c+reverse;
        }
        return reverse;
    }

    public static void main(String... ar) {
    System.out.println( new StringReverse().reverseString());
    }
}
