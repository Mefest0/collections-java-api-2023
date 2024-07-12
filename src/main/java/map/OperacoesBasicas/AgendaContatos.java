package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome,telefone);
    }
    public void removerContato(String nome){
        if(agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.get(nome);
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args){
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Sergio", 12345678);
        agendaContatos.adicionarContato("Sergio da z", 12345);
        agendaContatos.adicionarContato("Sergio M", 123456);
        agendaContatos.adicionarContato("SergioM", 454545);
        agendaContatos.adicionarContato("Sergio MB", 787878);
        agendaContatos.adicionarContato("Sergio Ted", 12345678);
        agendaContatos.adicionarContato("Sergio Zap", 1234);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Sergio MBZ");
        agendaContatos.exibirContatos();

        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Sergio MB"));
    }
}
