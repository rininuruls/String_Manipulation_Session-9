import java.util.Scanner;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public  class Vowles {
     private static final  Set<Character> VOWLES = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'U');

     public Vowles(){

     }
     public static void main(String[]args){
    Scanner userinput = new Scanner(System.in);
    String kata = userinput.nextLine();
    long vowelCount = countVowels (kata);
    System.out.println("Kalimat: \""+ kata + "\"");
    System.out.println("Jumlah huruf vokal:" + vowelCount);
    userinput.close();
     }

     public static long countVowels(String str){
        if (str != null && !str.isEmpty()){
            IntStream var10000 = IntStream.range(0, str.length());
            str.getClass();
            Stream var1 = var10000.mapToObj(str:: charAt);
            Set var1001 = VOWLES;
            var1001.getClass();
            return var1.filter(var1001::contains).count();
        } else {
            return 0;
        }
     }
}

