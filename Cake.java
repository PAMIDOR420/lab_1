public class Cake extends Food {

    private String icing;

    public String getSize(){
        return getSize();
    }

    public Cake(String icing){
        super ("Cake");
        this.icing = icing;
    }

    @Override
    public String toString() {
        return super.toString() + " icing '" + icing.toUpperCase() + "'";
    }
}
