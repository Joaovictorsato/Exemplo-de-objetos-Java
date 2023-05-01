public class Data {
    int dia, mes, ano;

    public Data(){ 
        dia=1;
        mes=1;
        ano=0001;
    }
    public Data(int ano){ 
        this.ano = ano;
        dia=1;
        mes=1;
    }
    public Data(int dia, int mes, int ano){
        this.dia = dia; 
        this.mes = mes; 
        this.ano = ano;
    }
    public String formatarData(int dia, int mes, int ano, String tipo){
       String data =" ";
        if(tipo=="/"){
             data = dia+"/"+mes+"/"+ano;
        
        }
        else if(tipo=="-"){
             data = dia+"-"+mes+"-"+ano;
        }
       return data;
    }
    
}
