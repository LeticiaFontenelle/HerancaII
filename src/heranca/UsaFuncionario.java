package heranca;

import javax.swing.JOptionPane; 

public class UsaFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Funcionario funcionario= new Funcionario(); 
       PessoaJuridica func=new PessoaJuridica();
       
       String u,v,t,z;
       int x;
       
       z=JOptionPane.showInputDialog ("digite 1 se contribuinte � pessoa f�sica \n digite 2 se � pessoa jur�dica"); 
       
       x=Integer.parseInt(z);
       if (z.length()==1) {
    	   switch (x)      {
    	   
    	   case 1:  {
    		   
    		   u= JOptionPane.showInputDialog (" escrever o nome do contribuinte"); 
    		   v= JOptionPane.showInputDialog (" escrever o RG do contribuinte");  
    		   t= JOptionPane.showInputDialog (" escrever a identifica��o do cart�o do contribuinte");
    		   
    		   
    		   funcionario.setNome(u);     		   
    		   funcionario.setRG(v);  
    		   funcionario.setCartao(t); 
    		   System.out.println ("NOME: " + funcionario.getNome()); 
    		   System.out.println ("RG: " + funcionario.getRG());  
    		   System.out.println ("CART�O: " + funcionario.getCartao());
    		   break; 
    		  	   
    	   }
    	   case 2:
    	          {
    		   
    		   
    	        u= JOptionPane.showInputDialog (" escrever o nome do contribuinte"); 
    	        v= JOptionPane.showInputDialog (" escrever o CNPJ do contribuinte");  
    	        t= JOptionPane.showInputDialog (" escrever a identifica��o do cart�o do contribuinte");
    	       		   
    	       		   
    	        funcionario.setNome(u);     		   
    	        func.setCnpj(v);  
    	        funcionario.setCartao(t); 
    	        System.out.println ("NOME: " + funcionario.getNome()); 
    	        System.out.println ("RG: " + func.getCnpj());  
    	        System.out.println ("CART�O: " + funcionario.getCartao());
    	        break; 
    		   
    	          }
               }
           }
       }
}