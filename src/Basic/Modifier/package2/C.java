package Basic.Modifier.package2;

import Basic.Modifier.package1.A;

public class C extends A {
    public static void main(String[] args) {
        A a = new A();
        C c = new C();
        a.func1();
//        a.func2(); error 不同包中, protected无法通过实例直接访问
        c.func4(); //protected可以通过类内部来访问
    }

    public void func4() {
        func2();
    }
}
