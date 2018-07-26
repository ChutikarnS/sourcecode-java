
public class Workshop01 {

    public static void main(String[] args) {
//        int a, b, c = 0;
//        a = c++; 
//        b = ++a;
//        c++;
//        b = ++c + a++;
//        a = --b + c++;
//        
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
        
        int x1 = 2;
        int x2 = 0;
        int y1 = 1;
        int y2 = 0;
        int z1 = 3;
        int z2 = 6;
        
        double x = Math.pow((x1-x2), 2);
        double y = Math.pow((y1-y2), 2);
        double z = Math.pow((z1-z2), 2);
        
        System.out.println(Math.sqrt(x + y +z));
        
    }

}
