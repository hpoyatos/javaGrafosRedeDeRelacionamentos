public class App {
    public static void main(String[] args) throws Exception {
        // Criar três objetos do tipo Vertice (Não são vértice de verdade ainda...)
        Vertice vPoyatos    = new Vertice("Henrique Poyatos");
        Vertice vArthur     = new Vertice("Arthur Maestri");
        Vertice vIsadora    = new Vertice("Isadora Rodrigues");
        
        // Criar o grafo
        Grafo redeDeRelacionamentos = new Grafo();

        // Adicionar os objetos acima como vértices (agora sim!!!)
        redeDeRelacionamentos.adicionarVertice(vPoyatos);
        redeDeRelacionamentos.adicionarVertice(vArthur);
        redeDeRelacionamentos.adicionarVertice(vIsadora);
        
        // Criando as três arestas do "triângulo da amizade"
        redeDeRelacionamentos.adicionarAresta(vPoyatos, vArthur);
        redeDeRelacionamentos.adicionarAresta(vArthur, vIsadora);
        redeDeRelacionamentos.adicionarAresta(vIsadora, vPoyatos);
        
        // Exibir grafo
        redeDeRelacionamentos.exibirGrafo();

        System.out.println("");

        Vertice vCaio = new Vertice("Caio Alves Fernandes");
        redeDeRelacionamentos.adicionarVertice(vCaio);
        redeDeRelacionamentos.adicionarAresta(vCaio, vArthur);

        // Exibir grafo
        redeDeRelacionamentos.exibirGrafo();

    }
}
