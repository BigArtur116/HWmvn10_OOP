package ru.netology.javaqa95.HWmvn10_OOP.services;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

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

    public void nextRadioStations() {
        int target = currentRadioStations + 1;
        setCurrentRadioStations(target);
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
