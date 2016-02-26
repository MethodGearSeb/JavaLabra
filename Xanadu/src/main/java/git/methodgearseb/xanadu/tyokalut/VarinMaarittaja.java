package git.methodgearseb.xanadu.tyokalut;

import javafx.scene.paint.Color;

public class VarinMaarittaja {
    
    private Color vari;

    public VarinMaarittaja() {
    }

    public void setVari(Color vari) {
        this.vari = vari;
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
