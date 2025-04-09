
## Integer Double String 等排序

    public final class Integer extends Number
        implements Comparable<Integer>, Constable, ConstantDesc {

    file:///Users/ann/Downloads/docs/api/java.base/java/lang/Integer.html#compare(int,int)

    compareTo -> compare 
    Integer.valueOf(x).compareTo(Integer.valueOf(y))

    Returns:
    the value 0 if x == y; a value less than 0 if x < y; and a value greater than 0 if x > y    
    已经确定了升序排列

### java源文件
    public int compareTo(Integer anotherInteger) {
        return compare(this.value, anotherInteger.value);
    }

    
        public static int compare(int x, int y) {
        return (x < y) ? -1 : ((x == y) ? 0 : 1);
    }