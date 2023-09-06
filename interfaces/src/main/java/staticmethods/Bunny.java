package staticmethods;

public class Bunny implements Hop{
    public void printDetails(){
        /// System.out.println(getJumpHeight); // Does not compile
        System.out.println(Hop.getJumpHeight());
    }
}
