class a {
    public static void main(String[] args) {
        int[] b = {4, 2, 7, 5, 7};
        int m = b[0], c = 0;

        
        for (int i = 1; i < b.length; i++)
            if (b[i] > m) m = b[i];

       
        for (int i = 0; i < b.length; i++)
            if (b[i] < m) c++;

        System.out.println(c);
    }
}
