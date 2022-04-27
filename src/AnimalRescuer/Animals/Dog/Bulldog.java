package AnimalRescuer.Animals.Dog;

import java.awt.dnd.DragSource;
import java.util.function.DoubleToIntFunction;

public class Bulldog extends Dog{


    @Override
    public void speak() {
        System.out.println("Ham-Ham");
    }

    @Override
    public void play() {
        System.out.println("playing ....");
    }

    @Override
    public void eat() {
        System.out.println("eating dog food");
    }
}
