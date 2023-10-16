
public class Patente {
    
    //Attributi

    private String Nome;
    private int Eta;
    private int data1;
    private int data2;

 
    //Costruttore

    
    
    public Patente(String nome, int eta, int data1, int data2) {
        this.Nome = nome;
        this.Eta = eta;
        this.data1 = data1;
        this.data2 = data2;
    }
    

    public Patente() {
        this.Nome = "";
        this.Eta = 0;
        this.data1 = 0;
        this.data2 = 0;
    }

    public Patente(Patente that) {
        this.Nome = that.Nome;
        this.Eta = that.Eta;
        this.data1 = that.data1;
        this.data2 = that.data2;
    }


    //Setter&Getter


    public String getNome() {
        return Nome;
    }


    public void setNome(String nome) {
        Nome = nome;
    }


    public int getEta() {
        return Eta;
    }


    public void setEta(int eta) {
        Eta = eta;
    }


    public int getData1() {
        return data1;
    }


    public void setData1(int data1) {
        this.data1 = data1;
    }


    public int getData2() {
        return data2;
    }


    public void setData2(int data2) {
        this.data2 = data2;
    }

    //To string()
    @Override
    public String toString() {
        return "Patente [Nome=" + Nome + ", Eta=" + Eta + ", data1=" + data1 + ", data2=" + data2 + "]";
    }




























}
