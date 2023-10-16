public class Persona
{

  // attributi

  private String nome;
  private int eta;



  // metodo costruttore 

  public Persona(String nome, int eta) {
    this.nome = nome;
    this.eta = eta;
}


  public Persona ()
  {

    this.nome = "";
    this.eta = 0;

  }

  public Persona (Persona That)
  {

    this.nome = That.nome;
    this.eta = That.eta;

  }

  //metodo getter e setter

public String getNome() {
    return nome;
}


public void setNome(String nome) {
    this.nome = nome;
}


public int getEta() {
    return eta;
}


public void setEta(int eta) {
    this.eta = eta;
}


//to string
@Override
public String toString() {
    return "Persona [nome=" + nome + ", eta=" + eta + "]";
}



//equals
@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((nome == null) ? 0 : nome.hashCode());
    result = prime * result + eta;
    return result;
}


@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Persona other = (Persona) obj;
    if (nome == null) {
        if (other.nome != null)
            return false;
    } else if (!nome.equals(other.nome))
        return false;
    if (eta != other.eta)
        return false;
    return true;
}

}

