public class newarea {
    public static void main(String[] args)
    {
         area squ = new area(5 ,5);
         area non = new area(8 ,5);

         System.out.println("square 5 x 5");
         System.out.println("Area: "+squ.getarea());
         System.out.println("Perimeter "+squ.getper());
         System.out.println("\nnonsquare 8 x 5");
         System.out.println("Area: "+non.getarea());
         System.out.println("Perimeter "+non.getper());
    }
    
}
