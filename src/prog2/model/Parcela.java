package prog2.model;

public class Parcela extends Allotjament {
    //Atributs
    private float mida;
    private boolean ConnexioElectrica;

    public Parcela(String nom, String idAllotjament, float mida, boolean ConnexioElectrica){
        super(nom,idAllotjament,4,2);
        this.mida = mida;
        this.ConnexioElectrica = ConnexioElectrica;
    }

    public float getMida(){
        return this.mida;
    }

    public boolean isConnexioElectrica(){
        return this.ConnexioElectrica;
    }

    public void setMida(float mida){
        this.mida = mida;
    }
    public void setConnexioElectrica(boolean ConnexioElectrica){
        this.ConnexioElectrica = ConnexioElectrica;
    }

    @Override
    public boolean correcteFuncionament(){
        //Si la parcel·la te un punt de connexió elèctrica això significa que funciona correctament.
        boolean correcteFuncionament = false;
        if (ConnexioElectrica){
            correcteFuncionament = true;
        }
        return correcteFuncionament;
    }
}
