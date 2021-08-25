public class Print_Maze_Paths_Recursion {
    public static void maze(int n,int m,String str,int z){
        if(n>z){
            return;
        }
        if(m>z){
            return;
        }
        if(n==z&&m==z){
            System.out.println(str);
            return;
        }
        maze(n+1,m,str+"side ",z);
        maze(n,m+1,str+"down ",z);
    }
    public static void main(String[] args) {
        maze(0,0,"",2);
    }
}
