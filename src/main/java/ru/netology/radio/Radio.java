package ru.netology.radio;

public class Radio {

    private final int maxVolume;
    private int minVolume = 0;
    private final int maxChannel;
    private int minChannel = 0;
    private int currentVolume = minVolume;
    private int currentChannel = minChannel;

    protected Radio(int min, int max) {
        this.minVolume = min;
        this.maxVolume = max;
        this.minChannel = min;
        this.maxChannel = max;
        this.currentVolume = minVolume;
        this.currentChannel = minChannel;
    }

    protected Radio(int amount) {
        maxVolume = minVolume + amount;
        maxChannel = minChannel + (amount - 1);
    }


    protected int getCurrentVolume() {
        return currentVolume;
    }

    protected int getCurrentChannel() {
        return currentChannel;
    }

    protected int getMaxVolume() {
        return maxVolume;
    }

    protected int getMinVolume() {
        return minVolume;
    }

    protected int getMaxChannel() {
        return maxChannel;
    }

    protected int getMinChannel() {
        return minChannel;
    }

    protected void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    protected void setCurrentChannel(int newCurrentChannel) {
        if (newCurrentChannel < minChannel) {
            currentChannel = minChannel;
            return;
        }
        if (newCurrentChannel > maxChannel) {
            currentChannel = maxChannel;
            return;
        }
        currentChannel = newCurrentChannel;
    }


    protected void increaseVolume() {
        int target = currentVolume;
        if (currentVolume < maxVolume) {
            target = currentVolume + 1;
        }
        setCurrentVolume(target);
    }

    protected void decreaseVolume() {
        int target = currentVolume;
        if (currentVolume > minVolume) {
            target = currentVolume - 1;
        }
        setCurrentVolume(target);
    }

    protected void nextChannel() {
        int target = currentChannel + 1;
        if (target > maxChannel) {
            target = minChannel;
        }
        setCurrentChannel(target);
    }

    protected void prevChannel() {
        int target = currentChannel - 1;
        if (target < minChannel) {
            target = maxChannel;
        }
        setCurrentChannel(target);
    }
}
