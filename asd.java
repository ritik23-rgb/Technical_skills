class asd {
    public static void main(String[] args) {
        int[] b = {2, 7, 11, 15};
        int t = 9;

        for (int i = 0; i < b.length; i++) {
            for (int j = i + 1; j < b.length; j++) {
                if (b[i] + b[j] == t) {
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
    }
}
