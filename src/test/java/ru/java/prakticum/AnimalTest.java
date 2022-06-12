package ru.java.prakticum;

import com.example.Animal;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimalTest extends Animal {
    public static String actual;

    @Test
    public void getFamilyTest(){
        Animal animal = new Animal();
        actual = animal.getFamily();
        assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", actual);
    }

    @Test
    public void exceptionTest() throws Exception {
        Animal animal = new Animal();
        try{ animal.getFood("Чушь");

        } catch (Exception exception){
            assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", exception.getMessage());
        }
    }




}
