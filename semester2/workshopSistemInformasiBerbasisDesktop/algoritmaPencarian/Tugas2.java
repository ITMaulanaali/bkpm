import java.util.Scanner;

class testing{
    static int cari = -1;
    static int[] kumpulanDatum = {20,40,38,67,12,11,17,55,46,74};
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args){
        
        System.out.println("Silahkan cari pada rentang nilai ini: ");
        System.out.println("20,40,38,67,12,11,17,55,46,74");
        
        //mengurutkan terlebih dahulu dari terbesar ke terkecil dengan algoritma selection short
        for(int i=0; i<kumpulanDatum.length-1; i++){
            int index=i;
            for(int j=(i+1); j<kumpulanDatum.length; j++){
                if(kumpulanDatum[i] < kumpulanDatum[j]){
                    index = j;
                }
            }
            int temp = kumpulanDatum[i];
            kumpulanDatum[i] = kumpulanDatum[index];
            kumpulanDatum[index] = temp;
        }
        
        System.out.print("Masukkan pencarian: ");
        cari = input.nextInt();
        
        int totalIndex = kumpulanDatum.length;
        int indexTengah;
        for(int i=0; i<kumpulanDatum.length; i++){
            indexTengah = totalIndex / 2;
            
            if(cari > kumpulanDatum[indexTengah]){
                totalIndex = indexTengah / 2;
            }else{
                for(int j=indexTengah; j<kumpulanDatum.length; j++){
                    if(cari == kumpulanDatum[j]){
                        System.out.println("Nilai yang anda cari tersedia di index " + j + "yaitu index yang sudah diurutkan dengan algoritma selection short dari yang terbesar ke kecil dengan nilai: " + kumpulanDatum[j]);
                        break;
                    }
                }
                break;
            }
        }
    }
}

/*
1. menyiampakan data collection sebanyak 9 element random
2. diurutkan dengan algoritma selection short untuk nilai terbesar ke terkecil
3. melakukan pencarian dengan binary search yaitu selalu di bagi 2 total index jika nilai cari masih lebih besar dari nilai tengah index
4. mencari satu persatu ke kanan jika nilai tengah total index sudah lebih kecil dari
5. mendapatkan nilai dan dicetak
6. menghentikan iterasi pencarian (break)
*/
