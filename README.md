# Lab-01
## Task 1
## Description: Returning the minimal value of an array
## Explanation: Base case: n = 1, then we return the first element of the array and compare it with arr[n-1], and by recursive function we return the lesser element by the way determine minimal value
## Solution:
```

    private static int findMin(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty.");
        }
        int minVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minVal) {
                minVal = arr[i];
            }
        }
        return minVal;
    }
}
```
## Task 2
## Description: Finding average value from an array
## Explanation: In this task, we add all the elements of the array in a loop, and divide it by the number of numbers that is displayed through arr.length
## Solution:
```
private static int findaver(int[] arr) {
        int s = 0;
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty.");
        }
        for (int i = 0; i < arr.length; i++) {
            s = s + arr[i];
        }
        return s/arr.length;

    }
```
## Task 3
## Description: Determining whether a given number is prime
## Explanation: In this task, the user gives a number through which we set the root through the loop, thereby at the end of the loop we divide this number by the number in the loop (in this case it is indicated by the variable "i"). We establish a condition through which we identify whether this action is true or false, through which we determine whether the number is prime
## Solution:
```
public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
```
## Task 4
## Description: Finding the factorial of given number
## Explanation: In this task, we get the factorial of the number given to us through the built-in "factorail" function in Java
## Solution:
```
public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
```
## Task 5
## Description: Finding n-th elements in Fibonacci sequence using recursion
## Explanation: In this task, we find a place associated with a given number (in this case, the variable "n") in the Fibonacci numbers. We create a function where we find the previous two numbers using the variable "n"(n-1, n-2) using the built-in "fibonacci" method, and as a result, adding them, we find the number in the specified place.
## Solution:
```
 public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }

    }
```
## Task 6
## Description: Finding the power 'n' of the given 'a'
## Explanation: In this task, we set two variables, and we have to find the result using this formula: a^n. In the task, we use the built-in Math.pow function inside the power method to get the result.
## Solution:
```
public static double power(double a, int n){
        return Math.pow(a, n);
    }
```
## Task 7
## Description: Finding the reverse order of the array
## Explanation: In this task, I created a method with preset parameters in the variables right and left. We set a loop where we point the variable left to the first place in the array and right to the last place in the array, and at the end of the loop we move the variables in the opposite position, so we repeat the cycle before it gets back up.
## Solution:
```
public static void reverseArray(int n, int[] arr) {
        int left = 0;
        int right = n - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
```
## Task 8
## Description:  checking whether “s” string is all consists of digits.
## Explanation: In this task, I used the built-in syntax "isDigit" checking each character through a loop, and if there was a digit in the text, the program gave false because of the condition set in front of the syntax(!Character). As you know, the "!" sign denies the condition.
## Solution:
```
public static boolean isAllDigits(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }
```
## Task 9
## Description:,write the program that finds Cnk(binomial coefficient)
## Explanation: In this assignment, I created a separate factorial method and used the method in the formula.
## Solution:
```
public static int BinomCoef(int n, int k){
        int x = n - k;
        return factorial(n)/(factorial(x)*factorial(k));
    }
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
```
## Task 10
## Description: write the function for finding GCD(a, b) using recursion.
## Explanation: The function recursively calls itself with arguments b and a mod b, which calculates the remainder when a is divided by b, and continues the recursion until b becomes 0
## Solution:
```
 public static int gcd(int a, int b) {
        if (b == 0) {
            return a; // Base case: GCD(a, 0) = a
        }
        return gcd(b, a % b); // Recursive case: GCD(a, b) = GCD(b, a mod b)
    }
```
