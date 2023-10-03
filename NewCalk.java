import java.util.Scanner;

public class NewCalk {
    public static void main(String[] args) throws RuntimeException {


        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.replaceAll("\"", "");
        String[] ords = str.split("[+\\-*/]");
        if (ords.length < 1) throw new RuntimeException("строка не является допустимой операцией");
        if (ords.length > 2) throw new RuntimeException("превышено допустимое число операндов");
        String a = ords[0];
        String b = ords[1];
        if (a.length() > 10 || b.length() > 10)
            throw new RuntimeException("Превышена предельно допустимая длина строки (10 символов)");
        String op;
        if (str.contains("+")) {
            op = "+";
        } else if (str.contains("-")) {
            op = "-";
        } else if (str.contains("/")) {
            op = "/";
        } else if (str.contains("*")) {
            op = "*";
        } else throw new RuntimeException("строка не является допустимой операцией");
        System.out.println(op);
        if (op == "+") {
            a = a.replaceAll(" ", "");
            b = b.replaceAll(" ", "");
            System.out.println(a + b);
        } else if (op == "-") {
            String c = a.replace(b, "");
            System.out.println("\"" + c + "\"");
        } else if (op == "*") {
            a = a.replaceAll(" ", "");
            b = b.replaceAll(" ", "");
            String a1 = a;
            int b1 = Integer.parseInt(b);
            for (int i = 1; i < b1; i++) {
              a1 += a;
            }
            System.out.println("\"" + a1 + "\"");
        } else if (op == "/") {
            int b1 = Integer.parseInt(b);
            int x = a.length() / b1;
           int i;
           for (i = 0; i<x;i++);
           
           System.out.println(a.length(x));
        }

        System.out.println(a);






        System.out.println(a.compareTo(b));

        System.out.println(a + b);

    }
 /*   static String calc(String a, String b, String op);*/

}