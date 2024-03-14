import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        String manoVardas = "Gediminas";
        String manoPavarde = "Gasiūnas";
        int gimimoMetai = 1999;
        int dabartiniaiMetai = 2024;
        System.out.println("Aš esu " + manoVardas + " " + manoPavarde + ".Man yra" + " " + (dabartiniaiMetai - gimimoMetai) + " " + "metai");

        System.out.println("2 uzduotis");

        int rndNum = (int) Math.round(Math.random() * 4);
        int rndNum2 = (int) Math.round(Math.random() * 4);

        rndNum = 4;
        rndNum2 = 0;

        System.out.println(rndNum + " " + rndNum2);

        if (rndNum != 0 && rndNum2 != 0) {
            if (rndNum > rndNum2) {
                System.out.println((double) rndNum / rndNum2);
            } else {
                System.out.println((double) rndNum2 / rndNum);
            }
        } else {
            System.out.println("dalyba is 0 negalima");
        }

        System.out.println("3 uzduotis");

        int no1 = (int) Math.round(Math.random() * 25);
        int no2 = (int) Math.round(Math.random() * 25);
        int no3 = (int) Math.round(Math.random() * 25);

        System.out.println(no1);
        System.out.println(no2);
        System.out.println(no3);


        if ((no1 > no2 && no1 < no3) || (no1 < no2 && no1 > no3)) {
            System.out.println(no1);
        }
        if ((no2 > no1 && no2 < no3) || (no2 < no1 && no2 > no3)) {
            System.out.println(no2);
        }
        if ((no3 > no1 && no3 < no2) || (no3 < no1 && no3 > no2)) {
            System.out.println(no3);
        }
        if (no1 == no2 && no2 == no3 && no3 == no1) {
            System.out.println("Visi skaiciai lygus");
        }

        System.out.println("4 uzduotis");

        int min = 1;
        int a = (int) (min + Math.round(Math.random() * 10));
        int b = (int) (min + Math.round(Math.random() * 10));
        int c = (int) (min + Math.round(Math.random() * 10));


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


        if ((a + b) > c  || (a + c) > b || (b + c) > a) {
            System.out.println("Trikampis");
        }
        if ((a + b) < c || (a + c) < b || (b + c) < a) {
            System.out.println("Trikampis negalimas");
        }



        System.out.println("5 uzduotis");

        int nr1 = (int) Math.round(Math.random() * 2);
        int nr2 = (int) Math.round(Math.random() * 2);
        int nr3 = (int) Math.round(Math.random() * 2);
        int nr4 = (int) Math.round(Math.random() * 2);

                System.out.println("Gauti skaiciai:" + nr1 + ", "  + nr2 + ", " + nr3 + ", " + nr4);

        int countZeros = 0, countOnes = 0, countTwoes = 0;


        if (nr1 == 0) countZeros++;
        else if (nr1 == 1) countOnes++;
        else countTwoes++;

        if (nr2 == 0) countZeros++;
        else if (nr2 == 1) countOnes++;
        else countTwoes++;

        if (nr3 == 0) countZeros++;
        else if (nr3 == 1) countOnes++;
        else countTwoes++;

        if (nr4 == 0) countZeros++;
        else if (nr4 == 1) countOnes++;
        else countTwoes++;

        System.out.println("Kiek 0: " + countZeros);
        System.out.println("Kiek 1: " + countOnes);
        System.out.println("Kiek 2: " + countTwoes);

        System.out.println("6 uzduotis");
// Random numeris
        int minim = -10;
        int max = 10;
        int rndNmr = 0;
        for (int i = 0; i < 3; i++) {
            rndNmr = (int) (minim + Math.round(Math.random() * (max - minim)));
            System.out.println(rndNmr);
        }
        //Formatavimas i skliaustus
        if (rndNmr < 0) {
            System.out.println("[" + (int) rndNmr + "]");
        }else if (rndNmr == 0) {
            System.out.println("(" + (int) rndNmr + ")");
        }else {
            System.out.println("{" + (int) rndNmr + "}");
        }

        System.out.println("7 uzduotis");

        int maximum = 5;
        int minimum = 3000;
        int rndm = 0;
        rndm = (int) ( minimum+ Math.round( Math.random() *(maximum - minimum))  );
        System.out.println(rndm);
        if ( rndm < 1000){
            System.out.println(rndm);
        }
        if ( rndm==1000 || rndm < 2000){
            System.out.println(rndm * 0.97);
        }
        if (rndm > 2000 || rndm==2000){
            System.out.println(rndm * 0.96);
        }

        System.out.println("8 uzduotis");
        int mini = 0;
        int maxi = 100;
        int sum = 0;
        int count = 0;

        double nmbr1 = (mini + Math.round(Math.random() * (maxi - mini)));
        double nmbr2 = (mini + Math.round(Math.random() * (maxi - mini)));
        double nmbr3 = (mini + Math.round(Math.random() * (maxi - mini)));
        System.out.println(nmbr1 + ", " + nmbr2 + ", " + nmbr3);
        System.out.println("vidurkis:" + " " + ((nmbr1 + nmbr2 + nmbr3)/3));
        System.out.println("Skaicius po IF:");

        if ((nmbr1 <= 90) || (nmbr1 >= 10)){
            sum += nmbr1;
            count++;

        }
        else if ((nmbr2 <= 90) || (nmbr2 >= 10)){
            sum += nmbr2;
            count++;

        }
        else if ((nmbr3 <= 90) || (nmbr3 >= 10)){
            sum += nmbr3;
            count++;

        }
        else {
            System.out.println("Nera tinkamos reiksmes");
        }
        System.out.println(sum / count);



        System.out.println("9 uzduotis");

        int mx = 0;
        int mn = 300;

        int n1 = (int) (mn + Math.round(Math.random() * (mx - mn)));
        int n2 = (int) (mn + Math.round(Math.random() * (mx - mn)));
        int n3 = (int) (mn + Math.round(Math.random() * (mx - mn)));

        System.out.println(n1 + " " + n2 + " " + n3);

        if ((n1 <= 24) && (n1 >= 0)){
            System.out.println(n1);
        }
        if ((n2 < 60) && (n2 >= 0)){
            System.out.println(n2);
        }
        if ((n3 < 60) && (n3 >= 0)){
            System.out.println(n3);
        }
        System.out.println("sveiki");


//        git config --global user.name "GediminasGsn"
//        git config --global user.email "gasiunasgediminas@gmail.com"

//       $ git config --global user.name "GediminasGsn"
//       $ git config user.name  gasiunasgediminas@gmail.com







    }
}