
package sistemabancario;

public class ContaCorrente {

    //Atributos da classe Banco
    private Integer numeroconta;
    private String nometitular;
    private String senha;
    private Double saldo;
    private Double pix;
    private Double deposito;

    /**
     * Constrututor da classe Dados
     */
    public ContaCorrente(int numeroconta, String senha, Double saldo){

        this.numeroconta = numeroconta;
        this.senha = senha;
        this.saldo = saldo;
    }


    /**
     * Responsáveis por seter e pegar o numero da conta
     *
     */
    public Integer getNumeroconta(){
        return numeroconta;
    }

    public void setNumeroconta(Integer numeroconta){
        this.numeroconta = numeroconta;
    }
    /**
     * Responsáveis por seter e pegar o nome do titular da conta
     *
     */
    public String getNometitular() {
        return nometitular;
    }

    public void setNometitular(String nometitular) {
        this.nometitular = nometitular;
    }
    /**
     * Responsáveis por seter e pegar a senha da conta
     *
     */
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    /**
     * Responsáveis por seter e pegar o saldo da conta
     *
     */
    public Double getSaldo(){
        return saldo;
    }
    public void setSaldo(Double saldo){
        this.saldo = saldo;
    }
    /**
     * Responsáveis pela trasnferência do dinheiro(pix)
     *
     */
    public Double getPix() {
        return pix;
    }

    public void setPix(Double pix) {
        this.pix = pix;
    }
    /**
     * Responsáveis pelo depósito
     *
     */
    public Double getDeposito() {
        return deposito;
    }

    public void setDeposito(Double deposito) {
        this.deposito = deposito;
    }
}

