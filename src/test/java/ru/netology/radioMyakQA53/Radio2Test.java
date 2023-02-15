package ru.netology.radioMyakQA53;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class Radio2Test {
    Radio radio = new Radio();

    @Test
    public void shouldChangeStationParameterTest() {
        Radio radio = new Radio(50);

        radio.setCurrentStation(13);

        int expended = 13;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expended, actual);
    }

    @Test

    public void shouldChangeStationNoParameterTest() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);

        int expended = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expended, actual);
    }
}