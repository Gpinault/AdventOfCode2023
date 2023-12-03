import java.util.Arrays;
import java.util.LinkedList;

public class Day1 {
    public static void main(String[] args) {
        System.out.println("1 : " + Day1_1("inputs/Day1.txt"));
        System.out.println("2 : " + Day1_2("inputs/Day1.txt"));

    }

    public static int Day1_1(String filename){
        LinkedList<String> input = ReadFile.getList(filename);

        int n = input.size();
        int[] numbers = new int[n];


        for (int i = 0; i < n; i++) {
            String current = input.get(i);
            char one = 'a';
            char two = 'a';
            for (int j = 0; j < current.length(); j++) {
                try {
                    int value = Integer.parseInt(String.valueOf(current.charAt(j)));
                    if (one == 'a'){
                        one = current.charAt(j);
                    } else { 
                        two = current.charAt(j);
                    }
                }catch ( NumberFormatException ignored){

                }
            }
            if (two =='a') two = one;
            numbers[i] = 10*Integer.parseInt(String.valueOf(one))+Integer.parseInt(String.valueOf(two));
        }

        return(Arrays.stream(numbers).sum());

    }

    public static int Day1_2(String filename){
        LinkedList<String> input = ReadFile.getList(filename);

        int n = input.size();
        int[] numbers = new int[n];


        for (int i = 0; i < n; i++) {
            String current = input.get(i);
            char one = 'a';
            char two = 'a';

            current = current.replace("eightwo", "82");
            current = current.replace("eighthree", "83");
            current = current.replace("threeight", "38");
            current = current.replace("twone", "21");
            current = current.replace("fiveight", "58");
            current = current.replace("nineight", "98");
            current = current.replace("oneight", "18");
            current = current.replace("sevenine", "79");


            current = current.replace("one", "1");
            current = current.replace("two", "2");
            current = current.replace("three", "3");
            current = current.replace("four", "4");
            current = current.replace("five", "5");
            current = current.replace("six", "6");
            current = current.replace("seven", "7");
            current = current.replace("eight", "8");
            current = current.replace("nine", "9");

            for (int j = 0; j < current.length(); j++) {
                try {
                    int value = Integer.parseInt(String.valueOf(current.charAt(j)));
                    if (one == 'a'){
                        one = current.charAt(j);
                    } else {
                        two = current.charAt(j);
                    }
                }catch ( NumberFormatException ignored){

                }
            }
            if (two =='a') two = one;
            numbers[i] = 10*Integer.parseInt(String.valueOf(one))+Integer.parseInt(String.valueOf(two));
        }

        return(Arrays.stream(numbers).sum());
    }
}
