public class Main {
    public static void main(String[] args) {
        Caixa caixa = new Caixa();

        caixa.altura = 10;
        caixa.largura = 10;
        caixa.profundidade = 35; 

        System.out.println(caixa.calcularVolume());

        Data data = new Data(19, 12, 2023);
        System.out.println(
        data.formatarData(data.dia,data.mes,data.ano, "/")
        );
        
        Lampada lampada = new Lampada();
        lampada.acender();
        lampada.mostrarEstado();
        lampada.apagar();
        lampada.mostrarEstado();
    }
}
