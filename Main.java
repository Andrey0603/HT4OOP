
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Написать класс калькулятор, принимающий List целочисленных значений,
// возвращающий сумму элементов коллекции (метод sum)

// Малинин Андрей

public class Main {
    public static void main(String[] args) {
        List<Integer>array1 = new ArrayList<>(Arrays.asList(1,2,2,10));
        Calculator calculator = new Calculator();
        System.out.println("calculator = " + calculator.sum(array1));
        System.out.println("calculator = " + calculator.multiply(array1));
        System.out.println("calculator = " + calculator.divide(array1));

        List<Double> array2 = new ArrayList<>(Arrays.asList(1.2,2.5,1.0));
        System.out.println("array2 ="+calculator.sum(array2));
        System.out.println("array2 ="+calculator.multiply(array2));
        System.out.println("array2 = " + calculator.divide(array2));
        
        String binaryValue = "10";
        System.out.println("binary " + binaryValue + " = " + calculator.binaryConversion(binaryValue));

        int intValue = 7;
        System.out.println("binary " + intValue + " = " + calculator.binaryConversion(intValue));

        double doubleValue = 8.0;
        System.out.println("Двоичное представление числа " + doubleValue + " = " + calculator.binaryConversion(doubleValue));

        float floatValue = 6.0f;
        System.out.println("Двоичное представление числа " + floatValue + " = " + calculator.binaryConversion(floatValue));
    }

        
}

