import java.util.Arrays;

public class ContadorDeVogais {

    public static int getCount(String str) {
        int vowelsCount = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++){
            switch (str.charAt(i)){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowelsCount++;
                    break;
            }
        }
            return vowelsCount;
    }

    public static void main(String[] args) {
        System.out.println(getCount("abracadabra"));
    }
}
