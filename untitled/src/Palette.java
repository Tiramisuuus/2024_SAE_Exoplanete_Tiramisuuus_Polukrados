import java.awt.*;

public class Palette {
    private Color[] colors;

    public Palette(Color[] colors) {
        this.colors = colors;
    }

    public Color getPlusProche(Color color) {
        Color closestColor = null;
        double minDistance = Double.MAX_VALUE;

        for (Color c : colors) {
            double distance = Math.pow(color.getRed() - c.getRed(), 2) +
                    Math.pow(color.getGreen() - c.getGreen(), 2) +
                    Math.pow(color.getBlue() - c.getBlue(), 2);

            if (distance < minDistance) {
                minDistance = distance;
                closestColor = c;
            }
        }

        return closestColor;
    }
}