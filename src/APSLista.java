
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;



public class APSLista {

   
    public static void main(String[] args) throws ParseException {
        
        
        
        PessoaFisica p = new PessoaFisica();
        Date d = new Date();
        
        PessoaFisica f1 = new PessoaFisica();
        f1.setNome("Conceição Alves");
        f1.setCpf("000.000.000-00");
       

        
        PessoaFisica f2 = new PessoaFisica();
        f2.setNome("Jonas");
        f2.setCpf("123.456.789-00");
        

        /* PESSOA JURIDICA 01*/
        PessoaJuridica j1 = new PessoaJuridica();
        j1.setNome("LilaBurguer");
        j1.setCnpj("11.222.333/4444-55");
       
        
        /* PESSOA JURIDICA 02*/
        PessoaJuridica j2 = new PessoaJuridica();
        j2.setNome("SK_industries");
        j2.setCnpj("11.000.000/4444-55");
        
        ColecaoPessoa.getInstance().inserir(f1);
        ColecaoPessoa.getInstance().inserir(f2);
        ColecaoPessoa.getInstance().inserir(j1);
        ColecaoPessoa.getInstance().inserir(j2);
        
        System.out.println(ColecaoPessoa.getInstance().colecaoEstaVazia());
        
        ColecaoPessoa.getInstance().removerUltimo();
        
        System.out.println("");
        ColecaoPessoa.getInstance().imprimirDadosColecao();
        
        ColecaoPessoa.getInstance().remover(1);
        System.out.println("");
        ColecaoPessoa.getInstance().imprimirDadosColecao();
        
        ColecaoPessoa.getInstance().atualizar(1, j2);
        
        System.out.println(ColecaoPessoa.getInstance().pesquisar(f1));
        
        
    }
    
}
