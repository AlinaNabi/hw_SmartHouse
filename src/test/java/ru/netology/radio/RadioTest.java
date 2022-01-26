package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
private Radio rad = new Radio();

private Radio numberRadio = new Radio(10);

    //переключение радиостанции на следующую
    @Test
    void shouldIncreaseCurrentStationMin() {
       rad.setCurrentStation(0);
        rad.increaseCurrentStation();

        int actual = rad.getCurrentStation();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseCurrentStationMid() {
       rad.setCurrentStation(4);
        rad.increaseCurrentStation();

        int actual = rad.getCurrentStation();
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseCurrentStationMax() {

        rad.setCurrentStation(9);
        int actual = rad.increaseCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseCurrentStationMoreMax() {
        rad.setCurrentStation(15);
        rad.increaseCurrentStation();

        int actual = rad.getCurrentStation();
        int expected = 1;

        assertEquals(expected, actual);
    }


    //переключение радиостанций на предыдущую

    @Test
    void shouldDecreaseCurrentStation() {
        rad.setCurrentStation(4);
        rad.decreaseCurrentStation();

        int actual = rad.getCurrentStation();
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetDecreaseCurrentStationMin() {
        rad.setCurrentStation(0);

        int actual = rad.decreaseCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseCurrentStationMoreMax() {
        rad.setCurrentStation(15);
        rad.decreaseCurrentStation();

        int actual = rad.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void shouldGetDecreaseCurrentStationMoreMin() {
        rad.setCurrentStation(-10);
        rad.decreaseCurrentStation();

        int actual = rad.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    //увеличение звука
    @Test
    void shouldIncreaseCurrentVolumeMin() {
        rad.setCurrentVolume(0);
        rad.increaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseCurrentVolumeMax() {
        rad.setCurrentVolume(100);

        int actual = rad.increaseVolume();
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseCurrentVolumeMid() {
        rad.setCurrentVolume(50);
        rad.increaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 51;
        assertEquals(expected, actual);
    }

    //уменьшение звука
    @Test
    void shouldDecreaseCurrentVolume() {
        rad.setCurrentVolume(100);
        rad.decreaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 99;
        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseCurrentVolumeUnderLimit() {
        rad.setCurrentVolume(-3);

        int actual = rad.decreaseVolume();
        int expected = -3;
        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseCurrentVolumeMin() {
        rad.setCurrentVolume(0);
        rad.decreaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseCurrentVolumeMore() {
        rad.setCurrentVolume(5);

        int actual = rad.decreaseVolume();
        int expected = 4;
        assertEquals(expected, actual);
    }
}