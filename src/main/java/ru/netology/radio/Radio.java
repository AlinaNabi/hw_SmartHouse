
package ru.netology.radio;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }


    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation <= 9 && newCurrentStation >= 0) {
            currentStation = newCurrentStation;
        } else {
            currentStation = getCurrentStation();
        }
    }

    //увеличение радиостанции
    public int increaseCurrentStation() {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
            return currentStation;
        }
        if (currentStation == 9) {
            currentStation = 0;
        }
        return currentStation;
    }


    //уменьшение радиостанции
    public int decreaseCurrentStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
            return currentStation;
        }
        if (currentStation == 0) {
            currentStation = 9;
        }
        return currentStation;
}

    //увеличение громкости
    public int increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = getCurrentVolume();
        }
        return currentVolume;
    }

    //уменьшение громкости
    public int decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = getCurrentVolume();
        }
        return currentVolume;
    }
    public void setCurrentStationForCoverage(int newCurrentStation) {
        this.currentStation = newCurrentStation;
    }
}
