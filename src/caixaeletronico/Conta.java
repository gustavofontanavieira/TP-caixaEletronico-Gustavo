
package caixaeletronico;

public class Conta {
    
    /*
    ATRIBUTOS: SÃO ESTRUTURAS QUE REPRESENTAM 
    OS DADOS DA CLASSE. EX.: AGENCIA, CONTA, SALDO, SENHA
    ATRIBUTOS POSSUEM DUAS ESTRUTURAS BÁSICAS: VISIBILIDADE E TIPO DE DADO
    VISIBILIDADE: DEFINE O NÍVEL DE ACESSO NO PROJETO
    TIPO DE DADO: DEFINE A CAPACIDADE DE ARMAZENAMENTO DE DADO DO ATRIBUTO.
    */
    /*
    DECLARAÇÃO DOS ATRIBUTOS DA CLASSE CONTA
    ESTRUTURA DE DECLARAÇÃO DE UM ATRIBUTO:
    1º PARTE - VISIBILIDADE
    2º PARTE - TIPO
    3º PARTE - NOME
    OPICIONAL:
    4º PARTE - ATRIBUIÇÃO DE VALOR OU DE DADO
    */
    /*
    TIPOS DE VISIBILIDADES:
    PUBLIC - PERMITE ACESSO DE QUALQUER ESTRUTURA DO CÓDIGO
    PROTECTED
    PRIVATE
    */
    public String agencia = "000-20-X";
    public String nroConta = "1234-0002-B";
    public float saldo = 6000;
    
    
    /*
    MÉTODOS: SÃO ESTRUTURAS QUE REPRESENTAM AS
    AÇÕES QUE A CLASSE É CAPAZ DE EXECUTAR.
    VERIFICAR SALDO, REALIZAR DEPÓSITO, REALIZAR SAQUE
    
    DECLARAÇÃO DE MÉTODOS:
    1º PARTE - VISIBILIDADE
    2º PARTE - TIPO RETORNO DO MÉTODO
    3º PARTE - NOME DO MÉTODO
    4º PARTE  - CABEÇALHO DE PARAMETROS
    5º PARTE - CORPO DO MÉTODO
    */
    public void verificarSaldo(){
    
        //SÁIDA DE TEXTO DO MÉTODO verificarSaldo:
        System.out.println("SEU SALDO ATUAL É: " + this.saldo);
    
    }//FECHAMENTO DO MÉTODO
    
    /*MÉTODO DE REALIZAR DEPOSITO*/
    public void realizarDeposito(float valor){
    
        /*PRIMEIRA FORMA*/
        //this.saldo = this.saldo + valor;
        
        /*SEGUNDA FORMA*/
        this.saldo += valor;
        
    }
    
    /*MÉTODO DE REALIZAR SAQUE*/
    public void realizarSaque(float valor){
    
        this.saldo -= valor;
    
    }
    
   
}//FECHAMENTO DA CLASSE