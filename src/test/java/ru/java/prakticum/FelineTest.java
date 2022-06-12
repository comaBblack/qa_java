package ru.java.prakticum;

import com.example.Animal;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest extends Feline {
    @Mock
    Animal animal;

    public static int kittensCount;
    public static String actual;
    public static List<String> actualList;

    @Test
    public void getKittensTest(){
        Feline feline = new Feline();
        kittensCount = feline.getKittens();
        assertEquals(1,kittensCount );
    }

    @Test
    public void getKittensIntTest(){
        Feline feline = new Feline();
        int count = 4;
        kittensCount = feline.getKittens(count);
        assertEquals(count, kittensCount);
    }

    @Test
    public void getFamilyTest(){
        Feline feline = new Feline();
        actual = feline.getFamily();
        assertEquals("Кошачьи", actual);
    }

    @Test
    public void eatMeatTest() throws Exception {
        Feline feline = new Feline();
        Mockito.lenient().when(animal.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        actualList = feline.eatMeat();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), actualList);

    }
}
