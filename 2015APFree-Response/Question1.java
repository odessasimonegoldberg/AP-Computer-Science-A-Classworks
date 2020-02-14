public class Question1 {
    
    public static int arraySum(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            
            
        }
        
        return sum;
        
    }
    
    public static int[] rowSums(int[][] arr2D){
        int[] sumArray;
        sumArray = new int[arr2D[0].length];
        for(int i = 0; i<arr2D[0].length; i++){
            int rSum = 0;
            for(int j = 0; j<arr2D.length; j++){
                rSum += arr2D[i][j];
            }
            sumArray[i] = rSum;
        
        
    }
    return sumArray;
}

public static boolean isDiverse(int[][] arr2D){
    int[] rowSums1 = rowSums(arr2D);
    for(int i = 0; i<rowSums1.length; i++){
        if(rowSums1[i] == rowSums1[i+1])
            return true;
           
    }
    return false;
    
}
    
    
    
}