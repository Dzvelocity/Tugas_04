package LCD;

public class LCD {
    private String status;
    private int volume;
    private int brightness;
    private String cable;

    public LCD() {
        this.status = "Off";
        this.volume = 0;
        this.brightness = 0;
        this.cable = "Null";
    }

    public void turnOff() {
        this.status = "Off";
    }

    public void turnOn() {
        this.status = "On";
    }

    public void Freeze() {
        this.status = "Freeze";
    }

    public void volumeUp() {
        this.volume++;
    }

    public void volumeDown() {
        if (this.volume > 0) {
            this.volume--;
        }
    }

    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
        }
    }

    public void brightnessUp() {
        this.brightness++;
    }

    public void brightnessDown() {
        if (this.brightness > 0) {
            this.brightness--;
        }
    }

    public void setBrightness(int brightness) {
        if (brightness >= 0 && brightness <= 100) {
            this.brightness = brightness;
        }
    }

    public void setCable(int option) {
        String[] cables = {"VGA", "DVI", "HDMI", "DisplayPort"};
        if (option >= 0 && option < cables.length) {
            this.cable = cables[option];
        }
    }

    public void displayMessage() {
        System.out.println("LCD Status: " + status);
        System.out.println("Volume: " + volume);
        System.out.println("Brightness: " + brightness);
        System.out.println("Cable: " + cable);
    }
}
