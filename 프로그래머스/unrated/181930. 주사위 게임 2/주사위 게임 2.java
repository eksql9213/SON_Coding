class Solution {
    public int solution(int a, int b, int c) {
        
        if(a!=b && b!=c && c!=a) {
            return a+b+c;
        } else if(a==b && b==c && c==a) {
            return (int)(a+b+c)*(a*a+b*b+c*c)*(a*a*a+b*b*b+c*c*c);
        } else {
            return (int)(a+b+c)*(a*a+b*b+c*c);
        }
        
    }
}