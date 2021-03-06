package escalonador;

import java.util.ArrayList;

//Memoria principal com tamanho limitado que recebe processos prontos, bloqueados e executando
public class MemoriaRam{
    private int espaco;                     //tamanho fixo de 8192
    private int espacoAlocado;              //total de memoria ocupada pelos processos
    private ArrayList<Processo> listap;     //lista de processos presentes na memoria
	
    public MemoriaRam(int espaco, int espacoAlocado, ArrayList<Processo> listap){
	this.espaco = 8192;
        this.espacoAlocado = espacoAlocado;
        this.listap = listap;
    }

    public int getEspaco() {
        return espaco;
    }

    public void setEspaco(int espaco) {
        this.espaco = espaco;
    }

    public int getEspacoAlocado() {
        return espacoAlocado;
    }

    public void setEspacoAlocado(int espacoAlocado) {
        this.espacoAlocado = espacoAlocado;
    }

    public ArrayList<Processo> getListap() {
        return listap;
    }

    public void setListap(ArrayList<Processo> listap) {
        this.listap = listap;
    }
    
    
        
        
}
