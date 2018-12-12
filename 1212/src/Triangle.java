class Shape{
	String color="gold"; //공통속성
	void draw() {
		System.out.println("그리다"); //공통기능
	}
}

class Point{ //점과 좌표
	int x;
	int y;

	Point(){
		//this.x = 1;
		//this.y = 2;
		this(1,2);
	}
	Point(int x , int y){
		this.x = x;
		this.y = y;
	}
}

public class Triangle extends Shape{
    private Point[] pointarray; 
    public Triangle() {
        
        this(new Point[]{new Point(1,2),new Point(3,4),new Point(5,6)});
    }
    public Triangle(Point[] pointarray) {
        this.pointarray = pointarray;
    }
    public void triangePoint() {
        for(Point point : pointarray) {
            System.out.println("좌표: " + point.x + "," + point.y);
        }
    }
}
