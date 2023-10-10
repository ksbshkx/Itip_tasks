public class Main {
     public static void main(String[] args) {
     System.out.println(convert(5));
     System.out.println(convert(3));
     System.out.println(convert(8));
     System.out.println(fitCalc(15, 1));
     System.out.println(fitCalc(24, 2));
     System.out.println(fitCalc(41, 3));
     System.out.println(containers(3, 4, 2));
     System.out.println(containers(5, 0, 2));
     System.out.println(containers(4, 1, 4));
     System.out.println(triangleType(5, 5, 5));
     System.out.println(triangleType(5, 4, 5));
     System.out.println(triangleType(3, 4, 5));
     System.out.println(triangleType(5, 1, 1));
     System.out.println(ternaryEvaluation(8, 4));
     System.out.println(ternaryEvaluation(1, 11));
     System.out.println(ternaryEvaluation(5, 9));
     System.out.println(howManyItems(22, 1.4F, 2));
     System.out.println(howManyItems(45, 1.8F, 1.9f));
     System.out.println(howManyItems(100, 2F, 2));
     System.out.println(factorial(0));
     System.out.println(factorial(5));
     System.out.println(factorial(7));
     System.out.println(gcd(48, 18));
     System.out.println(gcd(52, 8));
     System.out.println(gcd(259, 28));
     System.out.println(ticketSaler(70, 1500));
     System.out.println(ticketSaler(24, 950));
     System.out.println(ticketSaler(53, 1250));
     System.out.println(tables(5, 2));
     System.out.println(tables(31, 20));
     System.out.println(tables(123, 58));
     }

     //1
     public static float convert(int liters) {
          return liters * 3.785f;
     }

     //2
     public static int fitCalc(int minutes, int intensity) {
          return minutes * intensity;
     }

     //3
     public static int containers(int box, int bag, int barrel) {
          return box * 20 + bag * 50 + barrel * 100;
     }

     //4
     public static String triangleType(int x, int y, int z) {
          if (x == y & y == z & x + y > z & z + y > x & x + z > y) {
               return "isosceles";
          } else if (x == y & y != z & x + y > z & z + y > x & x + z > y) {
               return "equtareal";
          } else if (x != y & y == z & x + y > z & z + y > x & x + z > y) {
               return "equtareal";
          } else if (x != z & y == z & x + y > z & z + y > x & x + z > y) {
               return "equtareal";
          } else if (x == z & y != z & x + y > z & z + y > x & x + z > y) {
               return "equtareal";
          } else if (x != y & y != z) {
               return "different-sided";
          }        return "not a triangle";
     }

     //5
     public static int ternaryEvaluation(int a, int b) {
          return a > b ? a : b;
     }

     //6
     public static int howManyItems(int n, float w, float h) {
     //n-длина ткани, w-длина д, h-ширина д
          return  (int) (n / ((w + h) * 2));
     }

     //7
     public static int factorial(int num) {
          int result = 1;
          for (int i = 1; i <= num; i++) {
               result = result * i;
          }
          return result;
     }

     //8
     public static float gcd(int x, int y) {
          while (x != y) {
               if (x > y) {
               x = x - y;
          }
               else {
               y = y - x;
               }
          }
          return x;
     }

     //9
     public static float ticketSaler(int count, int cost){
          return (float) (count * cost * 0.72);
     }

     //10
     public static int tables(int student, int desk){
          if (desk * 2 < student) {
          return (student - (desk * 2));
          }
          return 0;
     }
}