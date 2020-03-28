
package annotationsTest;

public class TestAnimal
{
    public static void main(String[] args) 
    {
        Animal cat = new Animal(16,30,"Tom");
        cat.print();
        cat.eat();
        Animal dog = new Animal(9,110,"Dingo");
        dog.print();
        dog.eat();
    }
    
}


