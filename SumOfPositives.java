public class SumOfPositives {
    public static void main(String[] args) {
        int[] arr1 = { -5, 246, -5, 412, -5, 110 };
        int sumofnegatives = 0;
        int sumofpositives = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i]<0){
                sumofnegatives = sumofnegatives + arr1[i];
            }
            else{
                sumofpositives = sumofpositives + arr1[i];
            }
        }
        System.out.println("The sum of negatives values is: "+sumofnegatives);
        System.out.println("The sum of positives values is: "+sumofpositives);
    }
}
