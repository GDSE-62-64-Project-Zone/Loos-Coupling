package lk.ijse.test;
//Low level Classes
public class B {

    public void requestA(){
        //Tight Coupling
        A a = new A();
        a.getA();

        // So what is loos coupling.?


    }

    public static void main(String[] args) {
        B b = new B();
        b.requestA();
    }
}
