import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int []v1={1,2};
        Token t1=new Token("tok1",v1);
        int []v2={2,3};
        Token t2=new Token("tok2",v2);
        int []v3={3,4};
        Token t3=new Token("tok3",v3);
        int []v4={4,1};
        Token t4=new Token("tok4",v4);
        int []v5={1,3};
        Token t5=new Token("tok5",v5);
        int []v6={2,4};
        Token t6=new Token("tok6",v6);
        int []v7={3,1};
        Token t7=new Token("tok7",v7);
        int []v8={3,2};
        Token t8=new Token("tok8",v8);
        List<Token> listOFTokens=new ArrayList<>();
        listOFTokens.add(t1);
        listOFTokens.add(t2);
        listOFTokens.add(t3);
        listOFTokens.add(t4);
        listOFTokens.add(t5);
        listOFTokens.add(t6);
        listOFTokens.add(t7);
        listOFTokens.add(t8);
        Board b=new Board(listOFTokens);
        Player p1=new Player("one",b);
        p1.start();

        Player p2=new Player("two",b);
        p2.start();

        Player p3=new Player("three",b);
        p3.start();

    }
}
