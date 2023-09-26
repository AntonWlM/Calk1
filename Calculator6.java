 import java.util.Scanner;

public class Calculator6 {
   public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       System.out.println("Введите пример с двумя оперантами (арабские или римские цифры)");
       String line = sc.nextLine();
       String[] actions = line.split(" ", 0);
       if (line.length() <= 1) {
           throw new Exception("throws Exception //т.к. строка не является математической операцией");}
       String a = actions[0];
       String op = actions[1];
       String b = actions[2];
       if (line.length() > 8)
           throw new Exception("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");

       char oper = op.charAt(0);

       if (parseStrToInt(a) != 0 && parseStrToInt(b) != 0) {
           int a3 = parseStrToInt(a);
           int b3 = parseStrToInt(b);
           int x;
           {
               if ((0 <= a3) && (a3 <= 10)) {
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
                           default:
                               ;
                       }

                   } else throw new Exception("throws Exception //т.к. введенные числа вне диапазона от 0 до 10");
               } else throw new Exception("throws Exception //т.к. введенные числа вне диапазона от 0 до 10");
           }


       } else if (parseStrToInt(a) == 0 && parseStrToInt(b) == 0) {
           int a3 = parseRimToArab(a);
           int b3 = parseRimToArab(b);
           int x = 0;
           switch (oper) {
               case '+':
                   x = a3+b3;
                   parseArabToRim(x);
                   break;
               case '-':
                   x = a3-b3;
                   parseArabToRim(x);
                   break;
               case '*':
                   x = a3*b3;
                   parseArabToRim(x);
                   break;
               case '/':
                   x = a3/b3;
                   parseArabToRim(x);
                   break;
               default:
           }



            /*switch (int x) {
                   case 1:
                       System.out.print("I");
                       break;
                   case 2:
                       System.out.print("II");
                       break;
                   case 3:
                       System.out.print("III");
                       break;
                   case 4:
                       System.out.print("IV");
                       break;
                   case 5:
                       System.out.print("V");
                       break;
                   case 6:
                       System.out.print("VI");
                       break;
                   case 7:
                       System.out.print("VII");
                       break;
                   case 8:
                       System.out.print("VIII");
                       break;
                   case 9:
                       System.out.print("IX");
                       break;
                   case 10:
                       System.out.print("X");
                       break;
                   default:
                       throw new Exception("throws Exception //т.к. в римской системе нет отрицательных чисел");*/


        } else    {throw new Exception("throws Exception //т.к. используются одновременно разные системы счисления");}



       }

        static int parseStrToInt(String str) {
            if (str.matches("\\d+")) {
                return Integer.parseInt(str);
            } else {
                return 0;
            }
        }

        static int parseRimToArab(String str) {
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
            } else ;
            return c3;
        }
            static void parseArabToRim(int q) {
                switch (q) {
                    case (1):
                        System.out.println("I");;
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
                        break;
                    default:
                        System.out.println("throws Exception //т.к. в римской системе нет отрицательных чисел");
                }
            }
        }



