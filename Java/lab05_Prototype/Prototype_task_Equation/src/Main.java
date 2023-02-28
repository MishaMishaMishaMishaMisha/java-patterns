import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        List<Equation> equations = new ArrayList<>();
        equations.add(new Equation(-5,2));
        equations.add(new SquareEq(12,7,-3));
        equations.add(new BiSquareEq(1, 2, 3, 4, 5));

        for (Equation equation : equations) {
            System.out.println(equation);
        }


        List<Equation> equationsCopy = new ArrayList<>();
        for (Equation equation : equations) {
            equationsCopy.add(equation.clone());
        }

        System.out.println("==== Copies ====");
        for (Equation equation : equationsCopy) {
            System.out.println(equation);
        }


    }
}