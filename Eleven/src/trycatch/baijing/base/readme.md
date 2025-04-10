
# try catch 

不同的异常，要多个 catch 捕获。

# catch 

遇到异常的子类和父类异常，父类catch写在子类catch下面。

```
        try {
            System.out.println(arr[12]); // ArrayIndexOutOfBoundsException
            System.out.println(arr[3]/0); // ArithmeticException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println( "数据越界。" + e);
        } catch (ArithmeticException e) {
            System.out.println("算数异常, 除数不能为 0 ." + e);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
```

如果写成了

```
        try {
            System.out.println(arr[12]); // ArrayIndexOutOfBoundsException
            System.out.println(arr[3]/0); // ArithmeticException
        } catch (Exception e) {                      // Exception e = ArrayIndexOutOfBoundsException  这是一个多态
            System.out.println( "数据越界。" + e);
        } catch (ArithmeticException e) {
            System.out.println("算数异常, 除数不能为 0 ." + e);
```

意味着，所有异常都会被  catch (Exception e) {   截获；下面的 catch 将不再执行。

