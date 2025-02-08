import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String fullName ="          Orxan Allahverdiyev           ";
        String fullName2 = "Elxan Allahverdiyev";

        char[] charArray=fullName.toCharArray();
        fullName.concat(fullName2);
        System.out.println(fullName.trim());
        String replacedFullname = fullName.replaceAll("Or","El");
//        System.out.println(replacedFullname);
//        System.out.println(fullName.indexOf("Orxan"));
        String[] nihad =fullName.split(" ");
//        System.out.println(Arrays.toString(nihad));
//        System.out.println(charArray);
//        if(fullName2.equals(fullName)){
//            System.out.println("beraberdir");
//        }else{
//            System.out.println("beraber deyil");
//        }

//        String ad = new String("Java");
//        int ad = 5;
//        int ad1 =5;
//        String ad = "Orxan";
//        String ad1 = new String("Orxan");
//        String ad1 = new String("Java");
//        System.out.println(ad==ad1);


//        char ilkHerf = fullName.charAt(0);
//        int fullNameLength = fullName.length();

//        System.out.println(fullNameLength);
    }
}
