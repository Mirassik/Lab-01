# Lab-01
## Task 1
## Description: Returning the minimal value of an array
## Explanation: Base case: n = 1, then we return the first element of the array and compare it with arr[n-1], and by recursive function we return the lesser element by the way determine minimal value
## Solution:
```
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i=0; i<num; i++ ){
            arr[i] = sc.nextInt();
        }
        int minVal = findMin(arr);
        System.out.println(minVal);

    }

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
## Description: 
## Explanation:
## Solution:
```

```
## Task 3
## Description:
## Explanation:
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
