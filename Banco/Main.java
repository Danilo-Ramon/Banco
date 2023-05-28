import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);

    int resp, resp2, resp3, resp4, resp5, respadm, respadm2, respadm3, respadm4;

    Adm adm = new Adm ();
      adm.id = "Lameq";
      adm.senha = 000000;
      adm.sal = 328;


    Titular i1 = new Titular ();
      i1.id = "Allan";
      i1.senha = 111111;
      i1.sal = 328;


    Titular i2 = new Titular ();
      i2.id = "Kaiki";
      i2.senha = 222222;
      i2.sal = 328;

    Titular i3 = new Titular ();
      i3.id = "Danilo";
      i3.senha = 333333;
      i3.sal = 328;

    Titular i4 = new Titular ();
      i4.id = "Meilin";
      i4.senha = 444444;
      i4.sal = 328;

    Titular i5 = new Titular ();
      i5.id = "Cleitin";
      i5.senha = 555555;
      i5.sal = 328;

    Sistema caixa = new Sistema();
    
    do{

      System.out.println ("digite sua senha para ser verificado: ");
      resp = sc.nextInt ();
      
         if (resp!= 000000 && resp!= 111111 && resp!=222222 && resp!=333333 && resp!=444444 && resp!=555555){
        	    do {
        	        System.out.println("Senha incorreta, digite novamente");
        	        resp=sc.nextInt();
        	    } while (resp!= 000000 && resp!= 111111 && resp!=222222 && resp!=333333 && resp!=444444 && resp!=555555);
    	    }


    do{
            
            
        

            if (resp == 00000){
    	         System.out.println ("ola! " + adm.id + " o que deseja fazer?");
    	         System.out.println("digite 1 para verificar o saldo do seus  filhos");
    	         System.out.println("digite 2 para adicionar um valor na conta do seus filhos");
    	         System.out.println("digite 3 para repor as notas no caixa");
    	         System.out.println("digite 4 para verificar a quantidade de notas no caixa");
    	         respadm = sc.nextInt();
    	         
    	         
    	         if(respadm==1){
    	             System.out.println("de qual filho deseja ver o saldo? ");
    	             System.out.println("digite 1 para ver o saldo de " + i1.id);
    	             System.out.println("digite 2 para ver o saldo de " + i2.id);
    	             System.out.println("digite 3 para ver o saldo de " + i3.id);
    	             System.out.println("digite 4 para ver o saldo de " + i4.id);
    	             System.out.println("digite 5 para ver o saldo de " + i5.id);
    	             respadm2 = sc.nextInt();
    	             
    	             if(respadm2 == 1){
    	                 System.out.println("o saldo é de " + i1.sal);
    	             }
    	             
    	             else if(respadm2 == 2){
    	                 System.out.println("o saldo é de " + i2.sal);
    	             }
    	             
    	             else if(respadm2 == 3){
    	                 System.out.println("o saldo é de " + i3.sal);
    	             }
    	             
    	             else if(respadm2 == 4){
    	                 System.out.println("o saldo é de " + i4.sal);
    	             }
    	             
    	             else if(respadm2 == 5){
    	                 System.out.println("o saldo é de " + i5.sal);
    	             }
    	             
    	         }
    	         
    	         else if(respadm == 2){
    	             
    	             System.out.println("para qual filho você deseja depositar? ");
    	             System.out.println("digite 1 para depositar na conta de " + i1.id);
    	             System.out.println("digite 2 para depositar na conta de " + i2.id);
    	             System.out.println("digite 3 para depositar na conta de " + i3.id);
    	             System.out.println("digite 4 para depositar na conta de " + i4.id);
    	             System.out.println("digite 5 para depositar na conta de " + i5.id);
    	             respadm3 = sc.nextInt();
    	             
    	             if(respadm3 == 1){
    	             
    	              System.out.println("quanto deseja depositar?");
    	              respadm4 = sc.nextInt();
    	              
    	              i1.sal = i1.sal + respadm4;
    	              
    	             }
    	             
    	             if(respadm3 == 2){
    	             
    	              System.out.println("quanto deseja depositar?");
    	              respadm4 = sc.nextInt();
    	              
    	              i2.sal = i2.sal + respadm4;
    	             
    	         }
    	         
    	              if(respadm3 == 3){
    	             
    	              System.out.println("quanto deseja depositar?");
    	              respadm4 = sc.nextInt();
    	              
    	              i3.sal = i3.sal + respadm4;
    	             
    	         }
    	         
    	              else if(respadm3 == 4){
    	             
    	              System.out.println("quanto deseja depositar?");
    	              respadm4 = sc.nextInt();
    	              
    	              i4.sal = i4.sal + respadm4;
    	             
    	         }
    	         
    	              else if(respadm3 == 5){
    	             
    	              System.out.println("quanto deseja depositar?");
    	              respadm4 = sc.nextInt();
    	              
    	              i5.sal = i5.sal + respadm4;
    	             
    	         }
    	         
    	         }
    	         
    	         else if(respadm == 3){
    	             caixa.reporNota();
    	         }     
    	       
    	       
                else if(respadm == 4){
                    System.out.println("em caixa tem: " + caixa.nT50 + " notas de 50 reais");
                    System.out.println("em caixa tem: " + caixa.nT20 + " notas de 20 reais");
                    System.out.println("em caixa tem: " + caixa.nT10 + " notas de 10 reais");
                    System.out.println("em caixa tem: " + caixa.nT5 + " notas de 5 reais");
                    System.out.println("em caixa tem: " + caixa.nT2 + " notas de 2 reais");
                }
                
                
            }
    	      
             


            

            if (resp == 111111)
            {
    	        System.out.println ("ola! " + i1.id + " o que deseja fazer?");
                System.out.println("digite 1 para sacar, 2 para ver seu saldo e 3 para depositar: ");
    	        resp2 = sc.nextInt ();
    
    	        if (resp2 == 1)
    	        {
    	            i1.sacar();
    	            caixa.aux = i1.dsac;
    	            caixa.nota();
    	            i1.dsac = 0;
    	        }
    	        else if (resp2 == 2)
    	        {
    	            i1.verSaldo ();
    	        }
    
    	        else if (resp2 == 3)
            	  {
            	    i1.depositar ();
            	  }
    	        
            }






            if (resp == 222222)
              {
            	System.out.println ("ola! " + i2.id + " o que deseja fazer?");
            	System.out.println
            	  ("digite 1 para sacar, 2 para ver seu saldo e 3 para depositar: ");
            	resp2 = sc.nextInt ();
            
            	if (resp2 == 1)
            	  {
            	    i2.sacar();
    	            caixa.aux = i2.dsac;
    	            caixa.nota();
    	            i2.dsac = 0;
            	  }
            
            	else if (resp2 == 2)
            	  {
            	    i2.verSaldo ();
            	  }
            
            	else if (resp2 == 3)
            	  {
            	    i2.depositar ();
            	  }
        
              }




            if (resp == 333333)
              {
            	System.out.println ("ola! " + i3.id + " o que deseja fazer?");
            	System.out.println
            	  ("digite 1 para sacar, 2 para ver seu saldo e 3 para depositar: ");
            	resp2 = sc.nextInt ();
            
            	if (resp2 == 1)
            	  {
            	    i3.sacar();
    	            caixa.aux = i3.dsac;
    	            caixa.nota();
    	            i3.dsac = 0;
            	  }
            
            	else if (resp2 == 2)
            	  {
            	    i3.verSaldo ();
            	  }
            
            	else if (resp2 == 3)
            	  {
            	    i3.depositar ();
            	  }
        
              }





            if (resp == 444444)
              {
            	System.out.println ("ola! " + i4.id + " o que deseja fazer?");
            
            	System.out.println
            	  ("digite 1 para sacar, 2 para ver seu saldo e 3 para depositar: ");
            	resp2 = sc.nextInt ();
            
            	if (resp2 == 1)
            	  {
            	    i4.sacar();
    	            caixa.aux = i4.dsac;
    	            caixa.nota();
    	            i4.dsac = 0;
            	  }
            
            	else if (resp2 == 2)
            	  {
            	    i4.verSaldo ();
            	  }
            
            	else if (resp2 == 3)
            	  {
            	    i4.depositar ();
            	  }
        
              }




        
            if (resp == 555555)
              {
        	    System.out.println ("ola! " + i5.id + " o que deseja fazer?");
        
            	System.out.println("digite 1 para sacar, 2 para ver seu saldo e 3 para depositar: ");
            	resp2 = sc.nextInt ();
            
            	if (resp2 == 1)
            	  {
            	    i5.sacar();
    	            caixa.aux = i5.dsac;
    	            caixa.nota();
    	            i5.dsac = 0;
            	  }
            
            	else if (resp2 == 2)
            	  {
            	    i5.verSaldo ();
            	  }
            
            	else if (resp2 == 3)
            	  {
            	    i5.depositar ();
            	  }

                }
                
                System.out.println("deseja realizar outra tarefa? digite 1 para sim e aperte qualquer número para finalizar");
                resp4 = sc.nextInt();

    } while(resp4 == 1);
    
            System.out.println("deseja trocar de usuário? digite 1 para continuar ou qualquer tecla para finalizar");
            resp5 = sc.nextInt();
            
    } while(resp5 == 1);

    System.out.println("Obrigado, ao fim do dia os valores serão repostos!");
    caixa.reporNota();


    sc.close ();
  }
}