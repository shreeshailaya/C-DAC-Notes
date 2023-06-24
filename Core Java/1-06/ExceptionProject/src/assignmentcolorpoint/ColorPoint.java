package assignmentcolorpoint;

import java.util.Arrays;
import java.util.List;

public class ColorPoint {
	private static List<String> Colors=Arrays.asList("Red","Black,Blue");
	private String color;
	
	public ColorPoint(String color) throws InvalidColorException {
		if (!Colors.contains(color)) {
            throw new InvalidColorException("Invalid color: " + color);
        }
        this.color = color;
    }

    public String getColor() {
        return color;
    }
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            ColorPoint point = new ColorPoint("YELLOW");
            System.out.println("Color: " + point.getColor());
        } catch (InvalidColorException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

	}

}
