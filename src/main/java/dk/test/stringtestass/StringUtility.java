package dk.test.stringtestass;

public class StringUtility {
    public static String reverseString(String input) {
        String retVal = "";
        char[] charList = input.toCharArray();
        char[] reversedList = new char[charList.length];
        for (int i = charList.length - 1; i >= 0; i--) {
           reversedList[charList.length - 1 - i] = charList[i];
        }
        retVal = new String(reversedList);
        return retVal;
    }

    public static String capitalizeString(String input) {
        String retVal = "";
        char[] charList = input.toCharArray();
        char[] capitalized = new char[charList.length];
        for (int i = 0; i < charList.length; i++) {
            capitalized[i] = Character.toUpperCase(charList[i]);
        }
        retVal = new String(capitalized);
        return retVal;
    }

    public static String lowercaseString(String input) {
        String retVal = "";
        char[] charList = input.toCharArray();
        char[] lower = new char[charList.length];
        for (int i = 0; i < charList.length; i++) {
            lower[i] = Character.toLowerCase(charList[i]);
        }
        retVal = new String(lower);
        return retVal;
    }
}
