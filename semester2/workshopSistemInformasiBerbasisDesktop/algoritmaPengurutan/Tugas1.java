class Main{
    static int[] arr = {100,50,20,43,75,89,40,60,18,90,30,};
    static int indexSebelumnya;
    static int indexSetelahnya;
    
    public static void main(String[] args){
        //tampilkan sebelum bubbleshort
        for(int i : arr){
            System.out.print(i + " ");
        }
        
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-1; j++){
                if(arr[j]>arr[j+1]){
                    indexSebelumnya = arr[j];
                    indexSetelahnya = arr[j+1];
                    arr[j] = indexSetelahnya;
                    arr[j+1] = indexSebelumnya;
                }
            }
        }
        
        System.out.println();
        //tampilkan setelah bubbleshort
        for(int i : arr){
            System.out.print(i + " ");
        }
    }   
}

/*
Algoritma bubble short yang membandingkan jika nilai di index pertama lebih besar dari index setelahnya atau kedua maka pindah posisi begitu seterusnya sebanyak kali berapa panjang elementnya arraynya
*/
