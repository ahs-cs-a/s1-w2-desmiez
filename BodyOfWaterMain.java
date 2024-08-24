public class BodyOfWaterMain {
    public static void main(String[] args) {
        BodyOfWater b = new BodyOfWater("Lake M", 500, 30.5, false);
        BodyOfWater b1 = new BodyOfWater("Lake N", 200, 15.5, true);
        
        //Print out each attribute using the getter on each instance//
        System.out.println(b.getName());
        System.out.println(b1.getName());
        
        //On one instance call the setName method//
        b.setname("Lake K");
        System.out.println(b.getname());
    }

}
