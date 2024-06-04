
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Grafo {
    //Esta é a matriz de adjacência. Usamos um Map para poder usar o próprio vertice como índice e ter
    // a liberdade de guardar quantas arestas quisermos...
    private Map<Vertice, List<Vertice>> listaAdjacencia;
    
    //Construtor
    public Grafo(){
        this.listaAdjacencia = new HashMap();
    }

    //Adicionar Vértice
    public void adicionarVertice(Vertice vertice) {
        this.listaAdjacencia.putIfAbsent(vertice, new LinkedList<>());
    }

    //Adicionar aresta
    public void adicionarAresta(Vertice origem, Vertice destino) {
        // get() no HashMap e add() na LinkedList
        //"Ida"
        this.listaAdjacencia.get(origem).add(destino);
        //"Volta"
        this.listaAdjacencia.get(destino).add(origem);
    }

    //Exibir grafo
    public void exibirGrafo(){
        //for..each é para o HashMap (o grafo inteiro)
        for (Map.Entry<Vertice, List<Vertice>> entrada: this.listaAdjacencia.entrySet()){
            System.out.print("Vértice "+entrada.getKey()+":");
            //for..each para a LinkedList
            for(Vertice verticeAdjacente: entrada.getValue()) {
                System.out.print("->"+verticeAdjacente);
            }
            System.err.println("");
        }
    }
}
