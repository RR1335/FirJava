package defineexception.baijing.base;

public class ExceptionNameFormat extends RuntimeException {

    // 运行时异常： RunTimeException
    // 编译时异常： Exception


    public ExceptionNameFormat() {
    }

    public ExceptionNameFormat(String message) {
        super(message);
    }
}
