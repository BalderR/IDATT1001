package Øving7;

public class NyString {

    private String text;
    private String letter;

    public NyString(String text) {
        this.text = text;

    }


    public NyString abbreviate() {

        String test = text;
        String text4 = "";

        String[] text2 = test.split(" ");
        for (String s : text2) {
            text4 += (s.charAt(0));

        }


        return new NyString(text4);
    }

    public NyString remove(String letter) {
        String test = text;
        String test2 = letter;

        String text4 = test.replaceAll(letter,"");




        return new NyString(text4);
    }

    public String toString() {
        return text;

    }
}

