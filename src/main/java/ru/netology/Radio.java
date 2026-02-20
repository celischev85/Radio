package ru.netology;

public class Radio {
    private int maxStation;
    private int minStation;
    private int currentStation;
    private int maxVolume;
    private int minVolume;
    private int currentVolume;

    public Radio() {
        this.maxStation = 9;
        this.maxVolume = 100;

    }

    public Radio(int size) {
        this.minStation = 0;
        this.maxStation = size - 1;
        this.currentStation = 0;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int setCurrentStation(int station) {
        if (station < 0 || station > maxStation) {
            currentStation = 0;
        } else {
            currentStation = station;
        }
        return currentStation;
    }

    public void next() {
        if (currentStation != 9) {
            currentStation++;
        } else {

            currentStation = 0;
        }

    }

    public void prev() {
        if (currentStation != 0) {
            currentStation--;
        } else {

            currentStation = 9;
        }
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            currentVolume = 100;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }

    public void up() {
        if (currentVolume != 100) {
            currentVolume++;
        } else {
            currentVolume = 100;


        }

    }

    public void down() {
        if (currentVolume != 0) {
            currentVolume--;
        } else {
            currentVolume = 0;
        }
    }

    public void setCurrentMinVolume() {
        this.currentVolume = 0;
    }

    public void setMaxVolume() {
        this.maxVolume = maxVolume;
    }


    public void setMinStation() {
        this.currentStation = 0;
    }

    public void setMaxStation() {
        this.currentStation = 9; // или другое максимально допустимое значение
    }
}














