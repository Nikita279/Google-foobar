class Solution
{
    public static String solution(int i) {
        String primeString = createPrimeString(i+4);
        return primeString.substring(i, i+5);
    }
    
    public static String createPrimeString(int len) {
        StringBuilder sb = new StringBuilder();
        String primeString = "";
        
        int j=2;
        while(true) {
            if(primeString.length() > len) {
                break;
            }
            if(isPrime(j)) {
                sb.append(j);
                primeString = sb.toString();
            }
            j++;
        }
        return primeString;
    }
    
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
 
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
 
        return true;
    }
}
