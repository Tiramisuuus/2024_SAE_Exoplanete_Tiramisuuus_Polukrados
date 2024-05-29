import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ChargeImage {

    public void processImage(String path) {
        try {
            String chemin = "src/assets/" + path;
            File inputfile = new File(chemin);
            BufferedImage originalImage = ImageIO.read(inputfile);

            BufferedImage newImage = new BufferedImage(originalImage.getWidth(), originalImage.getHeight(), BufferedImage.TYPE_3BYTE_BGR);

            for (int y = 0; y < originalImage.getHeight(); y++) {
                for (int x = 0; x < originalImage.getWidth(); x++) {
                    int rgb = originalImage.getRGB(x, y);
                    newImage.setRGB(x, y, rgb);
                }
            }

            File outputfile = new File("src/assets/" + path + "_copiePixel.png");
            ImageIO.write(newImage, "png", outputfile);

            System.out.println("Image sauvegardée");
        } catch (IOException e) {
            System.out.println("Erreur lors de la sauvegarde de l'image");
        }
    }
}