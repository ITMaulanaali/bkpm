class testing{
    static int nilai = 0;
    
    public static void main(String[] args){
        do{
            if(nilai>=2){
                System.out.println(nilai);
                nilai *= 2;
            }else{
                nilai += 1;
                System.out.println(nilai);
            }
        }while(nilai>0 && nilai<100);
    }
}
