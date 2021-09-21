package tenToFift;
import java.util.Arrays;
public class Main {

//    *************Question 11*************** must master
    public static int getIndexByElement(String[] names, String element) {
//        int place = 0;
//        for (int i = 0; i < names.length; i++){
//            String wanted = place + names[1];
//            if (wanted == element) {
//                System.out.println(wanted);               // <------come back to make this first code work
//        for(String x : names){
//            if(x.equals(element)){
//                System.out.println(x);
//            }
//        }
        int getIndex = Arrays.asList(names).indexOf(element);

        return getIndex;
    }


 //   Question 12
    public static void printOddNumbersInRange(int start, int end){
        int i = start;
        while (i <= end) {
            if(i % 2 != 0) {
                System.out.println(i);
                }
            i++;
        }
    }

//    Question 13
    public static String printGivenStringTimesNumberGiven(String str, int n) {
        for(int i=1 ; i<=n ; i++)
        {
            System.out.println(str);
        }
        return null;
    }

//    Question 14
    public static String repeatFirstThreeLetters(String str, int n) {
        String subject = str;
        String substring = subject.substring(0, 3);
        for(int i=1 ; i<=n ; i++)
        {
            System.out.println(substring);
        }
        return null;
 }

//    Question 15 Write a java method to count all the words in a string

    public static int WordsInAStringCounter(String str){

        if (str == null || str.isEmpty()) {
            return 0;
        }

        int leWords = 0;
        int endOfLine = str.length() - 1;
        char[] daLetters = str.toCharArray();
        boolean realWord = false;

        for (int i = 0; i < daLetters.length; i++) {
            if (Character.isLetter(daLetters[i]) && i != endOfLine) {
                realWord = true;
            } else if (!Character.isLetter(daLetters[i]) && realWord) {
                leWords++;
                realWord = false;
            } else if (Character.isLetter(daLetters[i]) && i == endOfLine) {
                leWords++;
            }
        }
        return leWords;

    }

//
//    Question 16****************NOT DONE******************* Come back and figure out sometimes Y
//  A, E, I, O, U, and sometimes Y

    public static int VowelsCounter(String str){
       int leVowels = 0;


        for (int i=0 ; i<str.length(); i++){
            char letter = str.charAt(i);
            if(letter == 'a'|| letter == 'e'|| letter == 'i' ||letter == 'o' ||letter == 'u'||letter == ' '){
                leVowels ++;
            }
        }
       return leVowels;
    }




//    Question 17
//    Swap the first element in an array with the last element in an array and return


    //    Question 18
    public static String replaceCharacters(String str) {
        String switchero = str.replace("f", "7")
                .replace("F", "7")
                .replace("s","$")
                .replace("1","!")
                .replace("a","@");

        return switchero;
    }
//
    public static void main(String[] args) {



        String[] leNames = {"Jodak", "LeVania", "Kaine", "Emil", "Yoko-Taro"};
    printOddNumbersInRange(2,20);
    printGivenStringTimesNumberGiven("Salaried",2);
        System.out.println(getIndexByElement(leNames,"Yoko-Taro"));
        repeatFirstThreeLetters("Yjoldafel",2);
        System.out.println(WordsInAStringCounter("Ya know something fam these yutes can yam shit and drink piss"));
        System.out.println(VowelsCounter("Yjoldafel"));
        String sentence = "Wag1 to da gyalist up nurf";
        System.out.println(replaceCharacters(sentence));


    }


}
