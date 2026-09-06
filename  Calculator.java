public class Calculator {

       public static int powerInt(int num1, int num2) {
        return (int) Math.pow(num1, num2);
    }

       public static double powerDouble(double num1, int num2) {
        return Math.pow(num1, num2);
    }

    public static void main(String[] args) {
              int baseInt = 2;
        int expInt = 5;
        int intResult = Calculator.powerInt(baseInt, expInt);
        System.out.println(baseInt + " ^ " + expInt + " = " + intResult);

               double baseDouble = 2.5;
        int expForDouble = 3;
        double doubleResult = Calculator.powerDouble(baseDouble, expForDouble);
        System.out.println(baseDouble + " ^ " + expForDouble + " = " + doubleResult);
    }
}