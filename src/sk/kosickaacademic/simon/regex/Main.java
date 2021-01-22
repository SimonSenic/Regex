package sk.kosickaacademic.simon.regex;

public class Main {
    public static void main(String[] args) {
        NoRegex nr = new NoRegex();
        System.out.println(nr.isValidSPZ("KK2 7KK"));
        System.out.println(nr.isValidID("HU059777"));
        System.out.println(nr.isValidID("CA123705"));
        System.out.println(nr.isValidID("M2384149"));
        System.out.println();

        Regex r = new Regex();
        r.readFile();
    }
}
