class Main{
    static int[] arr = {100, 50, 20, 43, 75, 89, 40, 60, 18, 90, 30};
    static int index;
    
    public static void main(String[] args){
        // Tampilkan sebelum Selection Sort
        System.out.println("Sebelum Selection Sort:");
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
        
        // Selection Sort
        for(int i = 0; i < arr.length - 1; i++){
            index = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[index]){
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        
        // Tampilkan setelah Selection Sort
        System.out.println("Setelah Selection Sort:");
        for(int i : arr){
            System.out.print(i + " ");
        }
    }   
}
