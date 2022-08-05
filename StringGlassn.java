import java.util.Scanner;

public class StringGlassn {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        StringBuilder newstring = new StringBuilder(scan.nextLine());
        for (int i = 0; i < newstring.length(); i++) {
            if (newstring.charAt(i) == 'ё' || newstring.charAt(i) == 'у' || newstring.charAt(i) == 'е' || newstring.charAt(i) == 'ы' || newstring.charAt(i) == 'а' || newstring.charAt(i) == 'о' || newstring.charAt(i) == 'э' || newstring.charAt(i) == 'я' || newstring.charAt(i) == 'и' || newstring.charAt(i) == 'ю')  {
                newstring.setCharAt(i, ' ');

            }
        }
        System.out.println(newstring);
    }
}