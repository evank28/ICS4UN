public class EvanKanter_A51
{
 public static void main (String[] args)
 {
     Point p = new Point3D(1,2,3);
     System.out.println(p.getX());
 }
}

class Point {
    private int x;
    private int y;
    public Point (int newX, int newY) {
    x = newX;
    y = newY;
    }
    public int getX()
    { return x; }
    public int getY()
    { return y; }
/*	public void setX(int x) {           // this is all added
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }*/
    
}

class Point3D extends Point{
    private int z;
    public Point3D(int x, int y, int z) {
        super(x, y);
        z = this.z;
    }

    public int getZ() {
        return this.z;
    }
/*
    public void setZ(int z) {
        this.z = z;
    }*/



}