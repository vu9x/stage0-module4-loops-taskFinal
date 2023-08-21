package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for(int heitght = 1; heitght <= cathetusLength; heitght++) {
            for(int leftSide = cathetusLength; leftSide > 0; leftSide--) {
                if(leftSide > heitght) {
                    System.out.print(" ");
                } else {
                    System.out.print(leftSide);
                }
            }

            for(int rightSide = 2; rightSide <= cathetusLength; rightSide++) {
                if(rightSide <= heitght) {
                    System.out.print(rightSide);
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println("");
        }

    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
