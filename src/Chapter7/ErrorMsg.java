package Chapter7;

public class ErrorMsg {
    // 声明final常量
    final int OUTERR = 0;
    final int INERR = 1;
    final int DISKERR = 2;
    final int INDEXERR = 3;

    String msgs[] = {
            "Output Error",
            "Input Error",
            "Disk Full",
            "Index Out-Of-Bounds"
    };

    // Return the error message.
    String getErrorMsg(int i) {
        if (i >= 0 & i < msgs.length) {
            return msgs[i];
        } else {
            return "Invalid Error Code";
        }
    }
}

class FinalD {
    public static void main(String[] args) {
        ErrorMsg err = new ErrorMsg();

        System.out.println(err.getErrorMsg(err.OUTERR));
        System.out.println(err.getErrorMsg(err.DISKERR));
    }
}