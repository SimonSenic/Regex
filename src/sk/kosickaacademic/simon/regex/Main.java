package sk.kosickaacademic.simon.regex;

public class Main {
    public static void main(String[] args) {
        NoRegex nr = new NoRegex();
        System.out.println(nr.isValidSPZ("KK2 7KK"));
        System.out.println(nr.isValidID("HU059777"));
    }
}
