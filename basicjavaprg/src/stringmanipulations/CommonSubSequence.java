package stringmanipulations;

/*
 * public class CommonSubSequence {
 * 
 * public static void main(String[] args) { String s1 = new String("ABCBDACB");
 * String s2 = new String("BDCAB");
 * 
 * int m = s1.length(); int n = s2.length();
 * 
 * String lcs = LCS(s1,s2,m,n); System.out.println("Lenght of LCS: " +
 * (lcs.length()-1)); System.out.println("LCS: " + lcs); }
 * 
 * private static String LCS(String s1,String s2, int m, int n) { if(m==0 ||
 * n==0) { return " "; } if(s1.charAt(m-1)==s2.charAt(n-1)) { return
 * LCS(s1,s2,m-1,n-1)+s1.charAt(m-1); } String lcs1 = LCS(s1,s2,m-1,n); String
 * lcs2 = LCS(s1,s2,m,n-1);
 * 
 * return lcs1.length() > lcs2.length() ? lcs1 : lcs2; } }
 */


public class CommonSubSequence {

    public static void main(String[] args) {
        String s1 = "bvfhbvdjxzhellohcbvfrndck";
        String s2 = "hello";
        
        String lcs = findConsecutiveLCS(s1, s2);
        System.out.println("LCS: " + lcs);
    }
    
    private static String findConsecutiveLCS(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        StringBuilder lcs = new StringBuilder();
        
        
        int j = 0;
        
        for (int i = 0; i < m; i++) {
            if (j < n && s1.charAt(i) == s2.charAt(j)) {
                lcs.append(s1.charAt(i)); 
                j++; 
            }
            if (j == n) {
                break;
            }
        }
        
        return lcs.toString();
    }
}

