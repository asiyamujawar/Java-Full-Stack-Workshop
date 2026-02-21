public class Outer {

    int x = 1;

    void callInner() { // corrected method name
        Inner i1 = new Inner();
        i1.add(100);
    }

    class Inner {
        int y = 10;

        void add(int a) {
            a++;
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        Outer o = new Outer();
        o.callInner();
        Outer.Inner ii=o.new Inner();
        ii.add(12);
    }
}