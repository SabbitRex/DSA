# https://practice.geeksforgeeks.org/problems/minimum-platforms-1587115620/1/

class Minimum_Platforms {
    
    static int findPlatform(int arr[], int dep[], int n) {
       
       Arrays.sort(arr);
       Arrays.sort(dep);
       
       int globalMaxPlatform = 1;
       
       int localMaxPlatform = 1;
       
       // arrivalIdx is 1 because 1st train has already arrived, so check from 2nd arrival
       int arrivalIdx = 1;
       int departIdx = 0;
       
       while (arrivalIdx < n && departIdx < n) {
           
           int nextArrivalTime = arr[arrivalIdx];
           
           int currentDepartTime = dep[departIdx];
           
           if (nextArrivalTime > currentDepartTime) {
               
               localMaxPlatform--;
               departIdx++;
               
           } else if (nextArrivalTime <= currentDepartTime) {
               
               localMaxPlatform++;
               arrivalIdx++;
           }
           
           globalMaxPlatform = Math.max(localMaxPlatform, globalMaxPlatform);
       }
       
       return globalMaxPlatform;
    }
}
