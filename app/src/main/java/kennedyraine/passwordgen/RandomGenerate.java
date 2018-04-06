package kennedyraine.passwordgen;

import java.util.Random;


public class RandomGenerate {
    double numCount, letterCount, specialNum, pWordLength;
    double numPercentage, specPercent;
    public final String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    public final String digits = "1234567890";
    private final String specialLetters = "!@#$%&*()_+-=[]|,./?><";
    //constructors
    RandomGenerate(double numCount, double letterCount, double specialNum, double pWordLength ){
        this.numCount = numCount;
        this.letterCount = letterCount;
        this.specialNum = specialNum;
        this.pWordLength = pWordLength;
    }




    //Counting the percentages of the characters that are going to be put on
    //Getters and setters for the percentages
    //Returns random numbers
    private String setNum(){
        numPercentage   = (numCount * pWordLength) / 100;
        StringBuffer randomNums = new StringBuffer();

        for (int x = 0; x <= numPercentage; x++){
            int number = getRandomNumber(digits.length());
            char specs = digits.charAt(number);
            randomNums.append(specs);
        }
        return randomNums.toString();
    }


    public String getNum(){
        return setNum();
    }

    public String setLettersPer(){
        double lettersPercent =  (letterCount * pWordLength) * 100;
        StringBuffer randomLetters = new StringBuffer();

        for (int x = 0; x <= lettersPercent; x++){
            int number = getRandomNumber(upperCase.length());
            char specs = upperCase.charAt(number);
            randomLetters.append(specs);
        }
        return randomLetters.toString();

//        return randomLetters.toString();
    }

    public String getLetters(){
        return setLettersPer();
    }

    private String setSpecialPer(){
        specPercent = (specialNum / 100) * pWordLength;
        StringBuffer randomSpecials = new StringBuffer();

        for (int x = 0; x <= specPercent; x++){
            int number = getRandomNumber(specialLetters.length());
            char specs = specialLetters.charAt(number);
            randomSpecials.append(specs);
        }
        return randomSpecials.toString();
    }

    public String getSpecials(){
        return setSpecialPer();
    }
    //Generates random Number based on the percentage
    private int getRandomNumber(int chars){//Chars is the length of each characters

        int randomInt = 0;
        Random randomGen = new Random();
        randomInt = randomGen.nextInt(chars);
        if (randomInt - 1 == -1){
            return randomInt;
        } else {
            return randomInt - 1;
        }

    }
}
