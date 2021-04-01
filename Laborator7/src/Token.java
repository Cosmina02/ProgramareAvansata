import java.util.Arrays;

public class Token {
    String name;
    int []token;

    public Token(String name,int[] token) {
        this.token = token;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Token{" +
                "name='" + name + '\'' +
                ", token=" + Arrays.toString(token) +
                "\n}";
    }
}
