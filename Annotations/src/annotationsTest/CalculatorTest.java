package annotationsTest;

public class CalculatorTest {

        @calculatorTestAnnotation
        public void testAdd() {
                Calculator calc = new Calculator();
                //assertEquals(calc.add(new int[]{10,20,30}),60);
                if(calc.add(new int[]{10,20,30}) == 60)
                {
                    System.out.println("Test succeeded !");
                }
                else
                {
                    System.out.println("Test failed !");
                }
        }

        @calculatorTestAnnotation
        public void testMultiply() {
                Calculator calc = new Calculator();
                if(calc.multiply(new int[]{10,20,30}) == 6000)
                {
                    System.out.println("Test succeeded !");
                }
                else
                {
                    System.out.println("Test failed !");
                }
        }

}


