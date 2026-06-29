public class Box {

    private double length, width, height;

    public Box(double length,double width,double height){
        setDimensions(length,width,height);
    }

    public void setDimensions(double length,double width,double height){
        this.length=length;
        this.width=width;
        this.height=height;
    }

    public double calculateVolume(){
        return length*height*width;
    }
    public static void main(String[] args) {
        Box box = new Box(10, 5, 3);
        System.out.println("Volume: " + box.calculateVolume());
        box.setDimensions(15, 7, 4);
        System.out.println("Modified Volume: " + box.calculateVolume());
    }
}