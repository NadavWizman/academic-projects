
public class Point {
    private float x, y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }
    
    public void show() {
		System.out.print("(" + this.x + "," + this.y + ")");
	}
   
    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
}