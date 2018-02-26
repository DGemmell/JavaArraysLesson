import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

    private ArrayList<String> words;
    private ArrayList<Integer> numbers;

    public ArrayListExample(ArrayList<Integer> numbers){
        this.words = new ArrayList<>();
        this.numbers = numbers;
    }

    public void add(String word){
        this.words.add(word);
    }

    public int getWordCount(){
        return this.words.size();
    }

    public String getWordAtIndex(int index){
        return words.get(index);
    }

//  adding a for loop
    public int getTotal(){
        int total = 0;
        for (int number : this.numbers){
            total += number;
        }
        return total;
    }

//    shuffle function will jumble the numbers up to get a random.
    public int getRandomNumber(){
        Collections.shuffle(numbers);
        return numbers.get(0);
    }
//    to get a copy of the array list
    public ArrayList<Integer> getNumbers(){
        return new ArrayList<>(this.numbers);
    }
}