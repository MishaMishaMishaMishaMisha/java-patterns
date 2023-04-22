public class Client {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 3, 3);
        System.out.println("Volume = " + triangle.square());

        Caretaker caretaker = new Caretaker(triangle);
        caretaker.save();

        Command commandA = new CommandChangeA(triangle);
        Command commandB = new CommandChangeB(triangle);
        Command commandC = new CommandChangeC(triangle);

        EdgeChanger edgeChanger = new EdgeChanger();
        edgeChanger.setCommandA(commandA);
        edgeChanger.setCommandB(commandB);
        edgeChanger.setCommandC(commandC);



        String[] edges = {"b", "c", "a", "duplicateA", "c", "b", "halfA"};
        float[] values = {4, 5, 4, 1, 6, 3, 1};

        float minSquare = triangle.square();
        float temp;

        for (int index = 0; index < edges.length; index++) {
            switch (edges[index]) {
                case "a":
                    //triangle.setA(values[index]);
                    edgeChanger.setA(values[index]);
                    break;
                case "b":
                    //triangle.setB(values[index]);
                    edgeChanger.setB(values[index]);
                    break;
                case "c":
                    //triangle.setC(values[index]);
                    edgeChanger.setC(values[index]);
                    break;
                case "duplicateA":
                    edgeChanger.duplicateA();
                    //triangle.duplicateA();
                    break;
                case "duplicateB":
                    edgeChanger.duplicateB();
                    //triangle.duplicateB();
                    break;
                case "duplicateC":
                    edgeChanger.duplicateC();
                    //triangle.duplicateC();
                    break;
                case "halfA":
                    edgeChanger.halfA();
                    //triangle.halfA();
                    break;
                case "halfB":
                    edgeChanger.halfB();
                    //triangle.halfB();
                    break;
                case "halfC":
                    edgeChanger.halfC();
                    //triangle.halfC();
                    break;

            }

            caretaker.save();

            temp = triangle.square();
            if (minSquare >= temp) {
                minSquare = temp;
            }
            System.out.println("Volume = " + temp);

        }

        System.out.println("\n");
        for (int i = 0; i < edges.length; i++) {
            if (Math.abs(triangle.square() - minSquare) < 0.0000001) {
                break;
            }
            caretaker.undo();
        }

        System.out.printf("Min Volume (%f) has triangle with edges: %f, %f, %f", minSquare, triangle.getA(), triangle.getB(), triangle.getC());


    }

}