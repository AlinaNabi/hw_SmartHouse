
package ru.netology.radio;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int numberStations = 10;

    public Radio(int numberStations) {
        this.numberStations = numberStations;
    }

    public Radio() {
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
    public int getNumberStations() {
        return numberStations;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    public void setNumberStations(int numberStations) {
        this.numberStations = numberStations;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation <= numberStations - 1 && newCurrentStation >= 0) {
            currentStation = newCurrentStation;
        }
        this.currentStation = currentStation;
    }

    //увеличение радиостанции
    public int increaseCurrentStation() {
        if (currentStation < numberStations - 1) {
            currentStation = currentStation + 1;
        }
        if (currentStation == numberStations -1) {
            currentStation = 0;
        }
        return currentStation;
    }


    //уменьшение радиостанции
    public int decreaseCurrentStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        }
        if (currentStation == 0) {
            currentStation = numberStations - 1;
        }
        return currentStation;
}

    //увеличение громкости
    public int increaseVolume() {
        if (currentVolume < 100) {
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

}
