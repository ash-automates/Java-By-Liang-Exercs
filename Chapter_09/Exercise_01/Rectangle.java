
public class Rectangle {
	double width;
	double height;

	public Rectangle() {
		width = 1;
		height = 1;
	}

	public Rectangle(double w, double h) {
		width = w;
		height = h;
	}

	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle(4, 40);
		Rectangle rect2 = new Rectangle(3.5, 35.9);
		System.out.printf("Rectangle 1: width %g height %g area %g perimeter %g\n", rect1.width, rect1.height,
				rect1.getArea(), rect1.getPerimeter());
		System.out.printf("Rectangle 2: width %g height %g area %g perimeter %g\n", rect2.width, rect2.height,
				rect2.getArea(), rect2.getPerimeter());
	}

	double getArea() {
		return width * height;
	}

	double getPerimeter() {
		return width * 2 + height * 2;
	}
}
