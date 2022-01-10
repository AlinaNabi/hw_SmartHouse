package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {


    //переключение радиостанции на следующую
    @Test
    public void shouldIncreaseCurrentStationMin() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);
    }

    @Test
    public void shouldIncreaseCurrentStationMin1() {
        Radio rad = new Radio();
        rad.setCurrentStation(1);

        int actual = rad.increaseCurrentStation();
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseCurrentStationMax() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);

        int actual = rad.increaseCurrentStation9();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseCurrentStationMid() {
        Radio rad = new Radio();
        rad.setCurrentStation(5);

        int actual = rad.increaseCurrentStation();
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseCurrentStationMid8() {
        Radio rad = new Radio();
        rad.setCurrentStation(8);

        int actual = rad.increaseCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseCurrentStationMoreMax() {
        Radio rad = new Radio();
        rad.setCurrentStation(10);

        int actual = rad.increaseCurrentStation9();
        int expected = 0;

        assertEquals(expected, actual);
    }

    //переключение радиостанций на предыдущую
    @Test
    void shouldDecreaseCurrentStationMax() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);

        int actual = rad.decreaseCurrentStation();
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseCurrentStationMin() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);

        int actual = rad.decreaseCurrent0Station();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseCurrentStationMid() {
        Radio rad = new Radio();
        rad.setCurrentStation(4);

        int actual = rad.decreaseCurrentStation();
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseCurrentStationMoreMax() {
        Radio rad = new Radio();
        rad.setCurrentStation(10);

        int actual = rad.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetDecreaseCurrentStationMoreMin() {
        Radio rad = new Radio();
        rad.setCurrentStation(-10);

        int actual = rad.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseCurrentStationMoreMin() {
        Radio rad = new Radio();
        rad.setCurrentStation(-1);

        int actual = rad.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void shouldGetDecreaseCurrentStationMoreMin() {
        Radio rad = new Radio();
        rad.setCurrentStation(-10);

        int actual = rad.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    //увеличение звука
    @Test
    void shouldIncreaseCurrentVolumeMin() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);

        int actual = rad.increaseVolume();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseCurrentVolumeMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(15);

        int actual = rad.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseCurrentVolumeMid() {
        Radio rad = new Radio();
        rad.setCurrentVolume(5);

        int actual = rad.increaseVolume();
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseCurrentVolumeMoreMin() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);

        int actual = rad.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    //уменьшение звука
    @Test
    void shouldDecreaseCurrentVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(9);

        int actual = rad.decreaseVolume();
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseCurrentVolumeMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);

        int actual = rad.decreaseCurrent0Station();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseCurrentVolumeMin() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);

        int actual = rad.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseCurrentVolumeMore() {
        Radio rad = new Radio();
        rad.setCurrentVolume(5);

        int actual = rad.decreaseVolume();
        int expected = 4;
        assertEquals(expected, actual);
    }
}