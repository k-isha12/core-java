public class Days{
    public static void main(String[] args){
        conversion(1977,3,16,2026,6,8);
    }
    static void conversion(int y1, int m1, int d1, int y2, int m2, int d2){
    int y, m, d;
    if(d2 < d1){
        //borrow 1 month
        d2 += 30;
        m2--;
    }
    d = d2 - d1;
    if(m2 < m1){
        //borrow 1 year
        m2 += 12;
        y2--;
    }
    m = m2 - m1;
    y = y2 - y1;
    System.out.println("Years  : " + y);
    System.out.println("Months : " + m);
    System.out.println("Days   : " + d);
    }
}