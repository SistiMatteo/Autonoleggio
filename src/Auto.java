public class Auto{
    
    //Attributi

    private int codice;
    private String targa;
    private String marca;
    private String modello;
    private int posti;

    //Metodo costruttore

    public Auto(int codice, String targa, String marca,String modello,int posti) {
        this.codice = codice;
        this.targa = targa;
        this.marca = marca;
        this.modello = modello;
        this.posti = posti;

}

public Auto() {
    this.codice = 000;
    this.targa="";
    this.marca = "";
    this.modello = "";
    this.posti = 0;
}

public Auto(Auto that) {
    this.codice = that.codice;
    this.targa = that.targa;
    this.marca = that.marca;
    this.modello = that.modello;
    this.posti = that.posti;
}

  // Metodo getter per ottenere il codice della macchina
  public int getCodice() {
    return codice;
}
// Metodo setter per impostare il codice della macchina
public void setCodice(int codice) {
    this.codice = codice;
}
//////////////////////////////////////////////////////////

// Metodo getter per ottenere la targa della macchina
 public String getTarga() {
    return targa;
}
// Metodo setter per impostare la targa della macchina
public void setTarga(String targa) {
    this.targa = targa;
}
///////////////////////////////////////////////////////

// Metodo getter per ottenere la marca del telecomando
public String getMarca() {
    return marca;
}
// Metodo setter per impostare la marca del telecomando
public void setMarca(String marca) {
    this.marca = marca;
}
 ///////////////////////////////////////////////////////////   
    
// Metodo getter per ottenere il modello della macchina
public String getModello() {
    return modello;
}
// Metodo setter per impostare il modello della macchina
public void setModello(String modello) {
    this.modello = modello;
}
 /////////////////////////////////////////////////////////////   
     
 // Metodo getter per ottenere il codice della macchina
public int getPosti() {
    return posti;
}
// Metodo setter per impostare il codice della macchina
public void setPosti(int posti) {
    this.posti = posti;
} 
    
    







































}