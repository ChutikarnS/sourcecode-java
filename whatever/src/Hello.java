public class Hello {

    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.say(100);
    }
    //Constant
    private static final int NUMBER_TWO = 2;
    //Class Variable
    public static int index = 1;
    //Instance variable
    private int number = 3;

    private void say(int number) {
        // TODO Auto-generated method stub
        int index = 0;
        System.out.println(index);
        System.out.println(Hello.index);
        System.out.println(number);
        System.out.println(this.number);
        System.out.println(NUMBER_TWO);
    }

}
