import java.awt.*;

public class Palette {
    private Color[] colors;

    public Palette(Color[] colors) {
        this.colors = colors;
    }

    public Color getPlusProche(Color color, NormeCouleurs norme) {
        Color closestColor = null;
        double minDistance = Double.MAX_VALUE;

        for (Color c : colors) {
            double distance = norme.distanceCouleur(color, c);

            if (distance < minDistance) {
                minDistance = distance;
                closestColor = c;
            }
        }

        return closestColor;
    }
}