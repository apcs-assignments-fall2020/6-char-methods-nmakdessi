import java.util.Scanner;

public class MyMain {

    // Changes a capital letter to a lowercase letter
    // If the char is not an uppercase letter, 
    // it is returned unchanged. 
    public static char toLower(char ch) {
        if(ch >= 'a' && ch <= 'z'){
            return ch;
        }
        else{
            return (char) (ch + 32);
        }
    }

    // Returns a copy of a String, where all letters 
    // are now lowercase
    public static String myToLowerCase(String str) {
        String lower = "";
        for(int i = 0; i < str.length(); i++){
            lower += toLower(str.charAt(i));
        }
        return lower;
    }

    // Changes a lowercase letter to an uppercase letter
    // If the char is not an lowercase letter, 
    // it is returned unchanged. 
    public static char toUpper(char ch) {
        if(ch >= 97 && ch <= 122){
            return ch;
        }
        else{
            return (char) (ch - 32);
        }
    }

    // Returns a copy of a String, where all letters 
    // are now uppercase
    public static String myToUpperCase(String str) {
        String upper = "";
        for(int i = 0; i < str.length(); i++){
            upper += toLower(str.charAt(i));
        }
        return upper;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string");
        String input = scan.next();
        System.out.println("would you like to make your stringlowercase or uppercase?");
        String choice = scan.next();
        if (choice == "lowercase") {
            System.out.println(myToLowerCase(input));
        }
        if (choice == "uppercase") {
            System.out.println(myToUpperCase(input));
        }
        scan.close();
        
    }
}
