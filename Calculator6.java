import java.util.Scanner;

public class Calculator6 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите пример с двумя оперантами (арабские или римские цифры)");
        String line = sc.nextLine();
        String[] actions = line.split(" ", 0);
        if (line.length() <= 1) {
            throw new Exception("throws Exception //т.к. строка не является математической операцией");
        }
        String a = actions[0];
        String op = actions[1];
        String b = actions[2];
        if (line.length() > 8)
            throw new Exception("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        if (op.equals("/") && b.equals("0")) { throw new Exception("на ноль делить нельзя");}
        char oper = op.charAt(0);

        if (parseStrToInt(a) != 0 && parseStrToInt(b) != 0) {
            int a3 = parseStrToInt(a);
            int b3 = parseStrToInt(b);
            int x;
            {if ((0 <= a3) && (a3 <= 10)) {
                    if ((0 <= b3) && (b3 <= 10)) {
                        switch (oper) {
                            case '+':
                                x = a3 + b3;
                                System.out.println(x);
                                break;
                            case '-':
                                x = a3 - b3;
                                System.out.println(x);
                                break;
                            case '*':
                                x = a3 * b3;
                                System.out.println(x);
                                break;
                            case '/':
                                x = a3 / b3;
                                System.out.println(x);
                                break;
                            default: {
                                throw new Exception("throws Exception //т.к.строка не является математической операцией");
                            }

                        }

                    } else throw new Exception("throws Exception //т.к. введенные числа вне диапазона от 0 до 10");
                } else throw new Exception("throws Exception //т.к. введенные числа вне диапазона от 0 до 10");
            }


        } else if (parseStrToInt(a) == 0 && parseStrToInt(b) == 0) {
            int a3 = parseRimToArab(a);
            int b3 = parseRimToArab(b);
            int x = 0;
            if (a3 == 0 || b3 == 0) {throw new Exception("throws Exception //т.к. используются одновременно разные системы счисления");}
            switch (oper) {
                case '+':
                    x = a3 + b3;
                    parseArabToRim(x);
                    break;
                case '-':
                    x = a3 - b3;
                    parseArabToRim(x);
                    break;
                case '*':
                    x = a3 * b3;
                    parseArabToRim(x);
                    break;
                case '/':
                    x = a3 / b3;
                    parseArabToRim(x);
                    break;
                default:
            }


        } else {
            throw new Exception("throws Exception //т.к. используются одновременно разные системы счисления");
        }


    }

    static int parseStrToInt(String str) {
        if (str.matches("\\d+")) {
            return Integer.parseInt(str);
        } else {
            return 0;
        }
    }

    static int parseRimToArab(String str) throws Exception {
        int c3 = 0;

        if (str.equals("I")) {
            c3 = 1;
            return c3;
        } else if (str.equals("II")) {
            c3 = 2;
            return c3;
        } else if (str.equals("III")) {
            c3 = 3;
            return c3;
        } else if (str.equals("IV")) {
            c3 = 4;
            return c3;
        } else if (str.equals("V")) {
            c3 = 5;
            return c3;
        } else if (str.equals("VI")) {
            c3 = 6;
            return c3;
        } else if (str.equals("VII")) {
            c3 = 7;
            return c3;
        } else if (str.equals("VIII")) {
            c3 = 8;
            return c3;
        } else if (str.equals("IX")) {
            c3 = 9;
            return c3;
        } else if (str.equals("X")) {
            c3 = 10;
            return c3;
        } else throw new Exception("throws Exception //т.к. введенные числа вне диапазона от I до X");

    }

    static void parseArabToRim(int q) throws Exception {
        if (q < 0)  { throw new Exception("throws Exception //т.к. в римской системе нет отрицательных чисел");
        }
        switch (q) {
            case (1):
                System.out.println("I");
                ;
                break;
            case (2):
                System.out.println("II");
                break;
            case (3):
                System.out.println("III");
                break;
            case (4):
                System.out.println("IV");
                break;
            case (5):
                System.out.println("V");
                break;
            case (6):
                System.out.println("VI");
                break;
            case (7):
                System.out.println("VII");
                break;
            case (8):
                System.out.println("VIII");
                break;
            case (9):
                System.out.println("IX");
                break;
            case (10):
                System.out.println("X");
            case (0) :
                System.out.println("Результат вне диапазона возможных значений римских цифр");
                break;
            case (11):
                System.out.println("XI");
                break;
            case (12):
                System.out.println("XII");
                break;
            case (13):
                System.out.println("XIII");
                break;
            case (14):
                System.out.println("XIV");
                break;
            case (15):
                System.out.println("XV");
                break;
            case (16):
                System.out.println("XVI");
                break;
            case (17):
                System.out.println("XVII");
                break;
            case (18):
                System.out.println("XVIII");
                break;
            case (19):
                System.out.println("XIX");
                break;
            case (20):
                System.out.println("XX");
            case (21):
                System.out.println("XXI");
                break;
            case (24):
                System.out.println("XXIV");
                break;
            case (25):
                System.out.println("XXV");
                break;
            case (27):
                System.out.println("XVII");
                break;
            case (28):
                System.out.println("XXVIII");
                break;
            case (30):
                System.out.println("XXX");
                break;
            case (32):
                System.out.println("XXXII");
                break;
            case (34):
                System.out.println("XXXIV");
                break;
            case (35):
                System.out.println("XXXV");
                break;
            case (36):
                System.out.println("XXXVI");
                break;
            case (40):
                System.out.println("XL");
            case (42):
                System.out.println("IXL");
                break;
            case (45):
                System.out.println("XLV");
                break;
            case (48):
                System.out.println("XLVIII");
                break;
            case (49):
                System.out.println("XLIX");
                break;
            case (50):
                System.out.println("L");
                break;
            case (54):
                System.out.println("LIV");
                break;
            case (56):
                System.out.println("LVI");
                break;
            case (60):
                System.out.println("LX");
                break;
            case (63):
                System.out.println("LXIII");
                break;
            case (64):
                System.out.println("LXIV");
            case (70):
                System.out.println("LXX");
                break;
            case (72):
                System.out.println("LXXII");
                break;
            case (80):
                System.out.println("LXXX");
                break;
            case (81):
                System.out.println("LXXXI");
                break;
            case (90):
                System.out.println("XC");
                break;
            case (100):
                System.out.println("C");

            default: {

                        System.out.println(q); }
        }
    }
}



