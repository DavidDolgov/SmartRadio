package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RadioTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/numberRadio.csv")
    public void shouldSetNumberRadio(byte number, byte expected) {
        Radio numberRadio = new Radio();

        numberRadio.setNumberRadio(number);
        byte actual = numberRadio.getNumberRadio();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/controlRadio.csv")
    public void shouldRemoteControlRadio(byte value,String controlButton, byte expected){
        Radio action = new Radio();

        action.setNumberRadio(value);
        action.remoteControlRadio(controlButton);
        byte actual = action.getNumberRadio();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/controlVolume.csv")
    public void shouldRemoteControlVolume(byte value,String controlButton, byte expected){
        Radio action = new Radio();

        action.setLevelVolume(value);
        action.remoteControlVolume(controlButton);
        byte actual = action.getLevelVolume();

        Assertions.assertEquals(expected, actual);
    }

}
