

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        // 2 Uzbekiston mashina Nomerlari
        //   System.out.println("A123CD".matches("^[A-Z]{1}\\d{3}[A-Z]{2}$"));
//        // 3 email pochta
//        System.out.println("Ahmadxon@vbkvj.ru".matches("(\\w+)(@)\\w+(\\.)\\w+"));
//        // 4 satirda raqamni tekshirish
//        System.out.println("5428".matches("[0-9]+"));
//        // 5
//        // 6
//        System.out.println("Ah_mad".matches("[a-zA-Z0-9_]{4,16}"));
        // 7
//        String intput = "salom Ahmadxon. Dunyo ";
//        StringBuilder result  = new StringBuilder();
//        for (char c: intput.toCharArray()) {
//            if(!Character.isWhitespace(c)){
//                result.append(c);
//            }
//        }
//        String EmptySpace = result.toString();
//        System.out.println(EmptySpace);

        // 8
//        String text = "Ahmadxon@ !13 maktabda # oqidi ";
//        String hashtagPattern  = "!@#%&";
//        Pattern pattern = Pattern.compile(hashtagPattern);
//        Matcher matcher = pattern.matcher(text);
//        while (matcher.find()){
//            String hashtag = matcher.group();
//            System.out.println(hashtag);
//        }
        // 11
        //  System.out.println("123dA6#2".matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\\\S+$).{8,}$"));
// 12
        String text = "Aliko @Jon, nima gap @joja";


        String mentionPattern = "@\\w+";

        // Create a Pattern object
        Pattern pattern = Pattern.compile(mentionPattern);


        Matcher matcher = pattern.matcher(text);


        while (matcher.find()) {
            String mention = matcher.group();
            System.out.println("Natija : " + mention);
        }

    }
}



