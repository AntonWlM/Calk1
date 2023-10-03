import java.util.Scanner;

public class NewCalk {
    public static void main(String[] args) throws RuntimeException {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.replaceAll("\"", "");
        String[] ords = str.split("[+*/]");
        String a;
        String b;
        if (str.contains("-")) {
            ords = str.split(" - ");
            a = ords[0];
            b = ords[1];}
        else {
            a = ords[0];
            b = ords[1];
        }
        if (ords.length < 1) throw new RuntimeException("строка не является допустимой операцией");
        if (ords.length > 2) throw new RuntimeException("превышено допустимое число операндов");
        if (parseStrToInt(a)) throw new RuntimeException("некорректная операция, число должно быть во втором операнде");
        if (a.length() > 12 || b.length() > 12)
            throw new RuntimeException("Превышена предельно допустимая длина строки (10 символов)");
        if (str.contains("+")) {
            a = a.replaceAll(" ", "");
            b = b.replaceAll(" ", "");
            System.out.println(a + b);
        } else if (str.contains("-")) {
            if (a.indexOf(b)<0) {
                System.out.println("\"" + a + "\"");}
            else  {
            b = b.replaceAll(" ", "");
            String c = a.replace(b, "");
            System.out.println("\"" + c + "\"");}
        } else if (str.contains("/")) {
            b = b.replaceAll(" ", "");
            int b1 = Integer.parseInt(b);
            if (b1<1||b1>10) throw new RuntimeException("Введенное число вне диапазона от 1 до 10");
            int x = a.length() / b1;
            System.out.println(a.substring(0,x));
        } else if (str.contains("*")) {
            a = a.replaceAll(" ", "");
            b = b.replaceAll(" ", "");
            String a1 = a;
            int b1 = Integer.parseInt(b);
            if (b1<1||b1>10) throw new RuntimeException("Введенное число вне диапазона от 1 до 10");
            for (int i = 1; i < b1; i++) {
                a1 += a;}
            if (a1.length() >= 40) {
                a1 = a1.substring(0, 40);
                System.out.println(a1 + "...");
            } else {
                System.out.println("\"" + a1 + "\"");
            }
        } else throw new RuntimeException("строка не является допустимой операцией");
    }
    static boolean parseStrToInt(String str) {
        if (str.matches("\\d+")) {
            return false;
        } else {
            return true;
        }
    }
}