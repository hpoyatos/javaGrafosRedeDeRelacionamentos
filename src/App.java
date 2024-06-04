public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Criar três objetos do tipo Vertice (Não são vértice de verdade ainda...)
        Vertice vPoyatos    = new Vertice("Henrique Poyatos");
        Vertice vArthur     = new Vertice("Arthur Maestri");
        Vertice vIsadora    = new Vertice("Isadora Ribeiro Eugênio");
        
        // Criar o grafo
        Grafo redeDeRelacionamentos = new Grafo();

        // Adicionar os objetos acima como vértices (agora sim!!!)
        redeDeRelacionamentos.adicionarVertice(vPoyatos);
        redeDeRelacionamentos.adicionarVertice(vArthur);
        redeDeRelacionamentos.adicionarVertice(vIsadora);
        
    }
}
