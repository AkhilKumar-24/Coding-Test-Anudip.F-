package akhil;

public class Reveresed {
    public static void main(String[] args) {
        // Original string
        String str = "Hello World";

        // Reverse the string using StringBuilder
        String reversed = new StringBuilder(str).reverse().toString();

        // Print the reversed string
        System.out.println(reversed); // Output: "dlroW olleH"
    }
}
