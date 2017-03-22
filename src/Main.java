/**
 * Created by Taron on 03/22/17.
 */
public class Main {

    public static void last3LettersToUpperCase(String str) {
        System.out.println(str.substring(0, str.length() - 3) + str.substring(str.length() - 3, str.length()).toUpperCase());
    }

    public static void stringTimes(String str, int count){
        String newLine = "";
        for(int i = 0;i < count;i++)
            newLine += str;
        System.out.println(newLine);
    }

    public static boolean doubleX(String str){

        int i = str.indexOf('x');
        if(str.charAt(i + 1) == 'x')
            return true;
        else return false;
    }

    public static int last2(String str){
        String newLine = str.substring(str.length() - 2,str.length());
        int i = 0;
        for(int j = 0;j < str.length() - 2;j++){
            if(str.substring(j,j + 2).equals(newLine)){
                i++;
            }
        }
        return i;
    }

    public static boolean array123(int[] nums){
        boolean answer = (nums.length >= 3) ? true : false;
        if(answer){
            for(int i = 0;i < nums.length - 2;i++){
                if(nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
                    answer = true;
                    break;
                }
                else answer = false;
            }
        }
        return answer;
    }

    public static String altPairs(String str){
        int j = 1;
        StringBuilder builder = new StringBuilder();
        for(int i = 0;i < str.length();){
            if(j == 1) {
                builder.append(str.charAt(i));
                i++;
                j++;
            }
            if(j == 2){
                builder.append(str.charAt(i));
                i += 3;
                j = 1;
            }
        }
        return builder.toString();
    }

    public static boolean noTriples(int[] nums){
        boolean answer = true;
        for(int i = 0;i < nums.length - 2;i++){
            if((nums[i] == nums[i+1]) && (nums[i+1] == nums[i+2])){
                answer = false;
                break;
            }
        }
        return answer;
    }

    public static String stringBits(String str){
        String newLine;
        StringBuilder builder = new StringBuilder();
        for(int i = 0;i < str.length();i+=2){
            builder.append(str.charAt(i));
        }
        newLine = builder.toString();
        return newLine;
    }

    public static int arrayCount9(int[] nums){
        int count = 0;
        for(int i = 0;i < nums.length;i++){
            if(nums[i] == 9)
                count++;
        }
        return count;
    }

    public static int stringMatch(String str1, String str2){
        int minLenght = (str1.length() <= str2.length()) ? str1.length() : str2.length();
        int count = 0;
        for(int i =0;i < minLenght - 1;i++){
            if(str1.substring(i,i + 2).equals(str2.substring(i,i + 2)))
                count++;
        }return count;
    }

    public static String stringYak(String str){
        return str.replaceAll("yak","");
    }

    public static boolean has271(int[] nums) {
        for (int i = 0;i < nums.length - 1;i++){
            if((nums[i] + 5 == nums[i+1] && Math.abs(nums[i+2] - (nums[i]-1)) <= 2))
                return true;
        }
        return false;
    }

    public static int countXX(String str){
        int count = 0;
        for(int i = 0;i < str.length() - 1;i++){
            if(str.charAt(i) == 'x' && str.charAt(i + 1) == 'x')
                count ++;
        }
        return count;
    }

    public static String splosion(String str){
        String newLine;
        StringBuilder builder = new StringBuilder();
        for (int i = 0, j = 1;j < str.length() + 1;){
            builder.append(str.substring(i,i+j));
            j++;
        }
        newLine = builder.toString();
        return newLine;
    }

    public static boolean arrayFront(int[] nums){
        boolean answer = false;
        if(nums.length >= 4) {
            for (int i = 0; i < 4; i++) {
                if (nums[i] == 9)
                    answer = true;
            }
        }
                else answer = false;
        return answer;
    }


    public static void main(String[] args){
//        last3LettersToUpperCase("hambal");
//        stringTimes("Hi",3);
//        System.out.println(doubleX("hxxaxy"));
//        System.out.println(last2("xaxxxaxaxx"));
//        int[] array = {1,2,7,6,1};
//        System.out.println(array123(array));
//        System.out.println(altPairs("CodingHorror"));
//        System.out.println(noTriples(array));
//        System.out.println(stringBits("Hello"));
//        System.out.println(arrayCount9(array));
//        System.out.println(stringMatch("xxcaazz", "xxbaaza"));
//        System.out.println(stringYak("bayakrev"));
//        System.out.println(has271(array));
//        System.out.println(countXX("Baxxxrexv"));
//        System.out.println(splosion("Aziz"));
//        System.out.println(arrayFront(array));



    }
}
