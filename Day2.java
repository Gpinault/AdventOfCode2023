import java.util.Arrays;
import java.util.LinkedList;
import java.util.Objects;

public class Day2 {

    public static void main(String[] args) {
        System.out.println(Day2_2("inputs/Day2.txt"));
    }

    public static int Day2_1(String filename){

        LinkedList<String> input = ReadFile.getList(filename);

        int n = input.size();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            boolean valid = true;
            String current = input.get(i);

            current = current.split(":")[1];

            while (current.contains(";")) {
                current = current.replace(";","");
            }

            String[] tab = current.split(" ");


            for (int k = 1; k <= tab.length / 2; k++) {
                System.out.println(tab[2 * k] + " / " + tab[2 * k-1]);
                if (tab[2 * k].contains("green") && (Integer.parseInt(tab[2 * k-1]) > 13)) {
                    valid = false;
                    System.out.println(valid);
                }
                if (tab[2 * k].contains("red") && (Integer.parseInt(tab[2 * k-1]) > 12)) {
                    valid = false;
                    System.out.println(valid);
                }
                if (tab[2 * k].contains("blue") && (Integer.parseInt(tab[2 * k-1]) > 14)) {
                    valid = false;
                    System.out.println(valid);
                }
            }



            System.out.println(valid);
            if (valid) sum += i+1;


        }

        return sum;
    }

    public static int Day2_2(String filename){

        LinkedList<String> input = ReadFile.getList(filename);

        int n = input.size();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            String current = input.get(i);

            current = current.split(":")[1];

            while (current.contains(";")) {
                current = current.replace(";","");
            }

            String[] tab = current.split(" ");


            int maxR = 0;
            int maxG = 0;
            int maxB = 0;

            for (int k = 1; k <= tab.length / 2; k++) {
                System.out.println(tab[2 * k] + " / " + tab[2 * k-1]);
                if (tab[2 * k].contains("red") && (Integer.parseInt(tab[2 * k-1]) > maxR)) {
                    maxR = Integer.parseInt(tab[2 * k-1]);
                }
                if (tab[2 * k].contains("green") && (Integer.parseInt(tab[2 * k-1]) > maxG)) {
                    maxG = Integer.parseInt(tab[2 * k-1]);
                }
                if (tab[2 * k].contains("blue") && (Integer.parseInt(tab[2 * k-1]) > maxB)) {
                    maxB = Integer.parseInt(tab[2 * k-1]);
                }
            }


            sum += maxR*maxG*maxB;


        }

        return sum;
    }
}
