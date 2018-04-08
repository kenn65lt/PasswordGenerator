package kennedyraine.passwordgen;

import java.util.Random;


public class RandomGenerate {
    public int pWordLength = 0;
   public int characterCount =0;


    //constructors
    RandomGenerate(int pWordLength ){
        this.pWordLength = pWordLength;
        characterCount = pWordLength /4;
    }


    public String getNum(int length){
        String digits = "1234567890";

        StringBuilder nums = new StringBuilder();
        Random rnd = new Random();
        while (nums.length() < length) { // length of the random string.
            int index = (int) (rnd.nextFloat() * digits.length());
            nums.append(digits.charAt(index));
        }
        return nums.toString();
    }




    //Counting the percentages of the characters that are going to be put on
    //Getters and setters for the percentages
    //Returns random numbers
    Random rndm_method = new Random();
    public String getUpperLetters(int length){
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        StringBuilder uppers = new StringBuilder();
        Random rnd = new Random();
        while (uppers.length() < length) { // length of the random string.
            int index = (int) (rnd.nextFloat() * upperCase.length());
            uppers.append(upperCase.charAt(index));
        }
        return uppers.toString();
//        return randomLetters.toString();
    }



    public String getLowerLetters(int length){


          String lowerCase = "abcdefghijklmnopqrstuvwxyz";

        StringBuilder lowers = new StringBuilder();
        Random rnd = new Random();
            while (lowers.length() < length) { // length of the random string.
                int index = (int) (rnd.nextFloat() * lowerCase.length());
                lowers.append(lowerCase.charAt(index));
            }
            return lowers.toString();
        }



    public String getSpecial(int length){

        String specialLetters = "!@#$%&*()_+-=[]|,./?><";
        StringBuilder specials = new StringBuilder();
        Random rnd = new Random();
        while (specials.length() < length) { // length of the random string.
            int index = (int) (rnd.nextFloat() * specialLetters.length());
            specials.append(specialLetters.charAt(index));
        }
        return specials.toString();
    }

//    //Generates random Number based on the percentage
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
//    private String setMergeCharacters(){
//        String characters = getLetters() + getLowerLetters() + getNum() + getSpecials();
//        StringBuilder merge = new StringBuilder(characters);
//
//        for (int x = 0; x <= pWordLength; x++){
//            int number = getRandomNumber(characters.length());
//            char specs = characters.charAt(number);
//            merge.append(specs);
//        }
//        return merge.toString();
//
//
//    }

//    public String getMergedChar(){
//        return setMergeCharacters();
//    }
//}


