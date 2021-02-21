package compulsory;

public class Main {
    public static void main(String[] args) {
        //printing "Hello, World!"
        System.out.println("Hello,World!");
        //an array of strings
        String[] languages = new String[] {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};
        //the calculations for a random number n
        int n = (int) (Math.random() * 1_000_000);
        int binaryval=Integer.parseInt("10101",2); //for binary numbers
        int hexval=Integer.parseInt("FF",16);// for hexadecimal numbers
        System.out.println("m="+ binaryval +" l="+ hexval);//verifing if the conversion is ok
        n=((n*3)+binaryval+hexval)*6; //calculating n
        System.out.println(n); //printing n
        int sum;
        int result=0;//stores the sum of digits from n
        //the sum of digits
        while((result>9)||(result==0)){
            sum=0;
            while (n!= 0)
            {
                sum = sum + n % 10;
                n = n/10;
            }
            n=sum;
            result=sum;
        }

        System.out.println("Willy-nilly, this semester I will learn " + languages[result]);
    }
}
