Algorithms, 4th Edition<br>
https://algs4.cs.princeton.edu/home/

# Chapter 1
## 1.1 基础编程模型

### 1.1.1 Java程序基本结构
1. execute a java code
```bash
(1) javac BinarySearch.java -> BinarySearch.class 
(2) java BinarySearch
```


### 1.1.2 primitive type
- int
- double
- boolean
- char

### 1.1.2.1 Expression
运算符 * / % 优先级高于 + 和 -

### 1.1.2.2 类型转换
如果不会损失信息，数值会被自动提升为高级的数据类型<br>
- int -> 2^32
- long -> 2^64
- short -> 2^16
- char -> 2^16
- byte -> 2^8
- float -> 2^32

### 1.1.3 statement
- declaration
- assign
- condition
- loop
- break and continue

### 1.1.4 简便记法
- 单语句代码段
- for语句
```java
for (‹initialize; ‹boolean expression›; <increment>){
    <block statements>
}

// 等价于 
initialize;
while(‹boolean expression›){
    <block statements>;
    <increment>;
}
```

### 1.1.5 数组

#### 1.1.5.3 使用数组
1. 颠倒数组元素的顺序
```java
public class revert(int[] a){
    int N = a.length;
    for (int i = 0; i < N/2; i++){
        double tmp = a[i];
        a[i] = a[N - 1 - i];
        a[N - 1 - i] = tmp;
    }
}
```

2. 点乘
```java
public class max_dot(int[] a, int[] b){
    int N = a.length;
    double[][] c =  new double[N][N];
    for (int i = 0; i < N; i++){
        for (int j = 0; j < N; j++) {
            for (int k =0; k< N; k++){
                c[i][j] += a[i][k] * b[k][j]; 
            }
                
        }
        
    }
}
```

#### 1.1.5.4 起别名
```java
// 会指向同一个地址
int[] a = new int[N];
a[i]=1234
int[] b = a
b[i]=5678
```


### 1.1.6 静态方法
1. sqrt
```java
public static double sqrt(double c) {
    if (c < 0) return Double.NaN
    double err = 1e-15;
    double t = c;
    while (Math.abs(t - c/t) > err * t)
        t = (c / t + t) / 2.0;
    return t;
}
```

2. prime number
```java
public static boolean isPrime(int N) {
    if (N < 2) return false;
    for (int i = 0; i * i <= N; i++)
        if (N % i == 0) return false;
    return true;
}
```

3. hypotenuse
```java
public static double hypotenuse(double a, double b) {
    return Math.sqrt(a * a + b * b)
}
```

4. 调和级数
```java
public static double H (int N){
    double sum = 0.0;
    for(int i = 1; i <= N; i++)
        sum += 1.0/i;
    return sum;
}


```


#### 1.1.6.2 调用静态方法
- 方法名重载
```java
Math.abs()
```


