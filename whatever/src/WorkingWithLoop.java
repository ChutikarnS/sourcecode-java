
public class WorkingWithLoop {

    public static void main(String[] args) {
        
        for(int i = 1; i < 11; i++) {
            System.out.println(i);
        }
        
        int i = 0;
        while(i < 5) {
            System.out.println(i);
            i++;
        }
        
        i = 0;
        do {
            System.out.println(i);
            i++;
        }while(i < 5);
    }

}
