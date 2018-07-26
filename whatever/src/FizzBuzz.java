
public class FizzBuzz {

    public String sendAndReturn(int number) {
//        String result = "" + number;
        if(หารสามและห้าลงตัว(number)) {
            return "FizzBuzz";
        }
        if(หารสามลงตัว(number)) {
            return "Fizz";
        }
        if(หารห้าลงตัว(number)) {
            return "Buzz";
        }
        
        return number + "" ;
    }

    private boolean หารสามและห้าลงตัว(int number) {
        return หารสามลงตัว(number) && หารห้าลงตัว(number);
    }

    private boolean หารห้าลงตัว(int number) {
        return number%5 == 0;
    }

    private boolean หารสามลงตัว(int number) {
        return number%3 == 0;
    }

}
