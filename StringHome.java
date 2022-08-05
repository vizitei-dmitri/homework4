import java.util.Scanner;

public class StringHome {
    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите слово 1");
        String str1 = scan.nextLine();
        str1.toUpperCase();
        System.out.println("Введите слово 2");
        String str2 = scan.nextLine();
        str2.toUpperCase();

        StringBuilder newstring = new StringBuilder("");
        newstring.append(str1+" ");
        newstring.append(str2);
        System.out.println(newstring);
    }
}
