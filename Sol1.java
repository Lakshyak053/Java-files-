import java.util.*;

class Sol1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); 
        while (t-- > 0) {
            int n = sc.nextInt();
            sc.nextLine(); 
            String str = sc.nextLine();
            Set<String> disStr = new HashSet<>();
            for (int i = 0; i < n-1; i++) {
                String newString = str.substring(0, i) + str.substring(i+2);
                disStr.add(newString);
            }
            System.out.println(disStr.size());
        }
        sc.close();
    }
}

 