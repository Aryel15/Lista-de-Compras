package ListadeCompras;

import javax.swing.*;
import java.util.ArrayList;

public class funcionalidades {
    static ArrayList<String> lista = new ArrayList<>();
    static String[] options1 = {"Sim", "Não"};
    static String[] options = {"Adicionar item", "Remover item", "Sair"};
    static String itens = "";

    //Menu da lista de compras
    public static void mostrarLista(){
        //mostra as opções de adicionar itens, remover itens ou sair
        int listar = JOptionPane.showOptionDialog(null, "Lista de Compras\n" + mostraritens(), "Lista de compras",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        //verifica qual das opções foi escolhida
        if(listar == 0) {
            adicionar();
        }
        else if(listar == 1) {
            remover();
        }
    }

    //método para adicionar item
    public static void adicionar(){
        //recebe o item
        lista.add(JOptionPane.showInputDialog("Digite o nome do item: "));
        //pergunta se deseja adicionar mais um item
        int adicionar = JOptionPane.showOptionDialog(null, "Deseja adicionar mais um item a lista?", "Lista de compras",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options1, options1[0]);
        //verifica se irá adicionar ou não
        if (adicionar == 0){
            //repete o método
            adicionar();
        }else {
            //volta para o menu
            mostrarLista();
        }
    }

    //método para remover item
    public static void remover(){
        //recebe o item
        lista.remove(JOptionPane.showInputDialog("Digite o nome do item: "));
        //pergunta se deseja remover mais um item
        int remover = JOptionPane.showOptionDialog(null, "Deseja remover mais um item a lista?", "Lista de compras",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options1, options1[0]);
        //verifica se irá remover ou não
        if (remover == 0){
            //repete o método
            remover();
        }else {
            //volta para o menu
            mostrarLista();
        }
    }

    //mostra os itens da lista
    public static String mostraritens(){
        itens = "";
        //adiciona os itens em uma variavel deixando um em cada linha
        for (int i=0; i < lista.size(); i++){
            String s = lista.get(i) + "\n";
            itens = itens + s;
        }
        return itens;
    }

    public funcionalidades(ArrayList<String> lista, String[] options1, String[] options) {
        this.lista = lista;
        this.options1 = options1;
        this.options = options;
    }

    public ArrayList<String> getLista() {
        return lista;
    }
    public void setLista(ArrayList<String> lista) {
        this.lista = lista;
    }
    public String[] getOptions1() {
        return options1;
    }
    public void setOptions1(String[] options1) {
        this.options1 = options1;
    }
    public String[] getOptions() {
        return options;
    }
    public void setOptions(String[] options) {
        this.options = options;
    }
}
