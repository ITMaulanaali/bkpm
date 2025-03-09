public class acara8Dan8{
    static int pilihan;
    static String namaPembeli;
    static Scanner input;
    
    public static void main(String[] args){
        
        input = new Scanner(System.in);
        
        System.out.println("CAFE CERIA");
        System.out.println("ANEKA MINUMAN");
        System.out.println("---------------------------------------");
        
        System.out.println("SPECIAL MENU :");
        System.out.println("1.  Soft Drinks");
        System.out.println("2.  Mix Juice");
        System.out.println("3.  Nescafe");
        System.out.println("4.  Soda Milk");
        System.out.println("5.  Tea");
        
        System.out.println("---------------------------------------");
        System.out.print("Masukkan nama pembeli : ");
        namaPembeli = input.nextLine();
        System.out.println();
        
        System.out.print("Silahkan masukkan pilihan anda: ");
        pilihan = input.nextInt();
        
        switch(pilihan){
            case 1:
                System.out.println("Minuman yang anda pesan adalah Soft Drinks");
                break;
            case 2:
                System.out.println("Minuman yang anda pesan adalah Mix Juice");
                break;
            case 3:
                System.out.println("Minuman yang anda pesan adalah Nescafe");
                break;
            case 4:
                System.out.println("Minuman yang anda pesan adalah Soda Milk");
                break;
            case 5:
                System.out.println("Minuman yang anda pesan adalah Tea");
                break;
            default:
                
        }
        
        System.out.println("Pesanan akan segera kami antar");
        System.out.println("Terimakasih "+namaPembeli+" telah berkunjung di cafe ceria");
    }
}
