package Øving7;

public class TekstBehandlingMain {
    private static TekstBehandling test = new TekstBehandling( "Dette er. en test. ære øy åpen åpen åpen.");

    public static void main (String[] args) {
        System.out.println(test.totalwords() + " Total words ");
        System.out.println(test.averageWordlength() + " Average word length ");
        System.out.println(test.averageWordperPeriod() + " Average words per period test ok ");
        System.out.println(test.replaceWord("åpen","lukket") + " Replaced 'åpen' with 'lukket'" );
        System.out.println(test.retrieveText() + " Input text ");
        System.out.println(test.upperCase() + " Text in uppercase");
    }
}
