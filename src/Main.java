public class Main {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));

    }

    private static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if (isValid(num1) == false || isValid(num2) == false || isValid(num3) == false ){
            return false;
        }

        int num1Last = num1 % 10;
        int num2Last = num2 % 10;
        int num3Last = num3 % 10;

        if (num1Last == num2Last || num1Last == num3Last || num2Last == num3Last){
            return true;
        }





        return false;
    }

    private static boolean isValid(int num) {
        return num >= 10 && num <= 100;
    }

}