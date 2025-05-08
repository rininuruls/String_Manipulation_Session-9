import java.util.Scanner;

public class Palindrome {
    public Palindrome() {
    }

    public static void main(String[]args) throws Exception {
        Scanner userinput = new Scanner(System.in);
        String kataPalindrome = "";
        System.out.println("\t Menentukan kata Palindrome\n;");
        System.out.print("Masukin kata Palindrome :");
        String kata = userinput.nextLine();
        int panjangkata = kata.length();

        for(int i = panjangkata - 1; i >= 0; --i) {
            kataPalindrome = kataPalindrome + kata.charAt(i);
            
        if (kata.equals(kataPalindrome)) {
            System.out.println("\n termasuk ke kata palindrome");
        }else {
            System.out.println("\n bukan kata palindrome");
            userinput.close();
        }
        }   
        }
            






        


    }

