public class Arrayexample {

    private String[] words;

    public Arrayexample(){
        this.words = new String[5];
    }

    public int getWordCount(){
        return this.words.length;
    }

// add an if statement in java
    public void add(String word) {
        for (int i = 0; i < words.length; i++) {
            if (words[i] == null) {
                this.words[i] = word;
                break;
            }
        }
    }
}
