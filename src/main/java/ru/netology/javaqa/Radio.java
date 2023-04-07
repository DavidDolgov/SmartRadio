package ru.netology.javaqa;

public class Radio {
    private byte numberRadio;
    private byte levelVolume;

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
        if (newNumberRadio > 9) {
            return;
        }
        numberRadio = newNumberRadio;
    }

    public void setLevelVolume(byte newLevelVolume) {
        if (newLevelVolume < 0) {
            return;
        }
        if (newLevelVolume > 10) {
            return;
        }
        levelVolume = newLevelVolume;
    }

    public byte remoteControlRadio(String controlButton) {
        byte valueRadio = 0;

        if (controlButton.equals("next")) {
            next();
        } else {
            valueRadio = numberRadio;
        }
        if (controlButton.equals("prev")) {
            prev();
        }else {
            valueRadio = numberRadio;
        }
        return valueRadio = numberRadio;
    }

    public byte remoteControlVolume(String controlButton) {
        byte valueVolume = 0;

        if (controlButton.equals("+")) {
            nextLevelVolume();
        } else {
            valueVolume = levelVolume;
        }
        if (controlButton.equals("-")) {
            prevLevelVolume();
        }else {
            valueVolume = levelVolume;
        }
        return valueVolume = levelVolume;
    }

    private void next() {
        numberRadio++;
        if (numberRadio == 10) {
            numberRadio = 0;
        }
    }

    private void prev() {
        numberRadio--;
        if (numberRadio == -1) {
            numberRadio = 9;
        }
    }

    private void nextLevelVolume() {
        levelVolume++;
        if (levelVolume == 11) {
            levelVolume = 10;
        }
    }

    private void prevLevelVolume() {
        levelVolume--;
        if (levelVolume == -1) {
            levelVolume = 0;
        }
    }


}
