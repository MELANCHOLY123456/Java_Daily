package Chapter8.MyIF_Test;

public class DefaultMethodDemo {
    public static void main(String[] args) {
        MyIFImp obj_01 = new MyIFImp();
        System.out.println("User ID is " + obj_01.getUserID());
        System.out.println("Administrator ID is " + obj_01.getAdminID());
        System.out.println();

        MyIFImp2 obj_02 = new MyIFImp2();
        System.out.println("User ID is " + obj_02.getUserID());
        System.out.println("Administrator ID is " + obj_02.getAdminID());
        System.out.println();
    }
}
