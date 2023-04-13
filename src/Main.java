import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        BigDecimal value = new BigDecimal("1.26890");
        BigDecimal value1 = new BigDecimal("2.4524");
        BigDecimal value2 = new BigDecimal("-45.982");
        System.out.println(roundToNearestHundredth(value));
        System.out.println(roundAndReversSign(value1));
        System.out.println(roundAndReversSign(value2));
    }

/*  1.  Using the BigDecimal documentation, create a method that accepts a BigDecimal and returns a double of the BigDecimal number rounded to the nearest hundredth.
    For example, 4.2545 should return 4.25.*/
    public static double roundToNearestHundredth(BigDecimal value) {
        BigDecimal roundedValue = value.setScale(2, RoundingMode.HALF_EVEN);
        return roundedValue.doubleValue();
    }
/*  2.  Using the BigDecimal documentation, create a method that accepts a BigDecimal, reverses the sign (if the parameter is positive, the result should be negative and vice versa), rounds the number to the nearest tenth and returns the result.
    For example, 1.2345 should return -1.2 and -45.67 should return 45.7.*/
    public static BigDecimal roundAndReversSign(BigDecimal value){
        BigDecimal roundedValue = value.setScale(1, RoundingMode.HALF_EVEN);
        return roundedValue.negate();
    }
}

