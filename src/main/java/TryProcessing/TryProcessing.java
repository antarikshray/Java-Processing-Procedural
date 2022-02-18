package TryProcessing;

import processing.core.PApplet;

public class TryProcessing extends PApplet{

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int D = 10;
    public static final int C = 10;

    public int dsp =0;

    public static void main(String[] args){
        PApplet.main("TryProcessing.TryProcessing", args);
    }

    @Override
    public void settings(){
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup(){
    }

    @Override
    public void draw() {
        allCrcls();
        dsp++;
    }

    private void allCrcls() {
        for (int i = 0; i < 4; i++) {
            getCircle((i+1)*HEIGHT/5, (i+1)*dsp);
        }
    }

    private void getCircle(int h, int w) {
        ellipse(w, h, C, D);
    }
}
