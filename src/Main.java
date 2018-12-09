import java.util.Scanner;

public class Main {
    static Param param[];

    public static void main(String[] args) {


        Ens_Arrey ens = new Ens_Arrey();
        Scanner sca = new Scanner(System.in);


        param = new Param[]{
                //-----------------------------------------------------------------------
                new Param() {
                    @Override
                    public void Action() {

                        super.Action();


                        String str = sca.nextLine();
                        ens.ProgramExit(str);

                        try {
                            ens.setMaxSizeArray(getInteger(str));

                        } catch (NumberFormatException e) {

                            System.out.println("Incorrect number Integer for " + getTextParam());
                        } catch (NullPointerException x) {

                            System.out.println("Incorrect number Integer for " + getTextParam());


                        }


                    }

                    @Override
                    public String getTextParam() {
                        return "Array.MaxSize";
                    }
                },


//-----------------------------------------------------------------------

                new Param() {
                    @Override
                    public void Action() {
                        super.Action();


                        String str = sca.nextLine();
                        ens.ProgramExit(str);

                        if (str != null) {

                            try {
                                ens.setArray(str.split(" ", ens.getMaxSizeArray()));

                            } catch (NumberFormatException e) {

                                System.out.println("Incorrect numbers for the array !");

                            }


                        }

                    }

                    @Override
                    public String getTextParam() {
                        return "Add_numbers_to_array";
                    }
                },
                //-----------------------------------------------------------------------
                new Param() {
                    @Override
                    public void Action() {

                        super.Action();

                        System.out.println("" + ens.getMinNamber() + "");


                    }

                    @Override
                    public String getTextParam() {
                        return "Minimum_number_in_the_array";
                    }
                },

                //-----------------------------------------------------------------------
                new Param() {
                    @Override
                    public void Action() {
                        super.Action();

                        System.out.println(ens.getMaxNamber());
                    }

                    @Override
                    public String getTextParam() {
                        return "Maximum_number_in_the_array";
                    }
                },


                //-------------------------------------------------------
                new Param() {
                    @Override
                    public void Action() {

                        super.Action();

                        System.out.print(ens.getReiteration());


                    }

                    @Override
                    public String getTextParam() {
                        return "Size.Reiteration";
                    }
                },
                //---------------------------------------------------
                new Param() {
                    @Override
                    public void Action() {

                        super.Action();
                        ens.sort();


                    }

                    @Override
                    public String getTextParam() {
                        return "Sorting";
                    }
                },

                //
                new Param() {
                    @Override
                    public void Action() {
                        super.Action();
                        getConsoleInfo();
                    }

                    @Override
                    public String getTextParam() {
                        return "Help";
                    }
                },

                //-----------------------------------------------------------------------

                new Param() {
                    @Override
                    public void Action() {

                        ens.ProgramExit(ens.getExit());
                    }

                    @Override
                    public String getTextParam() {
                        return "Exit (" + ens.getExit() + ")";
                    }
                }};
//---------------------------------------------------------------------------------------------------------
//Welcome---------------------------------------------------------------------------------------------
        System.out.println("Welcome homeWork 3 ");
        getConsoleInfo();
//Main-----------------------------------------------------------------------------------------------------
        while (true) {

            String str = sca.nextLine();
            ens.ProgramExit(str);

            Integer i = getInteger(str);
            if (i != null) {

                if (i.intValue() < 1 || i.intValue() > param.length) {
                    System.out.println("Outside the parameters area !");
                } else {

                    param[i.intValue() - 1].Action();
                }
            } else {
                System.out.println("Incorrect number Integer !");
            }


            if (str != null && str.equals(ens.getExit())) break;
        }
        sca.close();


    }

    //----------------Fun--------------------------------------------------------------------------------------------------
    public static void getConsoleInfo() {


        String action[] = new String[]{};
        String s = "Console :";
        for (int p = 0; p < param.length; p++) {

            s += "\n[" + (p + 1) + "]" + param[p].getTextParam();


        }
        System.out.println(s);


    }

    public static Integer getInteger(String s) {
        Integer i = null;
        try {
            i = Integer.valueOf(s);
        } catch (NumberFormatException e) {
            return null;
        }
        return i;
    }

}
