public class VarType {
    // var myName = "OCP17"; // does not compile

    public void doesThisCompile(boolean check){
        // var question; // Need to initialize during the declaration
        // question =1;

    }
    public static void main(String[] args) {
        var myName = "OCP17";
        var myVersion = 17;
        myVersion = 18;
        myVersion = 17;
        // var a = null; // does not compile
        // int a, var b = 3; // does not compile


        // myVersion = "OCP17"; // Does not compile


        System.out.println("Exercise for var type");
    }
}
