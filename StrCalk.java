import java.util.Scanner;

public class StrCalk {
    public static void main(String[] args) {
        System.out.println("Введите операцию");
        Scanner sc = new Scanner(System.in);
        String scline = sc.nextLine();
        Validation.getValidation(scline);
        Validation.getCalkulation(scline);
    }

    static class Validation {
        String a;
        String b;
        String ords;

        public static String getValidation(String scline) throws RuntimeException {
            if (scline.isEmpty()) {
                throw new RuntimeException("введена пустая строка");
            }
            if (!scline.startsWith("\"")) {
                throw new RuntimeException(("операция должна начинаться со строки"));
            }
            if ((scline.contains("*") || scline.contains("/")) && scline.endsWith("\"")) {
                throw new RuntimeException("нельзя делить или умножать на строку");
            }
            return scline;
        }

        public static void getCalkulation(String scline) throws RuntimeException {
            String[] ords = scline.split("\" ", 0);
            if (ords.length < 1 || ords.length > 2) {
                throw new RuntimeException("недопустимое число операндов");
            }
            String a = ords[0];
            String b = ords[1];
            if (a.length() > 11) {
                throw new RuntimeException("слова не могут быть больше 10 символов");
            }
            a = a.replaceAll("\"", "");
            if (b.contains("+")) {
                b = b.substring(2).replaceAll("\"", "");
                System.out.println(a + b);
            } else if (b.contains("-")) {
                b = b.substring(2).replaceAll("\"", "");
                if (a.indexOf(b) < 0) {
                    System.out.println("\"" + a + "\"");
                } else {
                    String c = a.replace(b, "");
                    System.out.println("\"" + c + "\"");
                }
            } else if (b.contains("/")) {
                b = b.substring(2);
                int b1 = Integer.parseInt(b);
                if (b1 < 1 || b1 > 10) throw new RuntimeException("Введенное число вне диапазона от 1 до 10");
                int x = a.length() / b1;
                System.out.println(a.substring(0, x));
            } else if (b.contains("*")) {
                b = b.substring(2);
                String a1 = a;
                int b1 = Integer.parseInt(b);
                if (b1 < 1 || b1 > 10) throw new RuntimeException("Введенное число вне диапазона от 1 до 10");
                for (int i = 1; i < b1; i++) {
                    a1 += a;
                }
                if (a1.length() >= 40) {
                    a1 = a1.substring(0, 40);
                    System.out.println(a1 + "...");
                } else {
                    System.out.println("\"" + a1 + "\"");
                }
            } else throw new RuntimeException("строка не является допустимой операцией");
        }
    }
}