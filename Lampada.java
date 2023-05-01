public class Lampada {

    public boolean acesa;

public void acender(){
    this.acesa = true;
}
public void apagar(){
    this.acesa = false;
}
public void mostrarEstado(){
    if(this.acesa){
        System.out.println("lampada acesa");
    }
    else{
        System.out.println("lampada apagada");
    }
}
}

