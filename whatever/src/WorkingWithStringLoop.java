
public class WorkingWithStringLoop {

    public static void main(String[] args) {
        String name = "Chutikarn";
//        System.out.println(name.substring(0, 1));
        while (name.length()>0) {
//          System.out.println(name.charAt(i));
//            System.out.println(name.substring(i, i+1));
            
            System.out.println(name.substring(0, 1));
            name = name.substring(1);
        }
        

    }

}
