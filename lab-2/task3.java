

class task3 {

    static int i = 2;
    public static boolean isPrime(int n)
    {

        if (n == 0 || n == 1) {
            return false;
        }

        if (n == i)
            return true;

        // Base cases
        if (n % i == 0) {
            return false;
        }
        i++;
        return isPrime(n);
    }

    // Driver Code
    public static void main(String[] args)
    {
        if (isPrime(35)) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}

