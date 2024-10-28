package ru.netology.javaqa95.HWmvn10_OOP.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void test() {
        Radio cond = new Radio(30);
        Assertions.assertEquals(29, cond.getMaxRadioStations());
        Assertions.assertEquals(0, cond.getMinRadioStations());
        Assertions.assertEquals(0, cond.getCurrentRadioStations());
        Assertions.assertEquals(0, cond.getMinVolume());
        Assertions.assertEquals(100, cond.getMaxVolume());
        Assertions.assertEquals(0, cond.getCurrentVolume());
    }

    Radio cond = new Radio();

    @Test
    public void shouldSetRadioStations() {

        cond.setCurrentRadioStations(5);
        int actual = cond.getCurrentRadioStations();
        Assertions.assertEquals(5, actual);

    }

    @Test
    public void shouldNodSetRadioAboveMax() {

        cond.setCurrentRadioStations(10);
        int actual = cond.getCurrentRadioStations();
        Assertions.assertEquals(0, actual);
    }

    @Test
    public void shouldCurrentVolume() {

        cond.setCurrentVolume(25);
        int actual = cond.getCurrentVolume();
        Assertions.assertEquals(25, actual);
    }

    @Test
    public void shouldNextRadioStations() {

        cond.setCurrentRadioStations(3);
        cond.nextRadioStations();
        int actual = cond.getCurrentRadioStations();
        Assertions.assertEquals(4, actual);
    }

    @Test
    public void shouldPrevRadioStations() {

        cond.setCurrentRadioStations(6);
        cond.prevRadioStations();
        int actual = cond.getCurrentRadioStations();

        Assertions.assertEquals(5, actual);
    }

    @Test
    public void higherVolume() {

        cond.setCurrentVolume(66);
        cond.higherVolume();
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(67, actual);
    }

    @Test
    public void lowerVolume() {

        cond.setCurrentVolume(54);
        cond.lowerVolume();
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(53, actual);
    }

    @Test
    public void shouldNextRadioStationsOnEnd() {

        cond.setCurrentRadioStations(9);
        cond.nextRadioStations();
        int actual = cond.getCurrentRadioStations();
        Assertions.assertEquals(0, actual);
    }

    @Test
    public void shouldPrevRadioStationsOnStart() {

        cond.setCurrentRadioStations(0);
        cond.prevRadioStations();
        int actual = cond.getCurrentRadioStations();
        Assertions.assertEquals(9, actual);
    }

    @Test
    public void higherVolumeOnEnd() {

        cond.setCurrentVolume(101);
        cond.higherVolume();
        int actual = cond.getCurrentVolume();
        Assertions.assertEquals(100, actual);
    }

    @Test
    public void lowerVolumeOnStart() {

        cond.setCurrentVolume(-1);
        cond.lowerVolume();
        int actual = cond.getCurrentVolume();
        Assertions.assertEquals(0, actual);
    }
}