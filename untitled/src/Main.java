import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //ManipImage manipImage = new ManipImage();
        //manipImage.sauvegarderImage("R.png");

        //ChargeImage imageProcessor = new ChargeImage();
        //imageProcessor.processImage("R.png");

        //ImageNoirEtBlanc imageNoirEtBlanc = new ImageNoirEtBlanc();
        //imageNoirEtBlanc.processImage("R.png");

        //ImageRouge imageRouge = new ImageRouge();
        //imageRouge.processImage("R.png");

        //ImageVertBleu imageVertBleu = new ImageVertBleu();
        //imageVertBleu.processImage("R.png");

//        Color[] colors = {Color.GREEN, Color.YELLOW, Color.RED, Color.BLUE, Color.ORANGE};
//        Palette palette = new Palette(colors);
//        CouleurComparaison imageColorComparaison = new CouleurComparaison();
//        imageColorComparaison.compareColors("R.png", palette);

        Color[] colors = {Color.GREEN, Color.YELLOW, Color.RED, Color.BLUE, Color.ORANGE};
        Palette palette = new Palette(colors);
        NormeRedmean normeRedmean = new NormeRedmean();
        CouleurComparaison imageColorComparaison = new CouleurComparaison();
        imageColorComparaison.compareColors("R.png", palette, normeRedmean);
    }
}