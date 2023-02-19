import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {

        DefineEquation defineEquation = new DefineEquation();


        BufferedReader br = new BufferedReader(new FileReader(new File("C:\\Users\\Misha\\IdeaProjects\\design-patterns-java\\Java\\lab02_Factory_Method\\HW task 2 Equation\\src\\input01.txt")));
        ArrayList<Double> list = new ArrayList<Double>();
        String line;
        while ((line = br.readLine()) != null) {
            String[] r = line.trim().split("\\s+");
            if (r[0].equals("")) {
                break;
            }
            for (int i = 0; i < r.length; i++) {
                Double val = Double.parseDouble(r[i]);
                list.add(val);
            }


            defineEquation.setCoefs(list);
            CreateEq equation = defineEquation.define();
            double[] roots = equation.solveEq();
            for (int i = 0; i < roots.length; i++) {
                System.out.println(roots[i]);
            }
            System.out.println("");
            list.clear();
        }
        br.close();


    }
}