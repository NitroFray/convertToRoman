package no.kristiania;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class convertToRomanTest {
    @Test
    void shouldConvert1ToI() {
        assertEquals("I",  new convertToRoman(1).getRoman());
    }
}
