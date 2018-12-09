import java.util.Arrays;


public class Ens_Arrey {


    private String exit = "x";


    public String getExit() {
        return exit;
    }

    public void setExit(String exit) {
        if (exit == null || exit.length() == 0) {
            this.exit = "x";
            System.out.println("Param \" EXIT \" changed on default \" x \" ! ");
            return;
        }
        this.exit = exit;
        System.out.println("Param \" EXIT \" changed on  \" " + exit + " \" ! ");

    }

    public void ProgramExit(String x) {
        if (x != null && x.equals(this.getExit())) {
            this.ProgramExit();
        }
    }

    public void ProgramExit() {

        System.out.println("System.exit. Thanks for the test");
        System.exit(0);

    }


    private int maxSizeArray = 3;

    public int getMaxSizeArray() {
        return maxSizeArray;
    }

    public void setMaxSizeArray(int maxSizeArray) {

        if (maxSizeArray < 1) {
            this.maxSizeArray = 1;
            System.out.println("Param \" MaxSizeArray \" changed on default \" 1 \" ! ");
            return;
        }
        this.maxSizeArray = maxSizeArray;
        System.out.println("Param \" MaxSizeArray \" changed on  \" " + maxSizeArray + " \" ! ");

        if (maxSizeArray < this.getArray().length) {

            int newM[] = new int[maxSizeArray];
            for (int i = 0; i < newM.length; i++) {
                newM[i] = this.getArray()[i];


            }
            this.setArray(newM);
        }
    }


    private int[] Array = new int[0];

    public int[] getArray() {
        return Array;
    }


    public void setArray(String array[]) {

        int a[] = new int[array.length];
        for (int i = 0; i < array.length; i++) {

            a[i] = Integer.valueOf(array[i]).intValue();

        }

        setArray(a);
    }

    public void setArray(int array[]) {

        if (array == null || array.length == 0) {
            this.Array = new int[0];
            System.out.println("Array Removed !");
            return;

        }


        if (array.length > this.getMaxSizeArray()) {
            System.out.println("Error : Invalid array size !" + "new [" + array.length + "] max [" + getMaxSizeArray() + "] ");
            return;
        }

        Array = array;
        System.out.println("Array change success");
        return;
    }


    public Integer getMinNamber() {

        if (this.getArray().length == 0) {
            System.out.println("The array is empty");
            return null;
        }

        int m = this.getArray()[0];
        for (int i : this.getArray()) {
            if (m > i) m = i;
        }

        return m;
    }

    public Integer getMaxNamber() {

        if (this.getArray().length == 0) {
            System.out.println("The array is empty");
            return null;
        }


        int m = this.getArray()[0];
        for (int i : this.getArray()) {
            if (m < i) m = i;
        }

        return m;
    }


    public String getReiteration() {

        if (this.getArray().length == 0) {
            System.out.println("The array is empty");

        }

        String ret = "";


        Integer ignor[] = new Integer[this.getArray().length];
        for (int i = 0; i < this.getArray().length; i++) {

            boolean b = true;
            for (Integer i0 : ignor) {
                if (i0 != null && i0.intValue() == this.getArray()[i]) {
                    b = false;
                    break;
                }

            }


            if (b) {
                int ref = 0;
                for (int i2 = (i + 1); i2 < this.getArray().length; i2++) {
                    if (this.getArray()[i] == this.getArray()[i2]) {
                        ref++;


                    }
                }

                if (ref > 0) {
                    ret += "\nNumber " + this.getArray()[i] + " r :" + (ref + 1);
                    ignor[i] = this.getArray()[i];

                }
            }
        }


        return ret;
    }


    public void printMassiv(int Massiv[]) {
        if (Massiv == null) return;

        for (int i : Massiv) {

            System.out.println("[" + i + "]");

        }

    }

    public void printMassiv() {

        for (int i : this.getArray()) {

            System.out.println("[" + i + "]");

        }

    }


    public void sort() {

        if (this.getArray().length == 0) {
            System.out.println("Nothing to sort. The array is empty");
            return;
        }

        Arrays.sort(this.getArray());
        System.out.println("Array successfully sorted");


    }
}
