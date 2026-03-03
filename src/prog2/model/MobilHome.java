package prog2.model;

public class MobilHome extends Casa{
    //Atributs
    private boolean terrassa, barbacoa;

    public MobilHome(String nom, String idAllotjament,String mida, int numHabitacions, int capacitat, boolean terrassa, boolean barbacoa) {
        super(nom, idAllotjament, 5, 3, mida, numHabitacions, capacitat);
        this.terrassa = terrassa;
        this.barbacoa = barbacoa;
    }

    public boolean getTerrassa(){
        return terrassa;
    }

    public boolean getBarbacoa(){
        return barbacoa;
    }

    public void setTerrassa(boolean terrassa){
        this.terrassa = terrassa;
    }

    public void setBarbacoa(boolean barbacoa){
        this.barbacoa = barbacoa;
    }

    @Override
    public boolean correcteFuncionament() {
        boolean correcteFuncionament = false;
        if(terrassa && barbacoa){
            correcteFuncionament = true;
        }
        return correcteFuncionament;
    }
}
