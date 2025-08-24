class loops{
    public static void main(String[] args) {
        
        for(int i=1; i<=5; i++){
            System.out.println(i);
        }

        int number = 5;
        int multiplier = 1;
        while(multiplier <= 10){
            System.out.println(number * multiplier);
            multiplier++;
        }

        do{
            System.out.println(number * multiplier);
            multiplier++;
        }while(multiplier <= 10);
    }
}