import java.awt.Color;

public class NormeRedmean implements NormeCouleurs {
    @Override
    public double distanceCouleur(Color c1, Color c2) {
        double rMean = (c1.getRed() + c2.getRed()) / 2.0;
        double deltaR = c1.getRed() - c2.getRed();
        double deltaG = c1.getGreen() - c2.getGreen();
        double deltaB = c1.getBlue() - c2.getBlue();
        return Math.sqrt((2 + rMean / 256) * deltaR * deltaR + 4 * deltaG * deltaG + (2 + (255 - rMean) / 256) * deltaB * deltaB);
    }
}