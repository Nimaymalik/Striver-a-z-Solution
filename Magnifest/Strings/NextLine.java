package Magnifest.Strings;

public class NextLine {

    public static void main(String[] args) {
        String input = "He is a very very good boy, isn't he?";

        String[] words = input.split("\\s+[^a-zA-Z]+");

        for (String word : words) {
            String[] parts = word.split("[^a-zA-Z]+");
            System.out.println(parts.length);


            for (String part : parts) {
                    System.out.println(part);
            }
        }
    }
}
