package ru.netology.javaqa95.HWmvn10_OOP.services;

public class Radio {
    private int currentRadioStations;

    private int minRadioStations = 0;
    private int totalRadioStations = 10;
    private int maxRadioStations = minRadioStations + totalRadioStations - 1;
    private int currentVolume;
    private int minVolume = 0;
    private int totalVolume = 100;
    private int maxVolume = minVolume + totalVolume;

    public Radio(int totalRadioStations) {
        this.totalRadioStations = totalRadioStations;
        this.maxRadioStations = minRadioStations + totalRadioStations - 1;
    }

    public Radio() {

    }

    public int getCurrentRadioStations() {
        return currentRadioStations;
    }

    public int getMinRadioStations() {
        return minRadioStations;
    }

    public int getMaxRadioStations() {
        return maxRadioStations;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setCurrentRadioStations(int newCurrentRadioStations) {
        if (newCurrentRadioStations < minRadioStations) {
            currentRadioStations = maxRadioStations;
            return;
        }
        if (newCurrentRadioStations > maxRadioStations) {
            currentRadioStations = minRadioStations;
            return;
        }
        currentRadioStations = newCurrentRadioStations;

    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            currentVolume = minVolume;
            return;
        }
        if (newCurrentVolume > maxVolume) {
            currentVolume = maxVolume;
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
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void lowerVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }
}