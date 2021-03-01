
import java.util.Date;
import java.util.Objects;
import java.util.concurrent.TimeUnit;


public class PessoaFisica extends Pessoa{

    private String cpf;
    private Date dataNascimento;

    public PessoaFisica(){
    }

    public PessoaFisica(String cpf, Date dataNascimento, String nome) {
        super(nome);
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.cpf);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PessoaFisica other = (PessoaFisica) obj;
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        return true;
    }

      
    @Override
    public boolean validarDocumento( ) {
        if(this.cpf.length() == 14){
            System.out.println("Documento válido!"); 
            return true;
        }else{          
            System.out.println("Documento inválido!");
            return false;
        }    
    }

    @Override
    public int calcularIdade() {
        Date d = new Date();
        long dMil = Math.abs(this.getDataNascimento().getTime() - d.getTime());
        long diff = TimeUnit.DAYS.convert(dMil, TimeUnit.MILLISECONDS);
        int idade =(int) diff/365;
        return idade;
    }
    
}
