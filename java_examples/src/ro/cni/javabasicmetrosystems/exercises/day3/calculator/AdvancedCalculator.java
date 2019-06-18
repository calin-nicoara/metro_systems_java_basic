package ro.cni.javabasicmetrosystems.exercises.day3.calculator;

import java.math.BigDecimal;
import java.math.RoundingMode;

class AdvancedCalculator implements Calculator{

    public String calculate(String[] values) throws Exception{
        String[] newValues = handleMultiplicationAndDivision(values);

        SimpleCalculator simpleCalculator = new SimpleCalculator();
        return simpleCalculator.calculate(newValues);
    }

    private String[] handleMultiplicationAndDivision(final String[] values) {
        String[] newValues = new String[values.length];
        newValues[0] = values[0];
        int lastIndexOfNewValues = 0;

        for(int i = 1; i < values.length && values[i] != null; i=i+2) {
            String operator = values[i];
            String operand = values[i+1];

            if(operator.equals("*")) {
                newValues[lastIndexOfNewValues] = new BigDecimal(newValues[lastIndexOfNewValues])
                        .multiply(new BigDecimal(values[i + 1])).toPlainString();
            } else if(operator.equals("/")) {
                newValues[lastIndexOfNewValues] = new BigDecimal(newValues[lastIndexOfNewValues])
                        .divide(new BigDecimal(values[i + 1]), 2, RoundingMode.HALF_DOWN).toPlainString();
            } else {
                newValues[++lastIndexOfNewValues] = operator;
                newValues[++lastIndexOfNewValues] = operand;
            }
        }

        return newValues;
    }
}
