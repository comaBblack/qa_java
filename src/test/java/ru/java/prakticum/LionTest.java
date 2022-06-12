package ru.java.prakticum;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline feline;
    private static String sex;
    private static List<String> actual;

    @Test
    public void doesHaveManeExceptionTest() throws Exception {
        sex = "Xe";

        try{
            Lion lion = new Lion(feline, sex);
            lion.doesHaveMane();

        }catch (Exception exception){
            assertEquals("Используйте допустимые значения пола животного - самей или самка", exception.getMessage());
        } }

    @Test
    public void getFoodTest() throws Exception {
        sex = "Самец";
        Lion lion = new Lion(feline, sex);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        actual = lion.getFood();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), actual);
    }

    @Test
    public void getKittensTest() throws Exception {
        sex = "Самец";
        Lion lion = new Lion(feline, sex);
        Mockito.when(feline.getKittens()).thenReturn(1);
        int actualKittens = lion.getKittens();
        assertEquals(1, actualKittens);
    }
}

