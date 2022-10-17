package javaCodes;

import kotlinCodes.Game;
import kotlinCodes.MainKt;
import kotlinCodes.SingletonObj;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

public class Car {
    private String color;
    private String company;
    private String year;

    public static void main(String[] args) {

        // Accessing the kotlin's Singleton object from java
        SingletonObj.printStr("Hello world");
        SingletonObj.INSTANCE.fibonacci(5);

        // Accessing the top level function
        MainKt.main();

        // Accessing the Companion object
        Game.addPoints();  // without accessing Companion because of annotation @JvmStatic
        Game.addPoints();  // without accessing Companion
        System.out.println(Game.points);
        Game.Companion.removePoints(); // with accessing Companion
        System.out.println(Game.points);

        // Catching the exception
        try{
            MainKt.doIO();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        // Accessing default args function
        MainKt.defaultArgs("The Value is");
    }

    public Car(@NotNull String color, String company, String year) {
        this.color = color;
        this.company = company;
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString(){
        return "Car(color = " + color + ", company = " + company + ", year = " + year + ")";
    }

}
