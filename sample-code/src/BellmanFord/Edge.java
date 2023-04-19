package BellmanFord;

class Edge {
    int v; // 나가는 정점
    int w; // 들어오는 정점
    int cost;

    public Edge(int v, int w, int cost) {
        this.v = v;
        this.w = w;
        this.cost = cost;
    }
}