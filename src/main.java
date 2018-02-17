import java.util.Scanner;



public class main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numCount, letterCount, specialLettersCount, pWordLength;


        System.out.println("How many characters do you want?: ");
        numCount = sc.nextInt();
        System.out.println("How many percent of numbers do you want?");
        letterCount = sc.nextInt();
        System.out.println("How many percent of letters do you want?");
        specialLettersCount = sc.nextInt();
        System.out.println("How many percent of special characters do you want?");
        pWordLength = sc.nextInt();

        randomGenerate generate = new randomGenerate();
        generate.getNumPercent();
        generate.generate(numCount, letterCount,specialLettersCount);
        generate.charCount(pWordLength);

    }
}
