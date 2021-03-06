package escalonador;

import java.util.ArrayList;

//Memoria secundaria com espaco ilimitado que recebe processos suspensos
public class MemoriaHd{     //antigo Memoria
    private int espacoAlocado;              //total de memoria ocupada pelos processos
    private ArrayList<Processo> listap;     //lista de processos presentes na memoria
	
    public MemoriaHd(int espacoAlocado, ArrayList<Processo> listap){
        this.espacoAlocado = espacoAlocado;
        this.listap = listap;
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
