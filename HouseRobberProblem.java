public class HouseRobberProblem {

    public static int stealing(int[] arr,int index) {
        if(index>=arr.length){
            return 0;
        }
        int include = arr[index] + stealing(arr,index+2);
        int exclude = 0 + stealing(arr,index+1);

        int maxVal = Math.max(include, exclude);
        return maxVal;
        
    }

    public static void main(String[] args) {
        int[] arr = { 2, 7, 9, 3, 1 };
        int index = 0;
        int result = stealing(arr,index);

        System.out.println(result);

    }
}
