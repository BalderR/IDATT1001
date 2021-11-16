package Øving7;

public class TekstBehandling {
    private String text;
    private String letter;
    private String letter2;

    public TekstBehandling(String text){
        this.text = text;
    }

    public int totalwords(){

        String[] test = text.split("\\s+");

        return test.length;
    }

    public double averageWordlength(){
        String test = text;

        int count = 0;
        double sum = 0;

        String[] words = test.split("\\s+");

        for (String word : words) {
            double wordLength = word.length();
            sum += wordLength;
            count++;
        }

        double average = 0;
        if (count > 0) {
            average = sum / count;
        }
        return (average);
    }

    public double averageWordperPeriod(){
        String text = this.text;
        String[] test = text.split("\\s+");
        int totalwords= test.length;

        String[] periods = text.split("[.!:?]+");

        int average = totalwords / periods.length;

        return (average);
    }

    public TekstBehandling replaceWord(String letter, String letter2){
        String test = text;
        String test2 = letter;
        String test3 = letter2;

        String newText = test.replaceAll(test2,test3);

        return new TekstBehandling(newText);
    }

    public TekstBehandling retrieveText(){
        String test = text;

        return new TekstBehandling(text);
    }

    public TekstBehandling upperCase() {
        String test = text;

        String newText = test.toUpperCase();

        return new TekstBehandling(newText);
    }
    @Override
    public String toString() {
        return text;
    }

}

