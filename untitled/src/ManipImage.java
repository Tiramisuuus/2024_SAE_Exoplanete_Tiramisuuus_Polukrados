import javax.imageio.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ManipImage {

    public ManipImage() {

    }

    public void sauvegarderImage(String nomFichier) {
        try {
            String nomFichier1 = nomFichier.substring(0, nomFichier.lastIndexOf("."));
            String chemin = "src/assets/" + nomFichier;
            File inputfile = new File(chemin);
            BufferedImage img1 = ImageIO.read(inputfile);
            File outputfile = new File("src/assets/" + nomFichier1 + "_copie.png");
            ImageIO.write(img1, "png", outputfile);

        } catch (Exception e) {
            System.out.println("Erreur lors de la sauvegarde de l'image");
        }
    }

}
