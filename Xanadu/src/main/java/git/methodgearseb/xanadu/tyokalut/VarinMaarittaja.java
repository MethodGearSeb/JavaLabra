package git.methodgearseb.xanadu.tyokalut;

import javafx.scene.paint.Color;

public class VarinMaarittaja {
    
    private Color vari;

    public VarinMaarittaja() {
    }

    public void setVari(Color vari) {
        this.vari = vari;
    }
    
    public float savy() {
        return (float) vari.getHue();
    }
    
    public float kyllaisyys() {
        return (float) vari.getSaturation();
    }
    
    public float kirkkaus() {
        return (float) vari.getBrightness();
    }
    
    public float punainen() {
        return (float) vari.getRed();
    }
    
    public float vihrea() {
        return (float) vari.getGreen();
    }
    
    public float sininen() {
        return (float) vari.getBlue();
    }
}
