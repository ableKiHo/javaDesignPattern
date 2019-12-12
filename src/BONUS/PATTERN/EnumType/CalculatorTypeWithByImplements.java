package BONUS.PATTERN.EnumType;

public enum  CalculatorTypeWithByImplements implements CalculatorOperation {
    CALC_A {
        @Override
        public Long calculate(Long value) {
            return value;
        }
    },
    CALC_B {
        @Override
        public Long calculate(Long value) {
            return value * 10;
        }
    },
    CALC_C {
        @Override
        public Long calculate(Long value) {
            return value * 3;
        }
    },
    CALC_ETC {
        @Override
        public Long calculate(Long value) {
            return 0L;
        }
    };

}
