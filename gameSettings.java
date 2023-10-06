public class gameSettings {
    private int soundVolume;
    private int graphicsQuality;

    public gameSettings() {
        this.soundVolume = 50;
        this.graphicsQuality = 50;
    }

    public void setSoundVolume(int soundVolume) {
        this.soundVolume = soundVolume;
    }
 
    public void setGraphicsQuality(int graphicsQuality) {
        this.graphicsQuality = graphicsQuality;
    }

    public int getSoundVolume() {
        return this.soundVolume;
    }

    public int getGraphicsQuality() {
        return this.graphicsQuality;
    }

    public void displaySettings() {
        System.out.println("Sound Volume: " + this.soundVolume);
        System.out.println("Graphics Quality: " + this.graphicsQuality);
    }
}
