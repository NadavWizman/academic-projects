import java.util.Scanner;

public class Segment {
    private Point first, second;

    public Segment() {
        this.first = new Point(1, 1);
        this.second = new Point(0, 0);
    }

    public Segment(float a, float b, float c, float d) {
        this.first = new Point(a, b);
        this.second = new Point(c, d);
    }

    public Segment(float a, float b) {
        this.first = new Point(0, 0);
        this.second = new Point(a, b);
    }

    public Segment(Point a, Point b) {
        this.first = a;
        this.second = b;
    }
    
    public Segment(float a, float b, Point c) {
        this.first = new Point(a, b);
        this.second = c;
    }
    
    public Segment(Point c, float a, float b) {
    	this.first = new Point(a, b);
        this.second = c;
    }

	public Segment(Segment a) {
		this.first = a.first;
		this.second = a.second;
	}
	
	public void show() {
        System.out.print("Segment: ");
        this.first.show();
        System.out.print(", ");
        this.second.show();
        System.out.println();
	}
	public void readSegment() {
        Scanner myInput = new Scanner(System.in);

        System.out.println("Enter coordinates for the first point:");
        float x1 = myInput.nextFloat();
        float y1 = myInput.nextFloat();
        this.first = new Point(x1, y1);

        System.out.println("Enter coordinates for the second point:");
        float x2 = myInput.nextFloat();
        float y2 = myInput.nextFloat();
        this.second = new Point(x2, y2);

	}
	public Point middle() {
        float x1 = (first.getX() + second.getX()) / 2;
        float y1 = (first.getY() + second.getY()) / 2;
        Point middle = new Point(x1, y1);
        return middle;
    }
	
	public float length() {
        float xDiff = first.getX() - second.getX();
        float yDiff = first.getY() - second.getY();
        return (float) Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }
	
	public boolean greaterThan(Segment other) {
		return this.length() > other.length();
    }
	
	public boolean lessThan(Segment other) {
		return this.length() < other.length();
    }
	
	public float compareTo(Segment other) {
		if(this.greaterThan(other))
			return 1;
		else if(this.lessThan(other))
			return -1;
		else
			return 0;
		
	}

}