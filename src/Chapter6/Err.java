package Chapter6;

class Err {
    String msg;
    int severity;

    Err(String m, int s) {
        msg = m;
        severity = s;
    }
}

class ErrInfo {
    String[] msg = {
            "Output Error",
            "Input Error",
            "Disk Full",
            "Index Out-Of-Bounds"
    };
    int[] how_bad = {3, 3, 2, 4};

    Err getErrorInfo(int i) {
        if (i >= 0 & i < msg.length)
            return new Err(msg[i], how_bad[i]);
        else
            return new Err("Invalid Error Code", 0);
    }
}

class Demo {
    public static void main(String[] args) {
        ErrInfo err = new ErrInfo();
        Err e;
        e = err.getErrorInfo(2);
        System.out.println(e.msg + " severity: " + e.severity);
        e = err.getErrorInfo(19);
        System.out.println(e.msg + " severity: " + e.severity);
    }
}
