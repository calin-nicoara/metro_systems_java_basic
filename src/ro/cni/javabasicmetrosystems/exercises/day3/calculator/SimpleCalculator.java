package ro.cni.javabasicmetrosystems.exercises.day3.calculator;

import java.math.BigDecimal;

class SimpleCalculator implements Calculator{

    public String calculate(String[] values) throws Exception{
        BigDecimal initialValue = new BigDecimal(values[0]);

        for(int i = 1; i < values.length && values[i] != null; i=i+2) {
            String operator = values[i];
            String operand = values[i+1];
            initialValue = getNewValue(operator, operand, initialValue);
        }

        return initialValue.toPlainString();
    }

    private BigDecimal getNewValue(final String operator, final String operand,
                                   BigDecimal initialValue) {
        if(operator.equals("+")) {
            return initialValue.add(new BigDecimal(operand));
        } else if(operator.equals("-")) {
            return initialValue.subtract(new BigDecimal(operand));
        }

        throw new RuntimeException("Operator not valid: " + operator);
    }
}
