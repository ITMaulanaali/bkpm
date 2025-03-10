import java.util.Scanner;

class testing{
    static int cari = -1;
    static int[] kumpulanDatum = {20,40,38,67,12,11,17,55,46,74};
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args){
        
        System.out.println("Silahkan cari pada rentang nilai ini: ");
        System.out.println("20,40,38,67,12,11,17,55,46,74");
        System.out.println();
        
        System.out.print("Masukkan pencarian: ");
        cari = input.nextInt();
        
        int index = -1;
        
        for(int i=0; i<kumpulanDatum.length; i++){
            if(cari == kumpulanDatum[i]){
                index = i;
                break;
            }
        }
        
        if(index > -1){
            System.out.println("Nilai yang anda cari ada di index: " + index + " Dengan nilai: " + kumpulanDatum[index]);
        }else{
            System.out.println("Nilai yang anda cari tidak ada di rentang tersebut");
        }
    }
}
