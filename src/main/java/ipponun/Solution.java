package ipponun;

/**
 * Created by julien on 27/03/2016.
 */
public class Solution {

    public static class Point implements Provided.PointItf {
        private int x;
        private int y;
        public Point (int x1, int y1) {
            x = x1;
            y = y1;
        }

        public Point() {

        }

        @Override
        public int getX() {
            return x;
        }

        @Override
        public int getY() {
            return y;
        }

        @Override
        public double distance(Provided.PointItf p) {
            return Math.sqrt((p.getX() - getX())*(p.getX() - getX()) + (p.getY() - getY())*(p.getY() - getY())) ;
        }
    }

    public static class ColoredPoint extends Point implements Provided.Colored {
        String color ="";

        public ColoredPoint (int x, int y, String color1) {
            super(x,y);
            color=color1;
        }

        @Override
        public String getColor() {
            return color;
        }
    }
}
