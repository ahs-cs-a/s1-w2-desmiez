public class BodyOfWater{
    //name, largestDiameter, avgDepth, isSaltWater
    private String name;
    private int largestDiameter;
    private double avgDepth;
    private boolean isSaltWater;

    //4 parameter constructor that allows all attributes to be set
    public BodyOfWater(String n, int l, double a, boolean s){
        name = n;
        largestDiameter = l;
        avgDepth = a;
        isSaltWater = s;
    }

    //2 parameter constructor that sets name and avgDepth
    public BodyOfWater(String n, double a){
        name = n;
        avgDepth = a;
    }

    //Getter method for each
    public String name(){
        return name;
    }

    public int largestDiameter(){
        return largestDiameter;
    }

    public double avgDepth(){
        return avgDepth;
    }

    public boolean isSaltWater(){
        return isSaltWater; 
    }
    //Set method for name and largestDiameter
    public void setName(String n){
        name = ("Lake");
    }

    public void setlargestDiameter(int l){
        largestDiameter = 500;
    }
    //Make 2 instances of the BodyOfWater using each constructor





}
