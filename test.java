class test {
    static class MyStruct {
        int[] a = new int[2];
        double d;
    }

    static double fun(int i) {
        MyStruct s = new MyStruct();
        s.d = 3.14;
        s.a[i] = 1073741824; // Possibly out of bounds
        return s.d;
    }

    public static void main(String[] args) {
        double ans = fun(1);
        System.out.printf("%f", ans);
    }
}
