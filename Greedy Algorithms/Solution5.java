public class Solution5 {
    public static int ans = 10000000;
    public static void solve(int a[], int n, int k, int index, int sum, int maxsum) {
        if(k == 1) {
            maxsum = Math.max(maxsum, sum);
            sum = 0;
            for(int i = index; i < n; i++) {
                sum += a[i];
            }
            maxsum = Math.max(maxsum, sum);
            ans = Math.min(ans, maxsum);
            return;
        }
        sum = 0;
        for(int i = index; i< n; i++) {
            sum += a[i];
            maxsum = Math.max(maxsum, sum);
            solve(a, n, k-1, i+1, sum, maxsum);
        }
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4};
        int k = 3; // k division
        int n = 4; // Size of array
        solve(arr, n, k, 0, 0, 0);
        System.out.println(ans + "\n");
    }
}
// Time Complexity : O(N-1)c(K-1)
// c combination (n-1)!/(n-k)!*(k-1)!