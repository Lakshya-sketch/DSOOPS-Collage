
class Main {
    //Tower Of Hanoi
    static void toh(int n, char src, char helper, char dest) {
        if (n == 0) return;
        toh(n - 1, src, dest, helper);
        System.out.println("Move disk " + n + " from " + src + " to"+ dest);
        toh(n - 1, helper, src, dest);
    }
    
    // Lexicographical Order
    static void lexico(int curr,int n){
        if( curr > n ){
            return;
        }
        
        System.out.print(curr + " ");
        
        for (int i = 0; i <= 9; i++) {
            lexico(curr * 10 + i, n);
        }
    }
    
    //SubSequences
    static void subseq(String s, String ans){
        if(s.length() == 0){
            System.out.println(ans);
            return;
        }
        
        char ch = s.charAt(0);
        String rest = s.substring(1);
        subseq(rest,ans);
        subseq(rest,ans+ch);
    }
    
    public static void main(String[] args) {
        toh(3, 'A', 'B', 'C');
        
        System.out.println();
        
        int n =12;
        for(int i = 1 ; i <= n; i++){
            lexico(i,n);
        }
        
        System.out.println();
        
        String a = "HELLO";
        subseq(a," ");
    }
    
    
}
