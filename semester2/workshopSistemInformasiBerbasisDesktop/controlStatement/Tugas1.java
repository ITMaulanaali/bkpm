import java.util.Scanner;

class Main{
    static Scanner input;
    static int batasAwal;
    static int batasAkhir;
    static int bilanganGenap = 1;
    
    public static void main(String[] args){
        input = new Scanner(System.in);
      
        System.out.println("Program untuk menampilkan hanya bilangan genap dengan batas yang ditentukan");
        System.out.println();
        
        while(bilanganGenap!=0){
            System.out.print("Masukkan bilangan awal: ");
            batasAwal = input.nextInt();
        
            bilanganGenap = batasAwal;
            while(bilanganGenap>2){
                bilanganGenap = bilanganGenap % 2;
            }
            
            if(bilanganGenap!=0){
                System.out.println("pastikan awal urutan adalah bilangan genap");
            }
        }
        
        bilanganGenap = 1;
        while(bilanganGenap != 0){
            System.out.print("Masukkan bilangan akhir: ");
            batasAkhir = input.nextInt();
        
            bilanganGenap = batasAkhir;
            while(bilanganGenap>2){
                bilanganGenap = bilanganGenap % 2;
            }
            
            if(bilanganGenap!=0){
                System.out.println("pastikan akhir urutan adalah bilangan genap");
            }
        }
        
        for(int i=batasAwal; i<=batasAkhir; i+=2){
            System.out.println(i);
        }
    }
}
