public class Produto{
    // Atributos
    private int id;
    private String nome;
    private double  preço;

    // Construtor
    public Produto(int id, String nome, double preço){
        this.id = id;
        this.nome = nome;
        this.preço = preço;
    }

    /*Getters e Setters */
    public  int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public double getPreco(){
        return preço;
    }
    public void setPreco(double preço){
        this.preço = preço;
    }

    // Subescrever
    @Override
    public String toString(){
        return  "Produto [id=" + id + ", nome=" + nome + ", preço= " + preço + "]";
    }
}