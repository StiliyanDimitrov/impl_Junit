package annotationsTest;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class CalculatorTestProcessor 
{
    public static void main(String[] args)
    {
       Class<CalculatorTest> obj = CalculatorTest.class;
    for (Method method : obj.getDeclaredMethods()) {
        if (method.isAnnotationPresent(calculatorTestAnnotation.class)) {
            method.setAccessible(true);
            try {
                method.invoke(obj.newInstance());
            }
            catch(InstantiationException ex)
            {
            
            }
            catch (InvocationTargetException ex) {
                
            } catch (IllegalAccessException ex) {
                
            }
        }
    } 
    }
}
