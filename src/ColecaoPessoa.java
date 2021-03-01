
import java.util.LinkedList;

public class ColecaoPessoa implements Colecao{
    private int posicaoCorrente;
    private LinkedList dados = new LinkedList();

    private static ColecaoPessoa instance = new ColecaoPessoa();
    
    private ColecaoPessoa() {}
    
    private ColecaoPessoa(int posicaoCorrente) {
        this.posicaoCorrente = posicaoCorrente;
    }

    public static ColecaoPessoa getInstance(){
        return instance;
    }

    @Override
    public boolean inserir(Pessoa p) {
        if(dados.size()<100){
            dados.add(p);
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public boolean removerUltimo() {
        if(dados.size()>0){
            dados.removeLast();
            return true;
        }
        else{
            System.out.println("Lista vazia!");
            return false;
        }  
    }

    @Override
    public boolean remover(int indice) {
        if(dados.size()>0){
            dados.remove(indice);
            return true;
        }
        else{
            System.out.println("Lista vazia!");
            return false;
        }    
    }

    @Override
    public void atualizar(int indice, Pessoa p) {
        if(dados.size()>0){
            dados.set(indice, p);   
        }
        else{
            System.out.println("Lista vazia!");
        }
    }

    @Override
    public boolean pesquisar(Pessoa p) {
        if(dados.size()>0){
            dados.contains​(p);
            return true;
        }
        else{
            return false;
        }
    }

    public boolean CompararCPF(){
        int x=0, y;
        while(x!=dados.size()){
            y=0;
            while(y!=dados.size()){
                PessoaFisica p = (PessoaFisica) dados.get(x);
                PessoaFisica p1 = (PessoaFisica) dados.get(y);
                
                if(p.getCpf() == p1.getCpf()){
                    return true;
                }
                y++;
            }
            x++;
        }
        return false;
    }
    
    @Override
    public boolean colecaoEstaVazia() {
        if(dados.size()>0){
            return false;
        }
        else{
            return true;
        }
    }

    @Override
    public void imprimirDadosColecao() {
        int x=0;
        do{
            System.out.println(dados.get(x));
            x++;
        }while(x!=dados.size());
    }

    @Override
    public Pessoa retornarObjeto(int indice) {
        return (Pessoa) dados.get(indice);
    }
    
}
