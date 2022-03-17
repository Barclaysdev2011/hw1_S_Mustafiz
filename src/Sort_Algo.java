public class Sort_Algo {
    public static void main(String[]args){
        int [] arr = selectionSort();
    }



    static int [] selectionSort(){
        int temp,j;
        int i=0;
        int [] numbers ={10 ,20 ,6, 14, 7};

        for(i=0;i<numbers.length;i++){
            j=i;
            while (j>0 && numbers[j] < numbers[j-1]){
                temp = numbers[j];
                numbers[j]=numbers[j-1];
                numbers[j-1]=temp;
                --j;
            }

        }

        return numbers;
    }
}
