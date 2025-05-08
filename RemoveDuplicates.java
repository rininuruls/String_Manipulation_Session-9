import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan sebuah kata/kalimat: ");

        String input = scanner.nextLine();
        scanner.close();

        String result = removeDuplicates(input);
        System.out.println("Setelah menghapus karakter duplikat: " + result);


    }
    public static String removeDuplicates(String str) {
        Set<Character> seen = new LinkedHashSet<>();
        StringBuilder result = new StringBuilder();

        for (char c : str .toCharArray()) {
            if (!seen.contains(c)) {
                seen.add(c);
                result.append(c);



            }
        }
          return result.toString();

    }
}