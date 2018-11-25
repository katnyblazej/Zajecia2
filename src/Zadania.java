import java.util.Scanner;
import static java.lang.Math.*;

public class Zadania {




        public static void zad4() {
            boolean a, b, wynik;
            System.out.println("Wyrazenie: (!(a&&b)&&(a||b))||((a&&b)||!(a||b))");

            a = true;
            b = true;
            wynik = (!(a && b) && (a || b)) || ((a && b) || !(a || b));
            System.out.println("Dla a= " + a + " i dla b=" + b + " wyrazenie ma wartosc: " + wynik);
            a = true;
            b = false;
            wynik = (!(a && b) && (a || b)) || ((a && b) || !(a || b));
            System.out.println("Dla a= " + a + " i dla b=" + b + " wyrazenie ma wartosc: " + wynik);
            a = false;
            b = true;
            wynik = (!(a && b) && (a || b)) || ((a && b) || !(a || b));
            System.out.println("Dla a= " + a + " i dla b=" + b + " wyrazenie ma wartosc: " + wynik);
            a = false;
            b = false;
            wynik = (!(a && b) && (a || b)) || ((a && b) || !(a || b));
            System.out.println("Dla a= " + a + " i dla b=" + b + " wyrazenie ma wartosc: " + wynik);

        }

        public static int losowanie(int a,int b) {
            return (int) ((Math.random()*(b-a))+a);
        }

        public static void main(String[] args) {
            //ZAD1
            int zadanie=1;
            System.out.println("ZADANIE "+zadanie);
            zadanie++;
            int a = 5;
            int b = 3;
            int c = a & b;

            Scanner podaj = new Scanner(System.in);

            System.out.println(a + " & " + b + " = " + c);
            c = a | b;
            System.out.println(a + " | " + b + " = " + c);
            c = a ^ b;
            System.out.println(a + " ^ " + b + " = " + c);
            //ZAD2

            System.out.println("ZADANIE "+zadanie);
            zadanie++;
            System.out.println("Podaj rok: ");

           int rok = podaj.nextInt();

         boolean prawda = (rok % 4 == 0 && rok % 100 != 0 || rok % 400 == 0);

            if (prawda == true) {
                System.out.println("Rok " + rok + " jest przestepny ");
            } else {
                System.out.println("Rok " + rok + " nie jest przestepny ");
            }
            //ZAD3

System.out.println("ZADANIE "+zadanie);
            zadanie++;
            System.out.println("Podaj argument do jedynki trygonometrycznej");
            double argument = podaj.nextDouble();
            double wynik = Math.pow(Math.sin(argument), 2) + Math.pow(Math.cos(argument), 2);

            System.out.println("cos^2 α +sin^2 α = " + wynik);
            //ZAD4
            System.out.println("ZADANIE "+zadanie);
            zadanie++;
            zad4();

            //ZAD5
            System.out.println("ZADANIE "+zadanie);
            zadanie++;
            System.out.println();
            System.out.println(2 + "bc");
            System.out.println(2 + 3 + "bc");
            System.out.println((2 + 3) + "bc");
            System.out.println("bc" + (2 + 3));
            System.out.println("bc" + 2 + 3);

            //ZAD6
            System.out.println("ZADANIE "+zadanie);
            zadanie++;
            String s1 = "abc";
            String s2 = "ab";
            s2 += "c";
            String s3 = s2;
            String s4 = new String("abc");

            prawda = (s1 == "abc");
            System.out.println("s1==abc : " + prawda);
            prawda = (s1 == s4);
            System.out.println("s1==s4 : " + prawda);
            prawda = (s1 == s2);
            System.out.println("s1==s2 : " + prawda);
            prawda = (s2 == "abc");
            System.out.println("s2==abc : " + prawda);
            prawda = (s2 == s3);
            System.out.println("s2==abc : " + prawda);

            prawda = (s1.equals(s2));
            System.out.println("s1.equals(s2) : " + prawda);
            prawda = (s1.equals(s3));
            System.out.println("s1.equals(s3) : " + prawda);
            prawda = (s1.equals(s4));
            System.out.println("s1.equals(s4) : " + prawda);
            wynik=s1.compareTo(s4);
            System.out.println("s1.compareTo(s4): "+ wynik);


            //ZAD7
            System.out.println("ZADANIE "+zadanie);
            zadanie++;
            String s = " Ala ma kota i kot ma Ale ";

            System.out.println(s.toUpperCase());
            System.out.println(s.substring(1,25));

            //ZAD8
            System.out.println("ZADANIE "+zadanie);
            zadanie++;
            int x, y;

            System.out.println("Podaj x punktu ");
            x = podaj.nextInt();
            System.out.println("Podaj y punktu ");
            y = podaj.nextInt();

            double odleglosc = Math.sqrt((Math.pow((x), 2)+Math.pow((y), 2)));

            System.out.println("Odleglosc punktu (" + x + "," + y + ") od puntku (0,0) = " + odleglosc);

            //ZAD9
            System.out.println("ZADANIE "+zadanie);
            zadanie++;
            System.out.println("Podaj zakres n losowania ");
            int n = podaj.nextInt();
            System.out.println("Wylosowana liczba: "+(int)(Math.random()*n));

            System.out.println("Podaj zakres poczatkowy losowania a: ");
            a = podaj.nextInt();
            System.out.println("Podaj zakres koncowy losowania b: ");
            b = podaj.nextInt();

            System.out.println("Wylosowana liczba: "+losowanie(a,b));

            //ZAD 10
            System.out.println("ZADANIE "+zadanie);
            zadanie++;


            double suma,liczba1,liczba2;

                   liczba1=  losowanie(1,6);
                   liczba2=  losowanie(1,6);
                   suma=liczba1+liczba2;

            System.out.format("Suma "+liczba1+" + "+liczba2+" = "+suma);
            System.out.println();

            //ZAD 11
            System.out.println("ZADANIE "+zadanie);
            zadanie++;

            int min,max,sr,min1,min2;

            System.out.println("Podaj 3 liczby: ");
            a = podaj.nextInt();
            b = podaj.nextInt();
            c = podaj.nextInt();

            min1=Math.min(a,b);
            min2=Math.min(b,c);
            sr=Math.max(min1,min2);
            min=Math.min(min1,min2);
            max=Math.max(a,Math.max(b,c));

            System.out.println("Od najmniejszej: "+min+", "+sr+", "+max);




            //ZAD 12
            System.out.println("ZADANIE "+zadanie);
            zadanie++;

            String name="Adam";
            int wiek;
            System.out.println("Podaj swoje imie: ");
            name=podaj.next();
            System.out.println("Podaj swoj wiek: ");
            wiek=podaj.nextInt();

            System.out.println("Witaj "+name+" Masz "+wiek+" lat.");

            //ZAD 13
            System.out.println("ZADANIE "+zadanie);
            zadanie++;

            System.out.println("Podaj a: ");
            double A=podaj.nextDouble();
            System.out.println("Podaj b: ");
            double B=podaj.nextDouble();

            System.out.println("Pole prostokata o bokach "+A+" x "+B+" = "+(A*B));


            //ZAD 14
            System.out.println("ZADANIE "+zadanie);
            zadanie++;
            System.out.printf("π =%.2f",Math.PI);



        }
    }