public class Main {
    
    static Scanner input;
    static String namaPembeli;
    static int totalBarang;
    
    public static void main(String[] args){
        System.out.println("---------------------------------------");
        System.out.println("Kharisma Agung Plaza < KAP >");
        System.out.println("Khusus pembelian 5 barang pertama");
        System.out.println("Dengan harga minimum RP 10000.00");
        System.out.println("---------------------------------------");
        
        input = new Scanner(System.in);
        
        System.out.print("Masukkan nama pembeli: ");
        namaPembeli = input.nextLine();
        System.out.println();
        
        for(int i=1; i<=5; i++){
            System.out.print("Masukan harga barang ke-"+i+": ");
            totalBarang += input.nextInt();
//            System.out.println();
        }
        
        System.out.println("Total harga pembelian atas nama " + namaPembeli + " adalah Rp " + totalBarang);
        System.out.println();
        
        if(totalBarang >= 10000){
            System.out.println("Selamat");
            System.out.println("Anda mendapatkan hadiah 1 buag mug cantik");
            System.out.println();
        }
        
        System.out.println("---------------------------------------");
        System.out.println("Terimakasih");
        System.out.println("Anda sudah berbelanja di kharisma agung plaza");
        
    }
}
