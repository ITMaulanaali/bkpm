import java.util.Random;

class testing{
    static int[] angkaRandom;
    static Random nilaiRandom;
    
    public static void main(String[] args){
        angkaRandom = new int[15];
        nilaiRandom = new Random();
        
        for(int i=0; i<angkaRandom.length; i++){
            angkaRandom[i] = nilaiRandom.nextInt(50);
            System.out.println(angkaRandom[i]);
        }
    }
}
