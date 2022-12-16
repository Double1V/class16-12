# class16-12
## kata task1
[Task link](https://www.codewars.com/kata/5a6663e9fd56cb5ab800008b)    
My solution
```java
public class Dinglemouse {

    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int n = humanYears;
        if (n == 1) {
            return new int[]{n, 15, 15};
        }
        if (n == 2) {
            return new int[]{n, 15 + 9, 15 + 9};
        }

        return new int[]{n, 15 + 9 + 4 * (n - 2), 15 + 9 + 5 * (n - 2)};

    }

}
```
My fav solution
```java
public class Dinglemouse {
  public static int[] humanYearsCatYearsDogYears(final int y) {
    return new int[]{y,y==1?15:16+4*y,y==1?15:14+5*y};
  }
}
```
## kata task2
[Task link](https://www.codewars.com/kata/61123a6f2446320021db987d)    
My solution
```java
public class Kata {
    public static Integer prevMultOfThree(int n) {
        while (n != 0) {
            if (n % 3 == 0) {
                return n;
            }
            n = n / 10;
        }
        return null;
    }
}
```

My fav solution
```java
public class Kata {
  
  public static Integer prevMultOfThree(int n) {
    for (; n > 0; n /= 10)
      if (n % 3 == 0) return n;
  
    return null;
  }
  
}
```
