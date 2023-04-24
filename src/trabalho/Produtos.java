
package trabalho;

public class Produtos {
    private String descricao;
    private String nome;
    private int unidade;
    private String apresentacao;
    private double comisao;
    private String codigoDeBarras;
    private String tipo;
    private double valor;
    private double valorAVista;
    private int estoqueMax;
    private String estoqueOnline;
    private String venda;
    private String promocao;
    private double vlrPromocao;
    private double desconto;
    private String dataAumento;
    private String dataPromocao;
    private double lucro;
    private double custo;
    private int estoqueMin;
   

    public Produtos(String descricao, String nome, int unidade, String apresentacao, double comisao, String codigoDeBarras, String tipo, double valor,double valorAVista ,int estoqueMax,int estoqueMin,String estoqueOnline,String venda,String promocao,double vlrPromocao,double desconto,String dataAumento,String dataPromocao,double lucro,double custo) {
        this.descricao = descricao;
        this.nome = nome;
        this.unidade = unidade;
        this.apresentacao = apresentacao;
        this.comisao = comisao;
        this.codigoDeBarras = codigoDeBarras;
        this.tipo = tipo;
        this.valor = valor;
        this.valorAVista = valorAVista;
        this.estoqueMax = estoqueMax;
        this.estoqueOnline = estoqueOnline;
        this.venda = venda;
        this.promocao = promocao;
        this.vlrPromocao = vlrPromocao;
        this.desconto = desconto;
        this.dataAumento = dataAumento;
        this.dataPromocao = dataPromocao;
        this.lucro = lucro;
        this.custo = custo;
        this.estoqueMin = estoqueMin;
      
    }
    
    public Produtos (){}

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getUnidade() {
        return unidade;
    }

    public void setUnidade(int unidade) {
        this.unidade = unidade;
    }

    public String getApresentacao() {
        return apresentacao;
    }

    public void setApresentacao(String apresentacao) {
        this.apresentacao = apresentacao;
    }

    public double getComisao() {
        return comisao;
    }

    public void setComisao(double comisao) {
        this.comisao = comisao;
    }

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(String codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getEstoqueMax() {
        return estoqueMax;
    }

    public void setEstoque(int estoque) {
        this.estoqueMax = estoqueMax;
    }

    public String getEstoqueOnline() {
        return estoqueOnline;
    }

    public void setEstoqueOnline(String estoqueOnline) {
        this.estoqueOnline = estoqueOnline;
    }

    public String getVenda() {
        return venda;
    }

    public void setVenda(String venda) {
        this.venda = venda;
    }

    public String getPromocao() {
        return promocao;
    }

    public void setPromocao(String promocao) {
        this.promocao = promocao;
    }

    public double getVlrPromocao() {
        return vlrPromocao;
    }

    public void setVlrPromocao(double vlrPromocao) {
        this.vlrPromocao = vlrPromocao;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public String getDataAumento() {
        return dataAumento;
    }

    public void setData(String data) {
        this.dataAumento = dataAumento;
    }

    public double getLucro() {
        return lucro;
    }

    public void setLucro(double lucro) {
        this.lucro = lucro;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public double getValorAVista() {
        return valorAVista;
    }

    public void setValorAVista(double valorAVista) {
        this.valorAVista = valorAVista;
    }

    public String getDataPromocao() {
        return dataPromocao;
    }

    public void setDataPromocao(String dataPromocao) {
        this.dataPromocao = dataPromocao;
    }

    public int getEstoqueMin() {
        return estoqueMin;
    }

    public void setEstoqueMin(int estoqueMin) {
        this.estoqueMin = estoqueMin;
    }

   
}
