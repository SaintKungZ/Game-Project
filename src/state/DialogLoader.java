package state;

import java.awt.image.BufferedImage;
import java.awt.Graphics2D;
import java.awt.Font;

import graphic.Sprite;
import main.GamePanel;
import math.Vector2f;
import ui.Button;

public class DialogLoader {
    private Font font;
    public static Graphics2D g;

    public Button tl1;
    public Button tl2;
    public Button tl3;
    public Button tl4;

    public Button start1;
    public Button start2;
    public Button start3;
    public Button start4;
    public Button start5;

    public Button ol1;
    public Button ol2;

    public Button wm1;
    public Button wm2;

    public Button je1;
    public Button je2;

    public Button gl1;
    public Button gl2;

    public Button sd1;
    public Button sd2;
    public Button sd3;
 
    // * ---------------------Path---------------------------- *//
    public static Sprite tllog1;
    public static Sprite tllog2;
    public static Sprite tllog3;
    public static Sprite tllog4;

    public static Sprite stlog1;
    public static Sprite stlog2;
    public static Sprite stlog3;
    public static Sprite stlog4;
    public static Sprite stlog5;

    public static Sprite gllog1;
    public static Sprite gllog2;

    public static Sprite jelog1;
    public static Sprite jelog2;

    public static Sprite ollog;
    public static Sprite ollogED;

    public static Sprite sdlog1;
    public static Sprite sdlog2;
    public static Sprite sdlog3;

    public static Sprite wmlog1;
    public static Sprite wmlog2;

    public DialogLoader() {
        font = new Font("MeatMadness", Font.PLAIN, 48);
        // * ------------------Tutorial---------------------------- *//
        tllog1 = new Sprite("dialog/Tutorial/T1.png", 1024, 768);
        tllog2 = new Sprite("dialog/Tutorial/T2.png", 1024, 768);
        tllog3 = new Sprite("dialog/Tutorial/T3.png", 1024, 768);
        tllog4 = new Sprite("dialog/Tutorial/T4.png", 1024, 768);

        // * ------------------ Start Dialog ------------------ *//
        stlog2 = new Sprite("dialog/Buky/2.png", 561, 407);
        stlog1 = new Sprite("dialog/Buky/1.png", 561, 407);
        stlog3 = new Sprite("dialog/Buky/3.png", 561, 407);
        stlog4 = new Sprite("dialog/Buky/4.png", 561, 407);
        stlog5 = new Sprite("dialog/Buky/5.png", 561, 407);

        // * ------------------ Oldman ------------------ *//
         ollog = new Sprite("dialog/Oldman/1.png", 561, 407);
         ollogED = new Sprite("dialog/Oldman/2.png", 561, 407);

        // * ------------------ Woman ------------------ *//
        wmlog1 = new Sprite("dialog/Woman/1.png", 561, 407);
        wmlog2 = new Sprite("dialog/Woman/2.png", 561, 407);

        // * ------------------ Jester ------------------ *//
        jelog1 = new Sprite("dialog/Jester/1.png", 561, 407);
        jelog2 = new Sprite("dialog/Jester/2.png", 561, 407);

        // * ------------------ Girls ------------------ *//
        gllog1 = new Sprite("dialog/Girl/1.png", 561, 407);
        gllog2 = new Sprite("dialog/Girl/2.png", 561, 407);

        // * ------------------ Soldier ------------------ *//
        sdlog1 = new Sprite("dialog/Soldier/1.png", 561, 407);
        sdlog2 = new Sprite("dialog/Soldier/2.png", 561, 407);
        sdlog3 = new Sprite("dialog/Soldier/3.png", 561, 407);

        // * ------------------ Buffer Sprite ------------------ *//

        BufferedImage tll1 = tllog1.getSubimage(0, 0, 1024, 768);
        BufferedImage tll2 = tllog2.getSubimage(0, 0, 1024, 768);
        BufferedImage tll3 = tllog3.getSubimage(0, 0, 1024, 768);
        BufferedImage tll4 = tllog4.getSubimage(0, 0, 1024, 768);

        BufferedImage stl1 = stlog1.getSubimage(0, 0, 561, 407);
        BufferedImage stl2 = stlog2.getSubimage(0, 0, 561, 407);
        BufferedImage stl3 = stlog3.getSubimage(0, 0, 561, 407);
        BufferedImage stl4 = stlog4.getSubimage(0, 0, 561, 407);
        BufferedImage stl5 = stlog5.getSubimage(0, 0, 561, 407);

        BufferedImage gll1 = gllog1.getSubimage(0, 0, 561, 407);
        BufferedImage gll2 = gllog2.getSubimage(0, 0, 561, 407);

        BufferedImage jel1 = jelog1.getSubimage(0, 0, 561, 407);
        BufferedImage jel2 = jelog2.getSubimage(0, 0, 561, 407);

         BufferedImage oll = ollog.getSubimage(0, 0, 561, 407);
         BufferedImage ollED = ollogED.getSubimage(0, 0, 561, 407);

        BufferedImage wml1 = wmlog1.getSubimage(0, 0, 561, 407);
        BufferedImage wml2 = wmlog2.getSubimage(0, 0, 561, 407);

        BufferedImage sdl1 = sdlog1.getSubimage(0, 0, 561, 407);
        BufferedImage sdl2 = sdlog2.getSubimage(0, 0, 561, 407);
        BufferedImage sdl3 = sdlog3.getSubimage(0, 0, 561, 407);

        tl1 = new Button("", tll1, font, new Vector2f(GamePanel.width / 2, GamePanel.height / 2), 1024, 768);
        tl2 = new Button("", tll2, font, new Vector2f(GamePanel.width / 2, GamePanel.height / 2), 1024, 768);
        tl3 = new Button("", tll3, font, new Vector2f(GamePanel.width / 2, GamePanel.height / 2), 1024, 768);
        tl4 = new Button("", tll4, font, new Vector2f(GamePanel.width / 2, GamePanel.height / 2), 1024, 768);

        start1 = new Button("", stl1, font, new Vector2f(GamePanel.width / 2, GamePanel.height / 2), 561, 407);
        start2 = new Button("", stl2, font, new Vector2f(GamePanel.width / 2, GamePanel.height / 2), 561,407);
        start3 = new Button("", stl3, font, new Vector2f(GamePanel.width / 2, GamePanel.height / 2), 561,407);
        start4 = new Button("", stl4, font, new Vector2f(GamePanel.width / 2, GamePanel.height / 2), 561, 407);
        start5 = new Button("", stl5, font, new Vector2f(GamePanel.width / 2, GamePanel.height / 2), 561,407);

        ol1 = new Button("", oll, font, new Vector2f(GamePanel.width / 2, GamePanel.height / 2), 561, 407);
        ol2 = new Button("", ollED, font, new Vector2f(GamePanel.width / 2, GamePanel.height / 2), 561, 407);
       
        wm1 = new Button("", wml1, font, new Vector2f(GamePanel.width / 2, GamePanel.height / 2), 561, 407);
        wm2 = new Button("", wml2, font, new Vector2f(GamePanel.width / 2, GamePanel.height / 2), 561, 407);

        je1 = new Button("", jel1, font, new Vector2f(GamePanel.width / 2, GamePanel.height / 2), 561, 407);
        je2 = new Button("", jel2, font, new Vector2f(GamePanel.width / 2, GamePanel.height / 2), 561, 407);

        gl1 = new Button("", gll1, font, new Vector2f(GamePanel.width / 2, GamePanel.height / 2), 561, 407);
        gl2 = new Button("", gll2, font, new Vector2f(GamePanel.width / 2, GamePanel.height / 2), 561, 407);

        sd1 = new Button("", sdl1, font, new Vector2f(GamePanel.width / 2, GamePanel.height / 2), 561, 407);
        sd2 = new Button("", sdl2, font, new Vector2f(GamePanel.width / 2, GamePanel.height / 2), 561, 407);
        sd3 = new Button("", sdl3, font, new Vector2f(GamePanel.width / 2, GamePanel.height / 2), 561, 407);
    }

    // Create BufferedImage from Sprite and get subimage method using hashmap
}
