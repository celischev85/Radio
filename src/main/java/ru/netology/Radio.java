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

    public Radio(int maxStation) {
        this.maxStation = 0;
        this.maxStation = maxStation - 1;
        this.currentStation = 0;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getcurrentStation() {
        return currentStation;
    }

    public void setсurrentradioStation(int Station) {
        if (Station < minStation) {
            this.currentStation = minStation;
        } else if (Station > maxStation) {
            this.currentStation = maxStation;
        } else {
            this.currentStation = Station;

        }
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

    public int getCurrentStation() {
        return currentStation;
    }

    public int setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return currentStation;
        }
        if (currentStation > 9) {
            return currentStation;
        }
        this.currentStation = currentStation;
        return currentStation;
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

        public void up () {
            if (currentVolume != 100) {
                currentVolume++;
            } else {
                currentVolume = 100;


            }

        }

        public void down () {
            if (currentVolume != 0) {
                currentVolume--;
            } else {
                currentVolume = 0;
            }
        }

        public void setCurrentMinVolume () {
            this.currentVolume = 0;
        }
        public void setMaxVolume () {
            this.maxVolume = maxVolume;
        }
    }





