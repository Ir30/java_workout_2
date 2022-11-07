class Tile{
    float edge_length;
    float tile_aria;

    Tile(float edge){
        edge_length = edge;
        tile_aria = edge_length*edge_length;
    }
}
class Floor{
    float floor_length;
    float floor_width;
    float floor_aria;

    Floor(float length,float width){
        floor_length  = length;
        floor_width = width;
        floor_aria = length*width;
    }

    int totalTiles(Tile t){
        int no_tiles = (int)(floor_aria/t.tile_aria);
        return no_tiles;
    }
}
public class DriverClass_q5 {
    public static void main(String[] args) {
        Tile t = new Tile(60);
        Floor f = new Floor(600, 300);
        
        System.out.println("No of tiles : "+f.totalTiles(t) );
    }
    
}
