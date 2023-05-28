import java.util.Scanner;
public class Usuario extends Sistema{
    
Scanner sc = new Scanner(System.in);
    //testando
    public String id;
    public int senha;
    public int sal;
    public int salini=328;
    
    public int dsac = 0;
    public int calc1;
    
    public void depositar(){
        
        int dep, calc2;
        
        System.out.println("diga quanto deseja depositar: ");
        dep = sc.nextInt();
        calc2 = sal + dep;
        sal = calc2;
        System.out.println("valor depositado, agora seu saldo é de: " + sal);
        
    }
    
    public void verSaldo(){
        System.out.println("seu saldo é de: " + sal);
    }
    
    public void sacar(){
        
        System.out.println("seu limite de saque é de " + sal + " diga quanto deseja sacar: ");
        dsac = sc.nextInt();
        
        do{
        
        if(dsac>salini){
            System.out.println("impossível, diga um valor menor: ");
            dsac = sc.nextInt();
            
        }
        
        else if(dsac < 2 || dsac ==3){
             System.out.println("impossível sacar esse valor, diga outro: ");
             dsac = sc.nextInt();
          }
        
        } while(dsac>=salini && dsac >= 2);
        
        
         
         if(dsac<salini && dsac >= 2){
        calc1 = sal - dsac;
        sal = calc1;
        System.out.println("valor sacado, agora você tem: " + sal);
        }   
        
        
    }

    
}
