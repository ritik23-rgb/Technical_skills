public class b {
    public static void main(String[] args) {
        int[] b = {1, 3, 5, 2, 2};
        int s = 0, l = 0;

        for (int x : b) s += x;   

        for (int i = 0; i < b.length; i++) {
            s -= b[i];        
            if (l == s) {
                System.out.println(i);
                return;
            }
            l += b[i];        
        }
    }

}
    

