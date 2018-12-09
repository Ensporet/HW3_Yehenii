public abstract class Param {

    public void Action() {

        System.out.println(this.getTextParam() + ":");

    }

    ;

    public abstract String getTextParam();


    @Override
    public String toString() {
        return super.toString();
    }
}

