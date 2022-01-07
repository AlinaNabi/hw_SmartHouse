
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

    public void setCurrentStation(int currentStation) {
        if (currentStation > 9) {
            return;
        }
            if (currentStation < 0) {
                return;
            }
            this.currentStation = currentStation;
        }


    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 10) {
            return;
        }
            if (currentVolume < 0) {
                return;
            }
            this.currentVolume = currentVolume;
    }

    public void currentStationForCoverage(int currentStation) {
        this.currentStation = currentStation;
    }
    //увеличение радиостанции
    public int increaseCurrentStation() {
        if (currentStation < 9) {
            currentStation = currentStation +1;
        }
        return currentStation;
    }
    //увеличение если номер радиостанции 9
    public int increaseCurrentStation9() {
        if (currentStation == 9) {
            currentStation = 0;
        }
        return currentStation;
    }
//уменьшение радиостанции
    public int decreaseCurrentStation() {
        if (currentStation > 0) {
            currentStation = currentStation -1;
        }
        return currentStation;
    }
//уменьшение если номер радиостанции 0
    public int decreaseCurrent0Station() {
        if (currentStation == 0) {
            currentStation = 9;
        }
        return currentStation;
    }
//увеличение звука
    public int increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume +1;
        }
        return currentVolume;
    }
    //уменьшение громкости
    public int decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        return currentVolume;
    }
}
