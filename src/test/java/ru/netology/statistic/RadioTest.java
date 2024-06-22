package ru.netology.statistic;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void testDefaultConstructor() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentStation());
        assertEquals(0, radio.getCurrentVolume());
        assertEquals(10, radio.getNumberOfStations());  // Проверка количества станций по умолчанию
    }

    @Test
    public void testCustomNumberOfStations() {
        Radio radio = new Radio(20);
        assertEquals(0, radio.getCurrentStation());
        assertEquals(0, radio.getCurrentVolume());
        assertEquals(20, radio.getNumberOfStations());  // Проверка кастомного количества станций
    }

    @Test
    public void testSetCurrentStationWithinRange() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void testSetCurrentStationOutOfRange() {
        Radio radio = new Radio();
        radio.setCurrentStation(15);
        assertEquals(0, radio.getCurrentStation());
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testSetCurrentVolumeWithinRange() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        assertEquals(50, radio.getCurrentVolume());
    }

    @Test
    public void testSetCurrentVolumeOutOfRange() {
        Radio radio = new Radio();
        radio.setCurrentVolume(150);
        assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void testNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
        radio.setCurrentStation(8);
        radio.nextStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void testPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();
        assertEquals(9, radio.getCurrentStation());
        radio.setCurrentStation(1);
        radio.prevStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void testIncreaseVolumeAtMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void testDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void testDecreaseVolumeAtMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void testNextStationWithCustomRange() {
        Radio radio = new Radio(15);
        radio.setCurrentStation(14);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
        radio.setCurrentStation(13);
        radio.nextStation();
        assertEquals(14, radio.getCurrentStation());
    }

    @Test
    public void testPrevStationWithCustomRange() {
        Radio radio = new Radio(15);
        radio.setCurrentStation(0);
        radio.prevStation();
        assertEquals(14, radio.getCurrentStation());
        radio.setCurrentStation(1);
        radio.prevStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testSetCurrentStationNegative() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testSetCurrentVolumeNegative() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getCurrentVolume());
    }
}
