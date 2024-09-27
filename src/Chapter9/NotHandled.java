//package Chapter9;
//
//public class NotHandled {
//    public static void main(String[] args) {
//        int[] num = new int[4];
//        System.out.println("Before exception is generated.");
//        // generate an index out-of-bounds exception
//        num[7] = 10;
//    }
//}

// 如果程序不捕获异常，那它就要被JVM捕获
// 麻烦的是JVM的默认异常处理程序会终止执行并显示堆栈跟踪和出错消息