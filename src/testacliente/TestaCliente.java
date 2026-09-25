package testacliente;

/**
 *
 * @author rodrigo
 */
public class TestaCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estado estado = new Estado();
        estado.setNome("MG");
        
        Cidade cidade = new Cidade();
        cidade.setNome("Campo Belo");
        cidade.setEstado(estado); 
        
        
        
        
        Cliente cliente = new Cliente();  
        cliente.setCodigo(1);
        cliente.setNome("Bruno");
        cliente.setEndereco("Afonso Pena, 123");     
        cliente.setCidade(cidade);        
        
     //   System.out.println(cliente.toString());
     
        System.out.println("Cliente:"+cliente.getNome()+
                           "Endereço:"+cliente.getEndereco()+
                           "Cidade:"+cliente.getCidade().getNome()+
                           "Estado:"+cliente.getCidade().getEstado().getNome());
        
    }
    
}
