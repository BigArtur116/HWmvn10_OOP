package ru.netology.javaqa95.HWmvn10_OOP.services;

public class Radio {
    private int currentRadioStations;
    private int currentVolume;

    public int getCurrentRadioStations() {
        return currentRadioStations;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentRadioStations(int newCurrentRadioStations) {
        if (newCurrentRadioStations < 0) {
            currentRadioStations = 9;
            return;
        }
        if (newCurrentRadioStations > 9) {
            currentRadioStations = 0;
            return;
        }
        currentRadioStations = newCurrentRadioStations;

    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            currentVolume = 0;
            return;
        }
        if (newCurrentVolume > 100) {
            currentVolume = 100;
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void nextRadioStations() {
        int target = currentRadioStations + 1;
        setCurrentRadioStations(target);
    }

    public void prevRadioStations() {
        int target = currentRadioStations - 1;
        setCurrentRadioStations(target);
    }

    public void higherVolume() {
        if(currentVolume < 100) {
            currentVolume++;
        }
    }

    public void lowerVolume() {
        if(currentVolume > 0) {
            currentVolume--;
        }
    }
}
