package BONUS.PATTERN.EnumType;

public enum CalculatorTypeByAbstractMethod {
    CALC_A {
        @Override
        Long calculate(Long value) {
            return value;
        }
    },
    CALC_B{
        @Override
        Long calculate(Long value) {
            return value * 10;
        }
    },
    CALC_C{
        @Override
        Long  calculate(Long value) {
            return value * 3;
        }
    },
    CALC_ETC{
        @Override
        Long calculate(Long value) {
            return 0L;
        }
    };

    abstract Long calculate(Long value);
}
