package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        for(int heitght = 1; heitght <= cathetusLength; heitght++) {
            for(int leftSide = cathetusLength; leftSide > 0; leftSide--) {
                if(leftSide > heitght) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
