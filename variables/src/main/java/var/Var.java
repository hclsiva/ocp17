package var;

/**
 * This Code Compiles. No error is thrown.
 * var is not a keyword in java
 *
 * Do not use var as a variable name in any java class. Not a neat code.
 *
 */
public class Var {
    public void var(){
        var var = "var";
    }
    public void Var(){
        Var var = new Var();
    }

    public static void main(String[] args) {
        Var var = new Var();
        var.Var();
    }
}
