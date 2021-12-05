public class w1lab3 {
    
    public static void main(String[] args) {
        System.out.println("  0  1  2  3  4  5  6  7  8  9");
        String str = "";
        for(int i = 0; i <=9; i++){
        str = i + " ";
        for(int j =0; j <= 9; j++){
        if((i*j)<10){
            str += (i * j) + "  ";
        }
        else {
            str += (i * j) +" ";
        }
    }System.out.println(str);}
    }

    
    
    

}
