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

```
## Task 4
## Description:
## Explanation:
## Solution:
```

```
## Task 5
## Description:
## Explanation:
## Solution:
```

```
## Task 6
## Description:
## Explanation:
## Solution:
```

```
## Task 7
## Description:
## Explanation:
## Solution:
```

```
## Task 8
## Description:
## Explanation:
## Solution:
```

```
## Task 9
## Description:
## Explanation:
## Solution:
```

```
## Task 10
## Description:
## Explanation:
## Solution:
```

```
