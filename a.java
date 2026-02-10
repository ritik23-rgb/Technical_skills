class a {
    public static void main(String[] args) {
        int[] b = {3, 5, 1, 4, 2};
        int k = 6;

        for (int i = 0; i < b.length; i++) {
            for (int j = i + 1; j < b.length; j++) {
                if (b[i] + b[j] == k) {
                    System.out.println("Yes: " + i + " " + j);
                    return;
                }
            }
        }
        System.out.println("No");
    }
}
