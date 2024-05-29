import javax.imageio.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ManipImage {
    public ManipImage(){

    }

    public void sauvegarderImage(String path){
        try{
            String chemin = "src/assets/" + path;
            File inputfile = new File(chemin);
            BufferedImage img1 = ImageIO.read(inputfile);
            File outputfile = new File("src/assets/" + path +"copie.png");

            ImageIO.write(img1, "png", outputfile);

            System.out.println("Image sauvegardée");
        }catch(Exception e){
            System.out.println("Erreur lors de la sauvegarde de l'image");
        }
    }

}
