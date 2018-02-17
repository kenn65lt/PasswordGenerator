import java.util.Random;

//Random class generator
public class randomGenerate  {

    private int numCount, letterCount, specialNum, pWordLength;
    double numPercentage, lettersPercent, specPercent;
    public final String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    public final String digits = "1234567890";
    private final String specialLetters = "dasadasad";
    //constructors
    public void generate(int numCount, int letterCount, int specialNum ){
        this.numCount = numCount;
        this.letterCount = letterCount;
        this.specialNum = specialNum;
    }

    public void charCount(int pWordLength){
        this.pWordLength = pWordLength;
    }


    //Counting the percentages of the characters that are going to be put on
    //Getters and setters for the percentages
    private String setNum(){
      numPercentage   = (numCount / 100) * pWordLength;
        StringBuffer randomNums = new StringBuffer();

        for (int x = 0; x <= numPercentage; x++){
            int number = getRandomNumber(digits.length());
            char specs = digits.charAt(number);
            randomNums.append(specs);
        }
        return randomNums.toString();
    }


    public String getNumPercent(){
        return setNum();
    }

    private String setLettersPer(){
        lettersPercent = (letterCount / 100) * pWordLength;
        StringBuffer randomLetters = new StringBuffer();

        for (int x = 0; x <= lettersPercent; x++){
            int number = getRandomNumber(upperCase.length());
            char specs = upperCase.charAt(number);
            randomLetters.append(specs);
        }
        return randomLetters.toString();
    }


    private String getLetters(){
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

    private String getSpecials(){
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

//    public void randomizeChar(){
//        //double randomCount = getNumPercent() + getLetters() + getSpecials();
//        if(randomCount != pWordLength){
//            System.out.println("Error pword length doesn't match");
//        } else{
//            Random rand = new Random();
//            //randomize the letters nums and special characters then add it
//
//        }
 //   }
}
