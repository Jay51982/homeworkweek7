package homeworkweek7;

public class Program15 {
    double width, height;

    public Program15(double width, double height) {
        if (width < 0) {
            this.width = 0;
            return;
        }
        if (height < 0) {
            this.height = 0;
            return;
        }
        this.width = width;
        this.height = height;
    }

    // getWidth
    public double getWidth() {
        return this.width;
    }
    // getHeight
    public double getHeight() {
        return this.height;
    }
    // setWidth
    public void setWidth(double updatedWidth) {
        if (updatedWidth < 0){
            this.width = 0;
        }
        this.width = updatedWidth;
        return;
    }
    // setHeight
    public void setHeight(double updatedHeight) {
        if (updatedHeight < 0){
            this.height = 0;
            return;
        }
        this.height = updatedHeight;
    }

    public double getArea(){
        return this.height * this.width;
    }

    public static void main(String[] args) {
        Program15 wall = new Program15(5,4);

        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);

        System.out.println("width = " + wall.getWidth());
        System.out.println("height = " + wall.getHeight());
        System.out.println("area = " + wall.getArea());

    }

}