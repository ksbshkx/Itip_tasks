import java.security.NoSuchAlgorithmException;
import java.util.Random;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        System.out.println(duplicateChars("Donald"));
        System.out.println(duplicateChars("orange"));
        System.out.println(getInitials("Ryan Gosling"));
        System.out.println(getInitials("Barack Obama"));
        System.out.println(differenceEvenOdd(new int[]{44, 32, 86, 19}));
        System.out.println(differenceEvenOdd(new int[]{22, 50, 16, 63, 31, 55}));
        System.out.println(equalToAvg(new int[]{1, 2, 3, 4, 5}));
        System.out.println(equalToAvg(new int[]{1, 2, 3, 4, 6}));
        System.out.println(indexMult(new int[]{1, 2, 3}));
        System.out.println(indexMult(new int[]{3, 3, -2, 408, 3, 31}));
        System.out.println(reverse("Hello World"));
        System.out.println(reverse("The quick brown fox."));
        System.out.println(Tribonacci(7));
        System.out.println(Tribonacci(11));
        System.out.println(pseudoHash(5));
        System.out.println(pseudoHash(10));
        System.out.println(botHelper("Hello, I’m under the water, please help me"));
        System.out.println(botHelper("Two pepperoni pizzas please"));
        System.out.println(isAnagramSort("listen", "silent"));
        System.out.println(isAnagramSort("eleven plus two", "twelve plus one"));
        System.out.println(isAnagramSort("hello", "world"));
    }
    //1
    public static String duplicateChars (String x){
        x = x.toLowerCase();
        for (int i = 0 ; i < x.length(); i++){
            for (int b = i+1 ; b < x.length(); b++){
                if (x.charAt(i) == (x.charAt(b)) ) {
                    return "True";
                }
            }
        }
        return "False";
    }

    //2
    public static String getInitials (String x){
        for (int i = 0 ; i < x.length(); i++){
            String n =  String.valueOf(x.charAt(0));
            if (x.charAt(i) == ' '){
                i++;
                String v = String.valueOf(x.charAt(i));
                return (n + v);
            }
        }
        return "false" ;
    }

    //3
    public static int differenceEvenOdd(int[] arr) {
        int chet = 0;
        int nechet = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                chet += num;
            }
            else {
                nechet += num;
            }
        }
        return Math.max(chet, nechet) - Math.min(chet, nechet);
    }

    //4
    public static boolean equalToAvg(int[] arr) {
        float y = 0;
        float b = 0;
        boolean flag = false;
        for(int i = 0; i < arr.length; i++) {
            y = y + arr[i];
        }
        b = y / arr.length;
        for (int i2 = 0; i2 < arr.length; i2++) {
            if(b == i2) {
                flag = true;
            }
        }
        return flag;
    }

    //5
    public static String indexMult(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
        arr[i] = arr[i] * i;
    }
        return Arrays.toString(arr);
    }

    //6
    public static String reverse(String str){
        StringBuilder rev = new StringBuilder(str);
        return rev.reverse().toString();
}

    //7
    public static int Tribonacci(int num) {
        int[] mas = new int [num];
        mas[0] = 0;
        mas[1] = 0;
        mas[2] = 1;
        int b = mas[0];
        for (int i = 3; i < num; i++) {
            b = mas[i] = mas[i - 3] + mas[i - 2] + mas[i - 1];
        }
        return b;
    }
    //8
    public static String pseudoHash(int x) {
        String ABC = "abcdef0123456789";
        String hash = "";
        for(int i = 0; i<x; i++){
            int rand = (int) (Math.random()*((15)+1));
            hash+=String.valueOf(ABC.charAt(rand));
        }
        if (hash == "")
            return "\"\"";
        else
            return hash;
    }

    //9
    public static String botHelper(String x){
        x = x.toLowerCase();
        String y = "";
        String coc = "Calling for a staff member";
        String sos = "Keep waiting";
        boolean contrains = x.contains("help");
        if (contrains) {
            y = coc;
        }
        else if (contrains == false) {
            y = sos;
        }
        return y;
    }

    //10
    public static boolean isAnagramSort(String string1, String string2) {
        if (string1.length() != string2.length()) {
            return false;
        }
        char[] mas = string1.toCharArray();
        char[] arr = string2.toCharArray();
        Arrays.sort(mas);
        Arrays.sort(arr);
        return Arrays.equals(mas, arr);
    }
}