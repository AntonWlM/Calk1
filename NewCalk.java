import java.util.Scanner;

public class NewCalk {
    public static void main(String[] args) throws RuntimeException {


      Scanner sc = new Scanner(System.in);
      String line = sc.nextLine();
      line = line.replaceAll("\"","");
      String [] ords = line.split(" ");
      if (ords.length < 2) throw new RuntimeException ("строка не является допустимой операцией");
      if (ords.length > 3) throw new RuntimeException("превышено допустимое число операндов");
      String a = ords[0];
      String b = ords[2];
      String op = ords[1];
      if (a.length() > 10 || b.length() > 10 || op.length() > 1) throw new RuntimeException("Превышена предельно допустимая длина строки (10 символов)");


        System.out.println(a + b);

    }
    static String calc(String a, String b, String op);

}
