public class task4 {
    public static void main(String[] args) {
        int account_no[] = { 1023, 1224, 2500 };
        int balance[] = { 85000, 38500, 69000 };
        System.out.println("Original array is:");
        display(account_no, balance);

        System.out.println("Sorting array using bubble sort algorithm:");
        bubbleSort(balance, account_no);
        display(account_no, balance);

        System.out.println("Sorting array using selection sort algorithm:");
        selectionSort(balance, account_no);
        display(account_no, balance);

        System.out.println("Sorting array using insertion sort algorithm:");
        insertionSort(balance, account_no);
        display(account_no, balance);

    }

    static void display(int account_no[], int balance[]) {
        int size = balance.length;
        for (int i = 0; i < size; i++) {
            System.out.println("Account No." + account_no[i] + " : Balance " + balance[i]);
        }
        System.out.println();
    }

    static void bubbleSort(int balance[], int account_no[]) {
        int size = balance.length, temp;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (balance[j] < balance[j + 1]) {
                    temp = balance[j];
                    balance[j] = balance[j + 1];
                    balance[j + 1] = temp;
                    temp = account_no[j];
                    account_no[j] = account_no[j + 1];
                    account_no[j + 1] = temp;
                }
            }
        }
    }

    static void selectionSort(int balance[], int account_no[]) {
        int size = balance.length;
        int temp;
        for (int i = 0; i < size; i++) {
            int min = i;
            for (int j = i + 1; j < size; j++) {
                if (balance[j] > balance[min]) {
                    min = j;
                    temp = balance[i];
                    balance[i] = balance[min];
                    balance[min] = temp;
                    temp = account_no[i];
                    account_no[i] = account_no[min];
                    account_no[min] = temp;
                }
            }
        }
    }

    static void insertionSort(int balance[], int account_no[]) {
        int size = balance.length;
        for (int i = 1; i < size; i++) {
            int keyBalance = balance[i];
            int keyAccountNo = account_no[i];
            int j = i - 1;
            while (j >= 0 && balance[j] < keyBalance) {
                balance[j + 1] = balance[j];
                account_no[j + 1] = account_no[j];
                j--;
            }
            balance[j + 1] = keyBalance;
            account_no[j + 1] = keyAccountNo;
        }
    }
}
