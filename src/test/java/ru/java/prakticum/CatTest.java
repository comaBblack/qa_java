package ru.java.prakticum;

import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    Feline feline;
   public static String actual;

    @Test
    public void getSoundTest(){
        Cat cat = new Cat(feline);
        actual = cat.getSound();
        assertEquals("Мяу",actual);

    }

    @Test
    public void getFoodTest() throws Exception {
        Cat cat = new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actualList = cat.getFood();
        assertEquals(List.of("Животные", "Птицы", "Рыба"),actualList );


    }
}
