public class mydog {
    public static void main(String[] args) 
    {
        dog mydog = new dog("white");
        mydog.setWeight(15.5);
     
        System.out.println("the color of my dog is "+ mydog.getColor());
        System.out.println("the weight of my dog is "+ mydog.getWeight());
    }
}