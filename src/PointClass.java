


abstract class PointClass{
    int x;
    int y;

    PointClass (int x, int y) {
        this.x = x;
        this.y = y;
    }

    abstract public String toString();

    public boolean equals(Object other){
        return other instanceof Point && ((Point) other).x == this.x && ((Point) other).y == this.y;
    }
    public int hashCode() {
        int result = 17;
        result = result * 31 + x;
        result = result * 31 + y;
        return result;
    }

    public static boolean adjacent(Point p1, Point p2) {
        return (p1.x == p2.x && Math.abs(p1.y - p2.y) == 1) || (p1.y == p2.y && Math.abs(p1.x - p2.x) == 1);
    }

    public static int distanceSquared(Point p1, Point p2) {
        int deltaX = p1.x - p2.x;
        int deltaY = p1.y - p2.y;

        return deltaX * deltaX + deltaY * deltaY;
    }
}