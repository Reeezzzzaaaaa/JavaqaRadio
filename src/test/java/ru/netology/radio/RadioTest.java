package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    @Test
    public void testNewRadioVolume() {
        Radio radio = new Radio(0, 100);

        Assertions.assertEquals(0, radio.getMinVolume());
        Assertions.assertEquals(100, radio.getMaxVolume());
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }


    @Test
    public void testNewRadioChannel() {
        Radio radio = new Radio(30);

        Assertions.assertEquals(0, radio.getMinChannel());
        Assertions.assertEquals(29, radio.getMaxChannel());
        Assertions.assertEquals(0, radio.getCurrentChannel());
    }


    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio radio = new Radio(0, 10);

        radio.setCurrentVolume(20);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldIncreaseVolumeMines1() {
        Radio radio = new Radio(0, 10);
        radio.setCurrentVolume(-1);

        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume9() {
        Radio radio = new Radio(0, 10);
        radio.setCurrentVolume(9);

        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume10() {
        Radio radio = new Radio(0, 10);
        radio.setCurrentVolume(10);

        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume1() {
        Radio radio = new Radio(0, 10);
        radio.setCurrentVolume(1);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume0() {
        Radio radio = new Radio(0, 10);
        radio.setCurrentVolume(0);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextChannel8() {
        Radio radio = new Radio(0, 9);
        radio.setCurrentChannel(8);

        radio.nextChannel();

        int expected = 9;
        int actual = radio.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextChannel9() {
        Radio radio = new Radio(0, 9);
        radio.setCurrentChannel(9);

        radio.nextChannel();

        int expected = 0;
        int actual = radio.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextChannel10() {
        Radio radio = new Radio(0, 9);
        radio.setCurrentChannel(10);

        radio.nextChannel();

        int expected = 0;
        int actual = radio.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevChannelMines1() {
        Radio radio = new Radio(0, 9);
        radio.setCurrentChannel(-1);

        radio.prevChannel();

        int expected = 9;
        int actual = radio.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevChannel0() {
        Radio radio = new Radio(0, 9);
        radio.setCurrentChannel(0);

        radio.prevChannel();

        int expected = 9;
        int actual = radio.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevChannel1() {
        Radio radio = new Radio(0, 9);
        radio.setCurrentChannel(1);

        radio.prevChannel();

        int expected = 0;
        int actual = radio.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }
}
