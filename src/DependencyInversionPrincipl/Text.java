package DependencyInversionPrincipl;


public class Text<T> implements Printer {
     public T text;

    public Text(T text) {
        this.text = text;
    }

    @Override
    public void print() {
        System.out.println(text);
    }
}

