
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
}
