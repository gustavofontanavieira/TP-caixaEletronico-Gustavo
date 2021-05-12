package caixaeletronico;
import java.util.Scanner;
public class Menu2 {
    public void executarMenu(){
        System.out.println("---------MENU2 COM SWITCH---------");
        
        System.out.println("ESCOLHA UMA OPÇÃO: ");
        System.out.println("1 - SALDO");
        System.out.println("2 - DEPOSITO");
        System.out.println("3 - SAQUE");
        
        Scanner objScanner = new Scanner(System.in);
        Conta objConta = new Conta();
        
        int operacao = objScanner.nextInt();
        float valor = 0;
        
        switch(operacao){
            case 1: objConta.verificarSaldo();
                break;
                
            case 2:System.out.println("digite um valor de depósito: ");
              valor = objScanner.nextFloat();
              objConta.realizarDeposito(valor);
              objConta.verificarSaldo();
                break;
                
            case 3: System.out.println("digite o valor que será retirado:");
              valor = objScanner.nextFloat();
              objConta.realizarSaque(valor);
              objConta.verificarSaldo();
                break;
              
            default:System.out.println("OCORREU UM ERRO!!!");
   
        }
    }  
}
