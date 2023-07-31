package DependencyInversionPrincipl;

public class Main {
    public static void main(String[] args) {
        Text<String> text = new Text<String>("dsadasda");
        text.print();
        Text<Integer> intText = new Text<>(213123123);
        intText.print();
    }
}