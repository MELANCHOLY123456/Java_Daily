package Chapter7;

class A2 {
    A2() {
        System.out.println("Constructing A.");
    }
}

class B2 extends A2 {
    B2() {
        System.out.println("Constructing B.");
    }
}

class C2 extends B2 {
    C2() {
        System.out.println("Constructing C.");
    }
}

class OrderOfConstruction {
    public static void main(String[] args) {
        C2 c = new C2();
    }
}

// 在类的层次结构中构造函数的调用是按照继承的顺序从超类到子类来进行的
// super()必须是子类构造函数中执行的第一条语句 -> 所以无论是否使用super()，构造函数的调用顺序都是相同的
// 如果没有使用super()则执行每个超类的默认(无形参)构造函数