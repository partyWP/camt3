
public class mycar {
    public static void main(String[] args) 
    {
        w2lab3 toyota = new w2lab3("red");
        w2lab3 honda = new w2lab3("blue");
        toyota.setSpeed(200);
        toyota.setMilage(1345);
        honda.setSpeed(300);
        honda.setMilage(8987);
        System.out.println("Toyota color "+ toyota.getColor()+" speed: "+ toyota.getSpeed() +" mileage: "+toyota.getMilage());
        System.out.println("Honda color "+ honda.getColor()+" speed: "+ honda.getSpeed()+" mileage: "+ honda.getMilage());

                       



    }
}
