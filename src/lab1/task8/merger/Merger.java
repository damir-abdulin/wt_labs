package lab1.task8.merger;

public class Merger {

    public int[] getInsertionIndices(double[] a, double[] b) {
        int[] indices = new int[b.length];
        int i = 0;
        for (int j = 0; j < a.length; ++j) {
            for (int k = i; k < b.length; ++k) {
                if (b[k] <= a[j]) {
                    indices[i] = j;
                    ++i;
                } else {
                    break;
                }
            }
        }
        for (int k = i; k < b.length; ++k) {
            indices[i] = a.length;
            ++i;
        }
        return indices;
    }
}
