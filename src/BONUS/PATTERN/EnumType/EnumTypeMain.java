package BONUS.PATTERN.EnumType;

public class EnumTypeMain {
    public static void main(String[] args) {

        //TODO Enum은 타입에 대해 안전하다. (다른것을 할당 할 수 없다.)
        //TODO 확장이 쉽다.(새로운 상수 추가하기!, 기존 코드를 고치지 않아도 된다.)

        DevType devType = DevType.WEB;
        DevType devType1 = DevType.valueOf("WEB");
        System.out.println(devType == devType1); //TODO  result : true

        DevTypeWithValue devTypeWithValue = DevTypeWithValue.valueOf("WEB");

        for(DevTypeWithValue d : DevTypeWithValue.values()) {
            System.out.println(d.getName());
        }

        final long testValue = 1000L;

        //TODO enum클래스는 내부적으로 Enum<T>를 상속 방기 때문에 extend 불가. interface 구현으로 확장 가능

        CalculatorTypeByAbstractMethod calculatorTypeByAbstractMethod = CalculatorTypeByAbstractMethod.valueOf("CALC_B");
        long result2 = calculatorTypeByAbstractMethod.calculate(testValue);

        CalculatorTypeWithByImplements calculatorTypeWithByImplements = CalculatorTypeWithByImplements.valueOf("CALC_B");
        long result3 = calculatorTypeWithByImplements.calculate(testValue);

        CalculatorTypeWithFunctionInterface calculatorTypeWithFunctionInterface = CalculatorTypeWithFunctionInterface.valueOf("CALC_B");
        long result1 = calculatorTypeWithFunctionInterface.calculate(testValue);




    }
}
