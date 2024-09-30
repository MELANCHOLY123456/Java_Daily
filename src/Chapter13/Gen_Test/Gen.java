package Chapter13.Gen_Test;

public class Gen<T> {
    T ob;

    Gen(T o) {
        ob = o;
    }

    T getOb() {
        return ob;
    }

    void showType() {
        System.out.println("Type of T is " + ob.getClass().getName());
    }
}

/*
 * Gen<T>是一个泛型类，其中T是一个类型参数 -> 这个类可以存储任何类型的数据.
 *
 * */