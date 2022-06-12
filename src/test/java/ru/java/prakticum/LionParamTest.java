package ru.java.prakticum;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;
@RunWith(Parameterized.class)
public class LionParamTest {

    Feline feline;
    private boolean hasMane;
    private String sex;
    private Boolean expected;

    public LionParamTest(String sex, Boolean expected){
        this.sex = sex;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] doesHaveMane() {
        return new Object[][] {
                { "Самец",true },
                { "Самка", false }


        };
    }

    @Test
    public void doesHaveManeTest() throws Exception {
        Lion lion = new Lion(feline, sex);
            boolean actual = lion.doesHaveMane();
            assertEquals(expected,actual);
    }
}