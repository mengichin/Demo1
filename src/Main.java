import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("------------------START--------------------");
        System.out.println("Please enter the value you want to convert:");
        String input = sc.nextLine();
        System.out.println("After converting: " + converNumFormat(input));
        System.out.println("------------------END----------------------");

    }
    public static String converNumFormat(String string){
        int start = 0;
        for (int i = 0; i < string.length(); i++){
            if (Character.isDigit(string.charAt(i))){
                start = i;
                break;
            }
        }
        String numString = string.substring(start); // select out the numeric part of the input value
        int doIndex = numString.indexOf(".");       //find the decimal point
        if (doIndex != -1 && numString.length() > doIndex +3){
            numString = numString.substring(0, doIndex+3);   //only keep 2 decimal place
        } else if (doIndex == -1) {
            numString += ".00";  // add .00 if value no decimal place
        }
        return numString;
    }
}