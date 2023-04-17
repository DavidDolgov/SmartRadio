package ru.netology.javaqa;

public class Radio {
    private byte numberRadio;
    private byte levelVolume;
    private byte quantityRadio = 10;
    private byte maxLevelVolume = 100;
    private byte minLevelVolume = 0;

    public Radio(byte quantityRadio) {
        this.quantityRadio = quantityRadio;
    }

    public Radio() {
    }

    public byte getNumberRadio() {
        return numberRadio;
    }

    public byte getLevelVolume() {
        return levelVolume;
    }

    public void setNumberRadio(byte newNumberRadio) {
        if (newNumberRadio < 0) {
            return;
        }
        if (newNumberRadio > quantityRadio - 1) {
            return;
        }
        numberRadio = newNumberRadio;
    }

    public void setLevelVolume(byte newLevelVolume) {
        if (newLevelVolume < 0) {
            return;
        }
        if (newLevelVolume > maxLevelVolume) {
            return;
        }
        levelVolume = newLevelVolume;
    }

    public void next() {
        numberRadio++;
        if (numberRadio == quantityRadio) {
            numberRadio = 0;
        }
    }

    public void prev() {
        numberRadio--;
        if (numberRadio == -1) {
            numberRadio = (byte) (quantityRadio - 1);
        }
    }

    public void nextLevelVolume() {
        levelVolume++;
        if (levelVolume == maxLevelVolume + 1) {
            levelVolume = maxLevelVolume;
        }
    }

    public void prevLevelVolume() {
        levelVolume--;
        if (levelVolume == minLevelVolume - 1) {
            levelVolume = minLevelVolume;
        }
    }


}
