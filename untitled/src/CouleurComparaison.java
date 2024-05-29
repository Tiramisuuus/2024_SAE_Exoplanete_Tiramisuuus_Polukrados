import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class CouleurComparaison {

    public void compareColors(String nomFichier, Palette palette) {
        try {
            String nomFichier1 = nomFichier.substring(0, nomFichier.lastIndexOf("."));
            String chemin = "src/assets/" + nomFichier;
            File inputfile = new File(chemin);
            BufferedImage originalImage = ImageIO.read(inputfile);

            BufferedImage newImage = new BufferedImage(originalImage.getWidth(), originalImage.getHeight(), BufferedImage.TYPE_3BYTE_BGR);

            for (int y = 0; y < originalImage.getHeight(); y++) {
                for (int x = 0; x < originalImage.getWidth(); x++) {
                    int rgb = originalImage.getRGB(x, y);
                    Color originalColor = new Color(rgb);
                    Color closestColor = palette.getPlusProche(originalColor);
                    newImage.setRGB(x, y, closestColor.getRGB());
                }
            }

            File outputfile = new File("src/assets/" + nomFichier1 + "_compared.png");
            ImageIO.write(newImage, "png", outputfile);

            System.out.println("Image sauvegardée");
        } catch (IOException e) {
            System.out.println("Erreur lors de la sauvegarde de l'image");
        }
    }
}