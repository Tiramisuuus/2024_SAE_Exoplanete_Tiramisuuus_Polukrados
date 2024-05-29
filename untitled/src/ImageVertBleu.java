import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageVertBleu {

    public void processImage(String nomFichier) {
        try {
            String nomFichier1 = nomFichier.substring(0, nomFichier.lastIndexOf("."));
            String chemin = "src/assets/" + nomFichier;
            File inputfile = new File(chemin);
            BufferedImage originalImage = ImageIO.read(inputfile);

            BufferedImage newImage = new BufferedImage(originalImage.getWidth(), originalImage.getHeight(), BufferedImage.TYPE_3BYTE_BGR);

            for (int y = 0; y < originalImage.getHeight(); y++) {
                for (int x = 0; x < originalImage.getWidth(); x++) {
                    int rgb = originalImage.getRGB(x, y);
                    int vertBleu = rgb & 0xffff;
                    newImage.setRGB(x, y, vertBleu);
                }
            }

            File outputfile = new File("src/assets/" + nomFichier1 + "_copieVertBleu.png");
            ImageIO.write(newImage, "png", outputfile);

            System.out.println("Image sauvegardée");
        } catch (IOException e) {
            System.out.println("Erreur lors de la sauvegarde de l'image");
        }
    }
}