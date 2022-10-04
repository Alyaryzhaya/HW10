package ru.netology.hw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void setStationNumber() {
        Radio radio = new Radio();
        radio.setStationNumber(20);

        int expected = 0;
        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setNextStationNumber() {
        Radio radio = new Radio();
        radio.setStationNumber(4); // stationNumber

        radio.nextStationNumber();

        int expected = 5;
        int actual = radio.getStationNumber(); // stationNumber
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setPrevStationNumber() {
        Radio radio = new Radio();
        radio.setStationNumber(9); // stationNumber

        radio.prevStationNumber();

        int expected = 8;
        int actual = radio.getStationNumber(); // stationNumber
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setVolume() {
        Radio radio = new Radio();
        radio.setVolume(50);

        int expected = 10;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextVolumeUntilMax() {
        Radio radio = new Radio();
        radio.setVolume(110);

        radio.nextUntilMax();

        int expected = 10;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevVolumeUntilMin() {
        Radio radio = new Radio();
        radio.setVolume(110);

        radio.prevUntilMin();

        int expected = 9;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);

    }
}