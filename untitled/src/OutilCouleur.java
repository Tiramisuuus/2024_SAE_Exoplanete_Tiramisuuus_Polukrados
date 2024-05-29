public class OutilCouleur {
    public static int[] getTabColor(int color) {
        int blue = color & 0xff;
        int green = (color & 0xff00) >> 8;
        int red = (color & 0xff0000) >> 16;

        return new int[]{red, green, blue};
    }
}