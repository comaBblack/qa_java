package ru.java.prakticum;

import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;
import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class AnimalParamTest extends Animal {
    private final String animalEat;
    private final List<String> expected;

    public AnimalParamTest(String animalEat, List<String> expected){
        this.animalEat = animalEat;
        this.expected = expected;

    }

   @Parameterized.Parameters
    public static Object[][] getFood() {
        return new Object[][]
                {
                        {"Травоядное", List.of("Трава", "Различные растения")},
                        {"Хищник", List.of("Животные", "Птицы", "Рыба")}

                };
    }

    @Test
    public void getFoodTest() throws Exception {
        Animal animal = new Animal();
            List<String> actual = animal.getFood(animalEat);
            assertEquals(expected, actual);
        }







    }


