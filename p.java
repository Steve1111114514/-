package My_libraries;

import java.util.ArrayList;
import java.util.List;

public class p {
    public static boolean prime(long x) {
        if (x == 2) {
            return true;
        }
        short c = 0;
        long a = (long) (Math.pow(x, 0.5));
        for (long i = 2L; i <= a; i ++) {
            if (x % i == 0) {
                c = 1;
                break;
            }
        }
        return c == 0;
    }

    public static long factorial(long x) {
        long s = 1;
        for (long i = 2L; i <= x; i ++) {
            s *= i;
        }
        return s;
    }

    public static long hcf(long m, long n) {
        long a = Math.max(m, n);
        long b = Math.min(m, n);
        long temp;
        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int Array_max(int[] arr) {
        int a = arr[0];
        for (int i : arr) {
            if (a < i) {
                a = i;
            }
        }
        return a;
    }

    public static int Array_min(int[] arr) {
        int a = arr[0];
        for (int i : arr) {
            if (a > i) {
                a = i;
            }
        }
        return a;
    }

    public static double Array_max(double[] arr) {
        double a = arr[0];
        for (double i : arr) {
            if (a < i) {
                a = i;
            }
        }
        return a;
    }

    public static double Array_min(double[] arr) {
        double a = arr[0];
        for (double i : arr) {
            if (a > i) {
                a = i;
            }
        }
        return a;
    }

    public static long Array_max(long[] arr) {
        long a = arr[0];
        for (long i : arr) {
            if (a < i) {
                a = i;
            }
        }
        return a;
    }

    public static long Array_min(long[] arr) {
        long a = arr[0];
        for (long i : arr) {
            if (a > i) {
                a = i;
            }
        }
        return a;
    }

    public static float Array_max(float[] arr) {
        float a = arr[0];
        for (float i : arr) {
            if (a < i) {
                a = i;
            }
        }
        return a;
    }

    public static float Array_min(float[] arr) {
        float a = arr[0];
        for (float i : arr) {
            if (a > i) {
                a = i;
            }
        }
        return a;
    }

    public static short Array_max(short[] arr) {
        short a = arr[0];
        for (short i : arr) {
            if (a < i) {
                a = i;
            }
        }
        return a;
    }

    public static short Array_min(short[] arr) {
        short a = arr[0];
        for (short i : arr) {
            if (a > i) {
                a = i;
            }
        }
        return a;
    }

    public static int Array_index(int x, int[] arr) {
        int a = 0;
        for (int i = 0; i <= arr.length - 1; i ++) {
            if (x == arr[i]) {
                break;
            }
            a ++;
        }
        return a;
    }

    public static long Array_index(long x, long[] arr) {
        int a = 0;
        for (int i = 0; i <= arr.length - 1; i ++) {

            if (x == arr[i]) {
                break;
            }
            a ++;
        }
        return a;
    }

    public static int Array_index(String x, String[] arr) {
        int a = 0;
        for (int i = 0; i <= arr.length - 1; i ++) {

            if (x.equals(arr[i])) {
                break;
            }
            a ++;
        }
        return a;
    }

    public static int Array_index(float x, float[] arr) {
        int a = 0;
        for (int i = 0; i <= arr.length - 1; i ++) {
            if (x == arr[i]) {
                break;
            }
            a ++;
        }
        return a;
    }

    public static int Array_index(double x, double[] arr) {
        int a = 0;
        for (int i = 0; i <= arr.length - 1; i ++) {
            if (x == arr[i]) {
                break;
            }
            a ++;
        }
        return a;
    }

    public static int Array_index(short x, short[] arr) {
        int a = 0;
        for (int i = 0; i <= arr.length - 1; i ++) {
            if (x == arr[i]) {
                break;
            }
            a ++;
        }
        return a;
    }

    public static void sort(int[] arr) {
        int c = Array_max(arr);
        int[] b = new int[arr.length];
        for (int i = 0; i <= arr.length - 1; i ++) {
            b[i] = Array_min(arr);
            arr[Array_index(Array_min(arr), arr)] = c;
        }
        System.arraycopy(b, 0, arr, 0, arr.length - 1 + 1);
    }

    public static int Array_sum(int[] arr) {
        int result = 0;
        for (int i = 0; i <= arr.length - 1; i ++) {
            result += arr[i];
        }
        return result;
    }

    public static long Array_sum(long[] arr) {
        int result = 0;
        for (int i = 0; i <= arr.length - 1; i ++) {
            result += arr[i];
        }
        return result;
    }

    public static float Array_sum(float[] arr) {
        float result = 0F;
        for (int i = 0; i <= arr.length - 1; i ++) {
            result += arr[i];
        }
        return result;
    }

    public static double Array_sum(double[] arr) {
        double result = 0;
        for (int i = 0; i <= arr.length - 1; i ++) {
            result += arr[i];
        }
        return result;
    }

    public static short Array_sum(short[] arr) {
        short result = 0;
        for (int i = 0; i <= arr.length - 1; i ++) {
            result += arr[i];
        }
        return result;
    }

    public static String Array_sum(String[] arr) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= arr.length - 1; i ++) {
            result.append(arr[i]);
        }
        return result.toString();
    }

    public static boolean Array_element_equals(int[] arr1, int[] arr2) {
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

    public static boolean Array_element_equals(long[] arr1, long[] arr2) {
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

    public static boolean Array_element_equals(String[] arr1, String[] arr2) {
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

    public static boolean Array_element_equals(double[] arr1, double[] arr2) {
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

    public static boolean Array_element_equals(short[] arr1, short[] arr2) {
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

    public static boolean Array_element_equals(float[] arr1, float[] arr2) {
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

    public static int[] Array_remove(int a, int[] arr) {
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

    public static long[] Array_remove(long a, long[] arr) {
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

    public static String[] Array_remove(String a, String[] arr) {
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

    public static short[] Array_remove(short a, short[] arr) {
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

    public static double[] Array_remove(double a, double[] arr) {
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

    public static float[] Array_remove(float a, float[] arr) {
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

    public static int[] Array_add(int a, int[] arr) {
        int s = arr.length;
        int[] b = new int[s + 1];
        System.arraycopy(arr, 0, b, 0, s - 1 + 1);
        b[s] = a;
        return b;
    }

    public static long[] Array_add(long a, long[] arr) {
        int s = arr.length;
        long[] b = new long[s + 1];
        System.arraycopy(arr, 0, b, 0, s - 1 + 1);
        b[s] = a;
        return b;
    }

    public static String[] Array_add(String a, String[] arr) {
        int s = arr.length;
        String[] b = new String[s + 1];
        System.arraycopy(arr, 0, b, 0, s - 1 + 1);
        b[s] = a;
        return b;
    }

    public static short[] Array_add(short a, short[] arr) {
        int s = arr.length;
        short[] b = new short[s + 1];
        System.arraycopy(arr, 0, b, 0, s - 1 + 1);
        b[s] = a;
        return b;
    }

    public static float[] Array_add(float a, float[] arr) {
        int s = arr.length;
        float[] b = new float[s + 1];
        System.arraycopy(arr, 0, b, 0, s - 1 + 1);
        b[s] = a;
        return b;
    }

    public static double[] Array_add(double a, double[] arr) {
        int s = arr.length;
        double[] b = new double[s + 1];
        System.arraycopy(arr, 0, b, 0, s - 1 + 1);
        b[s] = a;
        return b;
    }

    public static boolean Array_contains(int a, int[] arr) {
        for (int i = 0; i <= arr.length - 1; i ++) {
            if (a == arr[i]) {
                return true;
            }
        }
        return false;
    }

    public static boolean Array_contains(long a, long[] arr) {
        for (int i = 0; i <= arr.length - 1; i ++) {
            if (a == arr[i]) {
                return true;
            }
        }
        return false;
    }

    public static boolean Array_contains(double a, double[] arr) {
        for (int i = 0; i <= arr.length - 1; i ++) {
            if (a == arr[i]) {
                return true;
            }
        }
        return false;
    }

    public static boolean Array_contains(float a, float[] arr) {
        for (int i = 0; i <= arr.length - 1; i ++) {
            if (a == arr[i]) {
                return true;
            }
        }
        return false;
    }

    public static boolean Array_contains(short a, short[] arr) {
        for (int i = 0; i <= arr.length - 1; i ++) {
            if (a == arr[i]) {
                return true;
            }
        }
        return false;
    }

    public static boolean Array_contains(String a, String[] arr) {
        for (int i = 0; i <= arr.length - 1; i ++) {
            if (a.equals(arr[i])) {
                return true;
            }
        }
        return false;
    }
}
