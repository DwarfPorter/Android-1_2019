package ru.geekbrains.helloactivity;

import org.junit.Test;
import static org.junit.Assert.*;

public class HelloUnitTest {
    @Test
    public void BuilderGreetingPhrase_Test() throws Exception {
        BuilderGreetingPhrase builderGreetingPhrase = new BuilderGreetingPhrase(new GreetingStrings() {
            @Override
            public String getHelloer() { return "GeekBrains"; }
            @Override
            public String getMorning() { return "Good morning"; }
            @Override
            public String getAfternoon() { return "Good afternoon"; }
            @Override
            public String getEvening() { return "Good evening"; }
            @Override
            public String getNight() { return "Good night"; }
        });
        assertEquals("Good night GeekBrains!", builderGreetingPhrase.get(0));
        assertEquals("Good morning GeekBrains!", builderGreetingPhrase.get(9));
        assertEquals("Good afternoon GeekBrains!", builderGreetingPhrase.get(13));
        assertEquals("Good evening GeekBrains!", builderGreetingPhrase.get(18));
    }
}
