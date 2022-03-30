package method;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {





      String [] names =  {"Aisha", "Bobby", "Timmy", "Bebe"};

        getLastIndex(names);
        getSecondToLastIndex(names);
        System.out.println(getFirstElement(names));

        System.out.println(getLastElement(names));

        System.out.println(names[2]);

        int[] numbers ={3,6,9,3};
        System.out.println(getSum(numbers));

        int[] ints = {2,4,6,};
        System.out.println(getAverage(ints));

        int[] oddNumbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        System.out.println(extractAllOddNumbers(oddNumbers));
        int [] evenNumbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        extractAllEvenNumbers(evenNumbers);


        String [] nameCheck = {"Antoni","Aisha", "Timmy", "Larry", "Tonya"};

        System.out.println(contains(nameCheck, "Antonio"));




//        Scan for a product's, price and quantity then calculate and print the total in the format below!
//
//        Product      Qty      Price      Total
//        ----         ---      -----      -----
//                Mug           20        5.0      100.0

        String product = "Mug";
        int qty = 20;
        double price = 5.0;
        double total = qty* price;

        System.out.printf("%-10s%-10s%-10s%-10s\n","Product","qty","price","total");
        System.out.printf("%-10s%-10s%-10s%-10s\n","---","---","-----","-----");
        System.out.printf("%-10s%, -10d%, -10.2f%, -10.2f", product, qty, price, total);

        Scanner input = new Scanner(System.in);
System.out.println("What's the temperature like?");

        String userInput = input.nextLine();
        if (userInput.equals("high")){
            System.out.println("Sunblock may be needed");
        }else if(userInput.equals("low")){
            System.out.println("A coat may be needed");
        } if (userInput.equals("humid")) System.out.println("It's muggy");






    }
    public static int getLastIndex(String[] names) {

        for (int i = 0; i < names.length; i++) {
        }
        return names.length - 1;
    }

    public static int getSecondToLastIndex(String[] names) {
        for (int i = 0; i < names.length; i++) {

        }
        return names.length - 2;
    }
        public static String getFirstElement (String[]names){

            for (int i = 0; i < names.length; i++) ;
            {

            }
            return names[0];


        }


        public static String getLastElement (String[]names){
            for (int i = 0; i < names.length; i++) {

            }
            return names[3];
        }

        public static String getSecondToLastElement (String[]names){
            for (int i = 0; i < names.length; i++) ;{

            }
            return names[2];
        }

        public static int getSum ( int[] numbers){
            int sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];

            }
            return sum;
        }

        public static int getAverage ( int[] ints){
            int total = 0;
            for (int x = 0; x < ints.length; x++) {
                total = total + ints[x];
            }
            return total / ints.length;
        }

        public static String extractAllOddNumbers ( int[] oddNumbers){
            String numbers = "";
            for (int i = 0; i < oddNumbers.length; i++) {
                if (oddNumbers[i] % 2 != 0) {
                    numbers = numbers + oddNumbers[i];

                }

            }
            return numbers;
        }

        public static String extractAllEvenNumbers ( int[] evenNumbers){
            String numberq = "";
        for (int i = 0; i < evenNumbers.length; i++) {
                if (evenNumbers[i] % 2 == 0) {
                    numberq = numberq + evenNumbers[i];
                }
            }
            return numberq;
        }

        public static boolean contains (String[]nameCheck, String element){
            for (int x = 0; x < nameCheck.length; x++) {
                if (nameCheck[x].equals(element)) {
                }
            }
            return true;


        }
    }

















