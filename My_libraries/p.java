package My_libraries;

public class p {
    public boolean prime(long x) {
        if (x == 2) {
            return true;
        }
        for (long i = 2L; i <= (long) (Math.pow(x, 0.5)); i ++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
    public long[] IntegerFactorization(long x) {
        long[] a = {};
        while (!prime(x)) {
            for (long i = 2L; i <= (long) (Math.pow(x, 0.5)); i ++) {
                if (x % i == 0) {
                    x /= i;
                    a = Array_add(i, a);
                    break;
                }
            }
        }
        return Array_add(x, a);
    }

    public long factorial(long x) {
        long s = 1;
        for (long i = 2L; i <= x; i ++) {
            s *= i;
        }
        return s;
    }

    public long hcf(long m, long n) {
        long x;
        if (n > m) {
            x = n;
            n = m;
            m = x;
        }
        long temp;
        while (n != 0) {
            temp = n;
            n = m % n;
            m = temp;
        }
        return m;
    }

    public int Array_max(int[] arr) {
        int a = arr[0];
        for (int i : arr) {
            if (a < i) {
                a = i;
            }
        }
        return a;
    }

    public int Array_min(int[] arr) {
        int a = arr[0];
        for (int i : arr) {
            if (a > i) {
                a = i;
            }
        }
        return a;
    }

    public double Array_max(double[] arr) {
        double a = arr[0];
        for (double i : arr) {
            if (a < i) {
                a = i;
            }
        }
        return a;
    }

    public double Array_min(double[] arr) {
        double a = arr[0];
        for (double i : arr) {
            if (a > i) {
                a = i;
            }
        }
        return a;
    }

    public long Array_max(long[] arr) {
        long a = arr[0];
        for (long i : arr) {
            if (a < i) {
                a = i;
            }
        }
        return a;
    }

    public long Array_min(long[] arr) {
        long a = arr[0];
        for (long i : arr) {
            if (a > i) {
                a = i;
            }
        }
        return a;
    }

    public float Array_max(float[] arr) {
        float a = arr[0];
        for (float i : arr) {
            if (a < i) {
                a = i;
            }
        }
        return a;
    }

    public float Array_min(float[] arr) {
        float a = arr[0];
        for (float i : arr) {
            if (a > i) {
                a = i;
            }
        }
        return a;
    }

    public short Array_max(short[] arr) {
        short a = arr[0];
        for (short i : arr) {
            if (a < i) {
                a = i;
            }
        }
        return a;
    }

    public short Array_min(short[] arr) {
        short a = arr[0];
        for (short i : arr) {
            if (a > i) {
                a = i;
            }
        }
        return a;
    }

    public int Array_index(int x, int[] arr) {
        int a = 0;
        for (int i = 0; i <= arr.length - 1; i ++) {
            if (x == arr[i]) {
                break;
            }
            a ++;
        }
        return a;
    }

    public long Array_index(long x, long[] arr) {
        int a = 0;
        for (int i = 0; i <= arr.length - 1; i ++) {

            if (x == arr[i]) {
                break;
            }
            a ++;
        }
        return a;
    }

    public int Array_index(String x, String[] arr) {
        int a = 0;
        for (int i = 0; i <= arr.length - 1; i ++) {

            if (x.equals(arr[i])) {
                break;
            }
            a ++;
        }
        return a;
    }

    public int Array_index(float x, float[] arr) {
        int a = 0;
        for (int i = 0; i <= arr.length - 1; i ++) {
            if (x == arr[i]) {
                break;
            }
            a ++;
        }
        return a;
    }

    public int Array_index(double x, double[] arr) {
        int a = 0;
        for (int i = 0; i <= arr.length - 1; i ++) {
            if (x == arr[i]) {
                break;
            }
            a ++;
        }
        return a;
    }

    public int Array_index(short x, short[] arr) {
        int a = 0;
        for (int i = 0; i <= arr.length - 1; i ++) {
            if (x == arr[i]) {
                break;
            }
            a ++;
        }
        return a;
    }

    public int Array_sum(int[] arr) {
        int result = 0;
        for (int i = 0; i <= arr.length - 1; i ++) {
            result += arr[i];
        }
        return result;
    }

    public long Array_sum(long[] arr) {
        int result = 0;
        for (int i = 0; i <= arr.length - 1; i ++) {
            result += arr[i];
        }
        return result;
    }

    public float Array_sum(float[] arr) {
        float result = 0F;
        for (int i = 0; i <= arr.length - 1; i ++) {
            result += arr[i];
        }
        return result;
    }

    public double Array_sum(double[] arr) {
        double result = 0;
        for (int i = 0; i <= arr.length - 1; i ++) {
            result += arr[i];
        }
        return result;
    }

    public short Array_sum(short[] arr) {
        short result = 0;
        for (int i = 0; i <= arr.length - 1; i ++) {
            result += arr[i];
        }
        return result;
    }

    public String Array_sum(String[] arr) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= arr.length - 1; i ++) {
            result.append(arr[i]);
        }
        return result.toString();
    }

    public boolean Array_element_equals(Object[] arr1, Object[] arr2) {
        long a = arr1.length;
        long b = arr2.length;
        if (a == b) {
            for (int i = 0; i <= a - 1; i ++) {
                for (int j = 0; j <= b - 1; j ++) {
                    if (arr1[i] == arr2[j]) {
                        arr2 = Array_remove(arr2[j], arr2);
                        break;
                    }
                }
            }
            return arr2.length == 0;
        } else {
            return false;
        }
    }

    public boolean Array_element_equals(long[] arr1, long[] arr2) {
        long a = arr1.length;
        long b = arr2.length;
        if (a == b) {
            for (int i = 0; i <= a - 1; i ++) {
                for (int j = 0; j <= b - 1; j ++) {
                    if (arr1[i] == arr2[j]) {
                        arr2 = Array_remove(arr2[j], arr2);
                        break;
                    }
                }
            }
            return arr2.length == 0;
        } else {
            return false;
        }
    }

    public boolean Array_element_equals(String[] arr1, String[] arr2) {
        long a = arr1.length;
        long b = arr2.length;
        if (a == b) {
            for (int i = 0; i <= a - 1; i ++) {
                for (int j = 0; j <= b - 1; j ++) {
                    if (arr1[i].equals(arr2[j])) {
                        arr2 = Array_remove(arr2[j], arr2);
                        break;
                    }
                }
            }
            return arr2.length == 0;
        } else {
            return false;
        }
    }

    public boolean Array_element_equals(double[] arr1, double[] arr2) {
        long a = arr1.length;
        long b = arr2.length;
        if (a == b) {
            for (int i = 0; i <= a - 1; i ++) {
                for (int j = 0; j <= b - 1; j ++) {
                    if (arr1[i] == arr2[j]) {
                        arr2 = Array_remove(arr2[j], arr2);
                        break;
                    }
                }
            }
            return arr2.length == 0;
        } else {
            return false;
        }
    }

    public boolean Array_element_equals(short[] arr1, short[] arr2) {
        long a = arr1.length;
        long b = arr2.length;
        if (a == b) {
            for (int i = 0; i <= a - 1; i ++) {
                for (int j = 0; j <= b - 1; j ++) {
                    if (arr1[i] == arr2[j]) {
                        arr2 = Array_remove(arr2[j], arr2);
                        break;
                    }
                }
            }
            return arr2.length == 0;
        } else {
            return false;
        }
    }

    public boolean Array_element_equals(float[] arr1, float[] arr2) {
        long a = arr1.length;
        long b = arr2.length;
        if (a == b) {
            for (int i = 0; i <= a - 1; i ++) {
                for (int j = 0; j <= b - 1; j ++) {
                    if (arr1[i] == arr2[j]) {
                        arr2 = Array_remove(arr2[j], arr2);
                        break;
                    }
                }
            }
            return arr2.length == 0;
        } else {
            return false;
        }
    }

    public Object[] Array_remove(Object a, Object[] arr) {
        int s = arr.length;
        Object[] b = new Object[s - 1];
        int c = 0;
        for (int i = 0; i <= s - 1; i ++) {
            if (arr[i] != a) {
                b[c] = arr[i];
                c ++;
            }
        }
        return b;
    }

    public int[] Array_remove(int a, int[] arr) {
        int s = arr.length;
        int[] b = new int[s - 1];
        int c = 0;
        for (int i = 0; i <= s - 1; i ++) {
            if (arr[i] != a) {
                b[c] = arr[i];
                c ++;
            }
        }
        return b;
    }

    public long[] Array_remove(long a, long[] arr) {
        int s = arr.length;
        long[] b = new long[s - 1];
        int c = 0;
        for (int i = 0; i <= s - 1; i ++) {
            if (arr[i] != a) {
                b[c] = arr[i];
                c ++;
            }
        }
        return b;
    }

    public String[] Array_remove(String a, String[] arr) {
        int s = arr.length;
        String[] b = new String[s - 1];
        int c = 0;
        for (int i = 0; i <= s - 1; i ++) {
            if (!(arr[i].equals(a))) {
                b[c] = arr[i];
                c ++;
            }
        }
        return b;
    }

    public short[] Array_remove(short a, short[] arr) {
        int s = arr.length;
        short[] b = new short[s - 1];
        int c = 0;
        for (int i = 0; i <= s - 1; i ++) {
            if (arr[i] != a) {
                b[c] = arr[i];
                c ++;
            }
        }
        return b;
    }

    public double[] Array_remove(double a, double[] arr) {
        int s = arr.length;
        double[] b = new double[s - 1];
        int c = 0;
        for (int i = 0; i <= s - 1; i ++) {
            if (arr[i] != a) {
                b[c] = arr[i];
                c ++;
            }
        }
        return b;
    }

    public float[] Array_remove(float a, float[] arr) {
        int s = arr.length;
        float[] b = new float[s - 1];
        int c = 0;
        for (int i = 0; i <= s - 1; i ++) {
            if (arr[i] != a) {
                b[c] = arr[i];
                c ++;
            }
        }
        return b;
    }

    public Object[] Array_add(Object a, Object[] arr) {
        int s = arr.length;
        Object[] b = new Object[s + 1];
        System.arraycopy(arr, 0, b, 0, s - 1 + 1);
        b[s] = a;
        return b;
    }

    public int[] Array_add(int a, int[] arr) {
        int s = arr.length;
        int[] b = new int[s + 1];
        System.arraycopy(arr, 0, b, 0, s - 1 + 1);
        b[s] = a;
        return b;
    }

    public long[] Array_add(long a, long[] arr) {
        int s = arr.length;
        long[] b = new long[s + 1];
        System.arraycopy(arr, 0, b, 0, s - 1 + 1);
        b[s] = a;
        return b;
    }

    public String[] Array_add(String a, String[] arr) {
        int s = arr.length;
        String[] b = new String[s + 1];
        System.arraycopy(arr, 0, b, 0, s - 1 + 1);
        b[s] = a;
        return b;
    }

    public short[] Array_add(short a, short[] arr) {
        int s = arr.length;
        short[] b = new short[s + 1];
        System.arraycopy(arr, 0, b, 0, s - 1 + 1);
        b[s] = a;
        return b;
    }

    public float[] Array_add(float a, float[] arr) {
        int s = arr.length;
        float[] b = new float[s + 1];
        System.arraycopy(arr, 0, b, 0, s - 1 + 1);
        b[s] = a;
        return b;
    }

    public double[] Array_add(double a, double[] arr) {
        int s = arr.length;
        double[] b = new double[s + 1];
        System.arraycopy(arr, 0, b, 0, s - 1 + 1);
        b[s] = a;
        return b;
    }

    public boolean Array_contains(int a, int[] arr) {
        for (int i = 0; i <= arr.length - 1; i ++) {
            if (a == arr[i]) {
                return true;
            }
        }
        return false;
    }

    public boolean Array_contains(long a, long[] arr) {
        for (int i = 0; i <= arr.length - 1; i ++) {
            if (a == arr[i]) {
                return true;
            }
        }
        return false;
    }

    public boolean Array_contains(double a, double[] arr) {
        for (int i = 0; i <= arr.length - 1; i ++) {
            if (a == arr[i]) {
                return true;
            }
        }
        return false;
    }

    public boolean Array_contains(float a, float[] arr) {
        for (int i = 0; i <= arr.length - 1; i ++) {
            if (a == arr[i]) {
                return true;
            }
        }
        return false;
    }

    public boolean Array_contains(short a, short[] arr) {
        for (int i = 0; i <= arr.length - 1; i ++) {
            if (a == arr[i]) {
                return true;
            }
        }
        return false;
    }

    public boolean Array_contains(String a, String[] arr) {
        for (int i = 0; i <= arr.length - 1; i ++) {
            if (a.equals(arr[i])) {
                return true;
            }
        }
        return false;
    }

    public boolean Array_contains(Object a, Object[] arr) {
        for (int i = 0; i <= arr.length - 1; i ++) {
            if (a == arr[i]) {
                return true;
            }
        }
        return false;
    }

    public int Array_max(int[][] arr) {
        int b = arr.length;
        int[] a = new int[b];
        for (int i = 0; i <= b - 1; i ++) {
            a[i] = Array_max(arr[i]);
        }
        return Array_max(a);
    }

    public int Array_min(int[][] arr) {
        int b = arr.length;
        int[] a = new int[b];
        for (int i = 0; i <= b - 1; i ++) {
            a[i] = Array_min(arr[i]);
        }
        return Array_min(a);
    }

    public long Array_max(long[][] arr) {
        int b = arr.length;
        long[] a = new long[b];
        for (int i = 0; i <= b - 1; i ++) {
            a[i] = Array_max(arr[i]);
        }
        return Array_max(a);
    }

    public long Array_min(long[][] arr) {
        int b = arr.length;
        long[] a = new long[b];
        for (int i = 0; i <= b - 1; i ++) {
            a[i] = Array_min(arr[i]);
        }
        return Array_min(a);
    }

    public short Array_max(short[][] arr) {
        int b = arr.length;
        short[] a = new short[b];
        for (int i = 0; i <= b - 1; i ++) {
            a[i] = Array_max(arr[i]);
        }
        return Array_max(a);
    }

    public short Array_min(short[][] arr) {
        int b = arr.length;
        short[] a = new short[b];
        for (int i = 0; i <= b - 1; i ++) {
            a[i] = Array_min(arr[i]);
        }
        return Array_min(a);
    }

    public double Array_max(double[][] arr) {
        int b = arr.length;
        double[] a = new double[b];
        for (int i = 0; i <= b - 1; i ++) {
            a[i] = Array_max(arr[i]);
        }
        return Array_max(a);
    }

    public double Array_min(double[][] arr) {
        int b = arr.length;
        double[] a = new double[b];
        for (int i = 0; i <= b - 1; i ++) {
            a[i] = Array_min(arr[i]);
        }
        return Array_min(a);
    }

    public float Array_max(float[][] arr) {
        int b = arr.length;
        float[] a = new float[b];
        for (int i = 0; i <= b - 1; i ++) {
            a[i] = Array_max(arr[i]);
        }
        return Array_max(a);
    }

    public float Array_min(float[][] arr) {
        int b = arr.length;
        float[] a = new float[b];
        for (int i = 0; i <= b - 1; i ++) {
            a[i] = Array_min(arr[i]);
        }
        return Array_min(a);
    }
}
