package ru.netology.statistic;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int numberOfStations;

    // Default constructor with 10 stations
    public Radio() {
        this.numberOfStations = 10;
    }

    // Constructor with custom number of stations
    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations;
    }

    // Getters and setters
    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation >= 0 && currentStation < numberOfStations) {
            this.currentStation = currentStation;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume >= 0 && currentVolume <= 100) {
            this.currentVolume = currentVolume;
        }
    }

    public int getNumberOfStations() {
        return numberOfStations;
    }

    // Methods to change station
    public void nextStation() {
        if (currentStation == numberOfStations - 1) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            currentStation = numberOfStations - 1;
        } else {
            currentStation--;
        }
    }

    // Methods to change volume
    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}

