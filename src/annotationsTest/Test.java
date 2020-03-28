package annotationsTest;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;


class Animal
{
    private int age;
    private int weight;
    private String name;
    
    
    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME) 
    @interface AnimalAnnotation
     {
         int age();
         int weight();
         String name();                
     }
    
    public int getAge()
    {
        return age;
    }
    
    public int getWeight()
    {
        return weight;
    }
    
    public String getName()
    {
        return name;
    }
    
    
    public Animal(int age, int weight, String name)
    {
        this.age = age;
        this.weight = weight;
        this.name = name;        
    }
    
    @AnimalAnnotation(age=15,weight=100,name="")
    public void eat()
    {
        try {
            AnimalAnnotation an = this.getClass().getMethod("eat").getAnnotation(AnimalAnnotation.class);
            if(this.weight > an.weight())
            {
                System.out.println("Animal cannot eat!");
            }
            else
            {
                System.out.println(getName() + " is eating");
            }
        } 
        catch (NoSuchMethodException ex) {
            
        }         
        
    } 
    
    @AnimalAnnotation(age=15,weight=100,name="")
    public void print()
    {
       try {
            AnimalAnnotation an = this.getClass().getMethod("print").getAnnotation(AnimalAnnotation.class);
            if(this.age > an.age())
            {
                System.out.println("Animal cannot be too old !");
            }
            else
            {
                System.out.println("Animal:" + getName() + " is " + getAge() + " years old." );
            }
        } 
        catch (NoSuchMethodException ex) {
            
        } 
    }
}




    

