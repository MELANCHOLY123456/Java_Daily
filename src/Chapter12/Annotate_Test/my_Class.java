package Chapter12.Annotate_Test;

// 标记一个不再建议使用的类
@Deprecated
public class my_Class {
    private final String msg;

    my_Class(String m) {
        msg = m;
    }

    // 标记一个不再建议使用的方法
    @Deprecated
    String getMsg() {
        return msg;
    }
}
