package prog2.model;

public class Bungalow extends Casa{
    //Atributs
    private int numPlaces;
    private boolean aireFred;

    public int getNumPlaces() {
        return numPlaces;
    }

    public boolean getAireFred(){
        return aireFred;
    }

    public void setNumPlaces(int numPlaces){
        this.numPlaces = numPlaces;
    }

    public void setAireFred(boolean aireFred){
        this.aireFred = aireFred;
    }

    @Override
    public boolean correcteFuncionament() {
        //Si té aire fred significa que funciona correctament
        return this.aireFred;
    }
}
