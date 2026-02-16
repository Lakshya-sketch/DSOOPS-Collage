
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
        
        subseq(rest,ans+ch);
        subseq(rest,ans);
        
    }
    
    //Combinations for 2 coins
    static void cointoss(int t, String ans){
        if(t == 0){
            System.out.print(ans);
            return;
        }
        
        cointoss(t-1,ans+"H");
        cointoss(t-1,ans+"T");
    }
    
    //Board Path
    static void boardPath(int curr, int end, String ans) {
        if (curr == end) {
            System.out.println(ans);
            return;
        }
        if (curr > end) return;
        for (int dice = 1; dice <= 6; dice++) {
        boardPath(curr + dice, end, ans + dice);
        }
    }
    
    //Permutations
    static void permutations(String s, String ans){
        if(s.length() == 0){
            System.out.print(ans);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String rest = s.substring(0, i) + s.substring(i + 1);
        permutations(rest, ans + ch);
        }

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
    
        System.out.println();
        
        cointoss(4," ");
        
        System.out.println();
        
        boardPath(0, 5, "");
        
        System.out.println();
        
        permutations("Hello", " ");
    }
    
    
}
