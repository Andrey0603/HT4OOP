import java.util.List;

public class Calculator  {

    public double sum (List <? extends Number> array) {
        double result =0;
        for (int i=0;i< array.size(); i++){
             result += array.get(i).doubleValue();
        }
        return result;
    }
    public int multiply(List<? extends Number> array) {
        int result = 1;
        for (int i = 0; i < array.size(); i++) {
            result *= array.get(i).intValue();
        }
        return result;
    }
    public double divide(List<? extends Number> array) {
        double result = array.get(0).doubleValue();
        for (int i = 1; i < array.size(); i++) {
            result /= array.get(i).doubleValue();
        }
        return result;
    }

    public String binaryConversion(Object value) {
        if (value instanceof String) {
            int intValue = Integer.parseInt((String) value);
            return Integer.toBinaryString(intValue);
        } else if (value instanceof Integer) {
            int intValue = (int) value;
            return Integer.toBinaryString(intValue);
        } else if (value instanceof Double || value instanceof Float) {
            int intValue = (int) Math.round(((Number) value).doubleValue());
            return Integer.toBinaryString(intValue);
        } else {
            return "Невозможно выполнить бинарный перевод для данного типа данных";
        }
    }
    
}

