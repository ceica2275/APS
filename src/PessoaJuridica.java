

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class PessoaJuridica extends Pessoa{
    private String cnpj;
    private Date dataCriacao;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String cnpj, Date dataCriacao, String nome) {
        super(nome);
        this.cnpj = cnpj;
        this.dataCriacao = dataCriacao;
    }

    public String getCnpj() {
        return cnpj;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.cnpj);
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
        final PessoaJuridica other = (PessoaJuridica) obj;
        if (!Objects.equals(this.cnpj, other.cnpj)) {
            return false;
        }
        return true;
    }
    

    @Override
    public String toString() {
        return "PessoaJuridica{" + "cnpj=" + cnpj + ", dataCriacao=" + dataCriacao + '}';
    }

    @Override
    public boolean validarDocumento( ) {
        if(this.cnpj.length() == 18){
            System.out.println("Documento válido"); 
            return true;
        }else{          
            System.out.println("Documento inválido");
            return false;
        }    
    }

    @Override
    public int calcularIdade() {
        Date d = new Date();
        long dMil = Math.abs(this.getDataCriacao().getTime() - d.getTime());
        long diff = TimeUnit.DAYS.convert(dMil, TimeUnit.MILLISECONDS);
        int idade =(int) diff/365;
        return idade;
    }
}
