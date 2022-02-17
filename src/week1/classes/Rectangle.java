package week1.classes;

public class Rectangle {
    private int width = 1;
    private int height = 1;
    private String color = "Blue";

    public Rectangle() {
    }

    public Rectangle(int width, int height, String color) {
        setWidth(width);
        setHeight(height);
        setColor(color);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public void setWidth(int width) {
        if(width < 1)
        {
            this.width = 1;
            return;
        }
        this.width = width;
    }

    public void setHeight(int height) {
        if(height < 1)
        {
            this.height = 1;
            return;
        }
        this.height = height;
    }

    public void setColor(String color) {
        if( color.length() < 3 || 20 < color.length() )
            return;

        if( !Character.isUpperCase(color.charAt(0)))
            return;

        this.color = color;
    }

    public void draw(){
        for (int row = 0; row < height; ++row)
        {
            for(int col = 0; col < width; ++col)
            {
                System.out.print(color.charAt(0));
            }
            System.out.print("\n");
        }
    }
}
