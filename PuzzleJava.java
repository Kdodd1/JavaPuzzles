import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava {
    Random ran = new Random();

    public String returnGreaterThan10(){
        int[] arr1 = {3, 5, 1, 2, 7, 9, 8, 13, 25, 32};
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int sum = 0;
        for(int i=0; i < arr1.length; i++) {
            sum += arr1[i];
            if(arr1[i] > 10) {
                numbers.add(arr1[i]);
            }
        }
        System.out.println("The sum is: " + sum);
        return ("The big numbers are: " + numbers);
    }
    public ArrayList<String> shuffleNames(){
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<String> shortNames = new ArrayList<String>();
        names.add("Nancy");
        names.add("Jinichi");
        names.add("Fujibayashi");
        names.add("Momochi");
        names.add("Ishikawa");
        Collections.shuffle(names);

        for(int i=0; i < names.size(); i++){
            if(names.get(i).length() <= 5){
                shortNames.add(names.get(i));
            }
            System.out.println(names.get(i));
        }
        return (shortNames); 
    }
    public ArrayList<Character> shuffleCharAndReturn(){
        ArrayList<Character> letters = new ArrayList<Character>();
        letters.add('a');
        letters.add('b');
        letters.add('c');
        letters.add('d');
        letters.add('e');
        letters.add('f');
        letters.add('g');
        letters.add('f');
        letters.add('g');
        letters.add('h');
        letters.add('i');
        letters.add('j');
        letters.add('k');
        letters.add('l');
        letters.add('m');
        letters.add('n');
        letters.add('o');
        letters.add('p');
        letters.add('q');
        letters.add('r');
        letters.add('s');
        letters.add('t');
        letters.add('u');
        letters.add('v');
        letters.add('w');
        letters.add('x');
        letters.add('y');
        letters.add('z');
        Collections.shuffle(letters);

        System.out.println("First Letter: " + letters.get(0) + " Last Letter: " + letters.get(25));
        if(letters.get(0) == 'a' || letters.get(0) == 'e' || letters.get(0) == 'i' || letters.get(0) == 'o' || letters.get(0) == 'u'){
            System.out.println("The first letter is a vowel");
        }
        return (letters);
    }
    public ArrayList<Integer> randNum(){
       
        ArrayList<Integer> randomIntList = new ArrayList<Integer>();
        for(int i=0; i<10; i++){
            randomIntList.add(ran.nextInt(100-55) + 55);
            }
        Collections.sort(randomIntList);
        System.out.println(randomIntList);
        System.out.println("The Minimum Value: " + randomIntList.get(0) + " The Maximum Value: " + randomIntList.get(randomIntList.size()-1));
        return(randomIntList);
    }
    public ArrayList<String> randString(){
        String randString = "";
        ArrayList<Character> letters = new ArrayList<Character>();
        ArrayList<String> randWords = new ArrayList<String>();
        letters.add('a');
        letters.add('b');
        letters.add('c');
        letters.add('d');
        letters.add('e');
        letters.add('f');
        letters.add('g');
        letters.add('f');
        letters.add('g');
        letters.add('h');
        letters.add('i');
        letters.add('j');
        letters.add('k');
        letters.add('l');
        letters.add('m');
        letters.add('n');
        letters.add('o');
        letters.add('p');
        letters.add('q');
        letters.add('r');
        letters.add('s');
        letters.add('t');
        letters.add('u');
        letters.add('v');
        letters.add('w');
        letters.add('x');
        letters.add('y');
        letters.add('z');
       
        for(int i = 0; i<10; i++){
            randString = "";
            for(int j = 0; j<5; j++){
                randString += letters.get(ran.nextInt(25));
            }
            randWords.add(randString);
        }
        System.out.println("Random String: " + randString);
        return(randWords);
    }
}