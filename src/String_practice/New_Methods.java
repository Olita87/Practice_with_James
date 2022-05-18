package String_practice;

public class New_Methods {

    public static void main(String[] args) {

        String str1 = "Olya";
        str1 = str1.toUpperCase();// to upper case method will change all the letters to upper case
        String str2;
        str2 = str1.toLowerCase();// to lower case method will change all the letter to lower case

        boolean isSame = str1.equals(str2);//equals method returns boolean and will check if the str1 is identical to str2. and does not ignore case.
        isSame = str1.equalsIgnoreCase(str2);// equalsIgnoreCase will return boolean value as well and will ignore case vs just equals.

        int length = str1.length();// length is the method that returns int value and will show the length of the String(amount of letter in it)
        char letter = str1.charAt(0);//will show index of the letter in the given String(str1.charAt(str1.length()-1) always will be the last letter

        int nums = str1.indexOf("Y");//returns int value (variable for a number) requires  String, returns INT value as a first position in the word

        String woodenSpoon = "Wooden Spoon";
        int index = woodenSpoon.indexOf(" ");
        String str3 = woodenSpoon.substring(index);//return String (cuts the String where the beginning index is located to the end unless we give the end value)
        String str4 = woodenSpoon.substring(0, index);
        str3 = str3.trim();// automatically gets rid of the spaces at the beginning and the end.
        str4 = str4.replace('o', '@');// replace all given letter in the String with a new one
        str4 = str4.replaceAll("W@@", "oo");//replaces all the given String chars with new ones
        str3 = str3.replaceFirst("o", "@");// replaces first of the double letters in this case Spoon (o's)with, since it takes String it can replace multiple characters @ sign

        boolean empty = str3.isEmpty();// checks if the string is empty
        boolean startWith = str3.startsWith("S");// returns boolean value in this case true "Spoon"
        boolean endsWith = str3.endsWith("n");// returns boolean value in this case true as well see 32line

        String str5 = "I love java";
        int str6 = str5.lastIndexOf(" ");// will return 6( returns last index of the given string
        int index3 = str5.indexOf(" ");
        String str7 = str5.substring(index3, str6);
        str5.substring(str5.indexOf(" "), str5.lastIndexOf(" "));


        String str8 = "If I keep practicing I will get better";
        str8.substring(5, 20);
        str8.substring(str8.lastIndexOf("b"));
        str8.substring(0, 20);
        str8.substring(30, 38);

//replace method

        str8 = str8.replace('e', '3');
        str8 = str8.replace("33", "EE");// overloaded method see line 48 vs 49 Char vs String

        String str9 = "I will keep practicing java";
        int num1 = str9.indexOf(" ");
        int num2 = str9.lastIndexOf(" ");
        String str10 = str9.substring(num1, num2);
        String str11 = str9.substring(num2);
        char char1 = str9.charAt(2);
        String str12=str9.substring((str9.indexOf('k')),(str9.indexOf('p')+1));
        int num3 = str9.indexOf('p');
        int num4 = str9.indexOf('k');
        String str13= str9.substring(num4,num3);


        System.out.println(str13);


    }
}
