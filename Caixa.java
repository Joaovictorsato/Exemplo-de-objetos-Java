public class Caixa{

    int altura, largura, profundidade;

    public Caixa(){
        altura=0;
        largura=0;
        profundidade=0;
    }
    public int calcularVolume(){
        int volume;
        volume = (altura * largura * profundidade);
        return volume;
    }
}