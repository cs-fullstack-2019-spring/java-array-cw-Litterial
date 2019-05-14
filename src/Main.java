import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
//        System.out.println(ex1());
//        ex2a();
//        ex3();
//        ex4();
//        ex5();
//        ex6();
        ex7();
    }

    private static ArrayList<String> ex1()
    {
        ArrayList<String> names= new ArrayList<String>();
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter four names");
        String name1=scan.next();
        String name2=scan.next();
        String name3=scan.next();
        String name4=scan.next();
        names.add(name1);
        names.add(name2);
        names.add(name3);
        names.add(name4);
        return names;

    }

    private static void ex2a()
    {
        ArrayList<Integer> numbers= new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(7);
        numbers.add(4);
        ex2b(numbers);

    }

    private static void ex2b(ArrayList<Integer>nums)
    {
        System.out.println(nums);
        System.out.println(nums.get(2));
        nums.remove(1);
        System.out.println(nums.get(2));
    }

    private static void ex3()
    {
        ArrayList<String> morenames=new ArrayList<String>();
        morenames.add("Bob");
        morenames.add("John");
        morenames.add("Kenn");
        morenames.add("Kevin");
        morenames.remove("Kenn");
        System.out.println(morenames);
        System.out.println("Array size: "+morenames.size());
        if(morenames.contains("Kevin"))
            System.out.println("Kevin appears in the array at index: "+morenames.indexOf("Kevin"));
        else
            System.out.println("Kevin does not appear in the array.");

    }

    private static void ex4()
    {
        Scanner scan = new Scanner (System.in);
        ArrayList<Integer>numbers = new ArrayList<Integer>();
        int count =0;
        int num;
        int sum=0;
        System.out.println("Enter 5 numbers into array. The sum of those 5 numbers will be calculated.");
        while (count<5)
        {
            num=scan.nextInt();
            numbers.add(num);
            count++;
        }
        for (Integer element: numbers)
        {
           sum+=element;
        }
        System.out.println(numbers);
        System.out.println(sum);
    }

    private static void ex5()
    {
        Integer[] numberarray={1,3,45,343,65,4,6,5,4,-1}; //an array
        ArrayList<Integer> numbers= new ArrayList(Arrays.asList(numberarray)); // function that converts array to arraylist
        System.out.println(numbers);
        findMax(numbers);
        findMin(numbers);

    }

    private static void findMax(ArrayList<Integer>numbers)
    {
        int max=numbers.get(0);

         for (Integer x :numbers) //for loop to iterate the arraylist
         {
             if (x>=max)
                 max=x;

         }
         System.out.println("Maximum value in array: " +max);
    }
    private static void findMin(ArrayList<Integer>numbers)
    {
      int min=numbers.get(0);
        for (Integer x :numbers)
        {
            if (x<=min)
                min=x;

        }
        System.out.println("Minimum value in array: " +min);
    }

    private static void ex6()
    {
        Scanner scan = new Scanner(System.in);
        double total=0;
        double num;
        do {
            System.out.println("Enter a number. This question will be asked until you enter 0 as a number. Then the total of all the numbers you entered be returned.");
            num=scan.nextDouble();
            total+=num;
        }while(num!=0);
        System.out.println("Total: "+total);
    }

    private static void ex7()
    {
        Scanner scan= new Scanner(System.in);
        String string = "";
        int i;

        while (!string.equalsIgnoreCase("q"))
        {
            String reverse=""; // placed inside the while loop to reset the value
            System.out.println("Enter a string. This program will determine whether or not the string is a palidrone. Press 'q' to Escape");
            string=scan.next().toLowerCase();
            if (string.equals("q"))// I put this here because I don't want the palidrone test to run if the user presses q.
            {
            }
            else
            {
                for (i=string.length()-1;i>=0;i--)
                {
                    reverse=reverse+string.charAt(i);  //uses that chatAt() function to grab the character at the listed index
                }
                if (string.equals(reverse))
                    System.out.println("Palidrone");
                else
                    System.out.println("Not a Palidrone");

            }
        }

    }
}
