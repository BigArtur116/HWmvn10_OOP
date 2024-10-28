package ru.netology.javaqa95.HWmvn10_OOP.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {
    @Test
    public void shouldSetRadioStations() {
        Radio cond = new Radio();

        cond.setCurrentRadioStations(5);

        int expected = 5;
        int actual = cond.getCurrentRadioStations();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNodSetRadioAboveMax() {
        Radio cond = new Radio();

        cond.setCurrentRadioStations(10);

        int expected = 0;
        int actual = cond.getCurrentRadioStations();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldCurrentVolume() {
        Radio cond = new Radio();

        cond.setCurrentVolume(25);

        int expected = 25;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNextRadioStations() {
        Radio cond = new Radio();

        cond.setCurrentRadioStations(3);

        cond.nextRadioStations();

        int expected = 4;
        int actual = cond.getCurrentRadioStations();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStations() {
        Radio cond = new Radio();

        cond.setCurrentRadioStations(6);

        cond.prevRadioStations();

        int expected = 5;
        int actual = cond.getCurrentRadioStations();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void higherVolume() {
        Radio cond = new Radio();

        cond.setCurrentVolume(66);

        cond.higherVolume();

        int expected = 67;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lowerVolume() {
        Radio cond = new Radio();

        cond.setCurrentVolume(54);

        cond.lowerVolume();

        int expected = 53;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadioStationsOnEnd() {
        Radio cond = new Radio();

        cond.setCurrentRadioStations(9);

        cond.nextRadioStations();

        int expected = 0;
        int actual = cond.getCurrentRadioStations();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStationsOnStart() {
        Radio cond = new Radio();

        cond.setCurrentRadioStations(0);

        cond.prevRadioStations();

        int expected = 9;
        int actual = cond.getCurrentRadioStations();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void higherVolumeOnEnd() {
        Radio cond = new Radio();

        cond.setCurrentVolume(101);

        cond.higherVolume();

        int expected = 100;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lowerVolumeOnStart() {
        Radio cond = new Radio();

        cond.setCurrentVolume(-1);

        cond.lowerVolume();

        int expected = 0;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
