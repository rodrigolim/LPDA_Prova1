package testacliente;

/**
 *
 * @author rodrigo
 */
public class Cliente {
    private int codigo;
    private String nome;
    private String endereco;
    private Cidade cidade;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Cliente{" + "codigo=" + codigo + ", nome=" + nome + ", endereco=" + endereco + ", cidade=" + cidade.getNome()+"/"+cidade.getEstado().getNome()+ '}';
    }
    
    

    
    
}
