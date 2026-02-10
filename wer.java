class a {
    public static void main(String[] args) {
        int[] b = {4, 2, 7, 5, 7};
        int m = b[0], s = -1;

        for (int i = 1; i < b.length; i++) {
            if (b[i] > m) {
                s = m;
                m = b[i];
            } else if (b[i] < m && b[i] > s) {
                s = b[i];
            }
        }

        System.out.println(s);
    }
}
