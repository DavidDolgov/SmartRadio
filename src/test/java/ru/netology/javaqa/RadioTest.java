package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RadioTest {

    Radio action = new Radio();

    @ParameterizedTest
    @CsvFileSource(resources = "/numberRadio.csv")
    public void shouldSetNumberRadio(byte number, byte expected) {

        action.setNumberRadio(number);
        byte actual = action.getNumberRadio();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/controlRadio.csv")
    public void shouldRemoteControlRadio(byte value, String controlButton, byte expected, byte quantity) {
        Radio actionWithQuantity = new Radio(quantity);

        actionWithQuantity.setNumberRadio(value);
        if (controlButton.equals("next")) {
            actionWithQuantity.next();
        }
        if (controlButton.equals("prev")) {
            actionWithQuantity.prev();
        }
        byte actual = actionWithQuantity.getNumberRadio();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/controlVolume.csv")
    public void shouldRemoteControlVolume(byte value, String controlButton, byte expected) {

        action.setLevelVolume(value);
        if (controlButton.equals("+")) {
            action.nextLevelVolume();
        }
        if (controlButton.equals("-")) {
            action.prevLevelVolume();
        }
        byte actual = action.getLevelVolume();

        Assertions.assertEquals(expected, actual);
    }

}
