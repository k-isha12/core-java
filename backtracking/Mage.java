import java.util.ArrayList;

public class Mage{
    public static void main(String[] args){
        System.out.println(count(3,3));
        path("",3,3);
        System.out.println(pathRet("",3,3));
        System.out.println(pathRetDiagnoal(" ",3,3));
        boolean[][] board = {
            {true,true,true},
            {true,false,true},
            {true,true,true,}
        };
        pathWithObstacles("",board,0,0);
    }
    //count number of paths in maze
    static int count(int r,int c){
        if(r==1|| c==1){
            return 1;
        }
        int left = count(r-1,c);
        int right = count(r,c-1);
        return left+right;
    }
    static void path(String p,int r,int c){
        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }
        if(r>1){
            path(p+'D',r-1,c);//D for down and R for right
        }
        if(c>1){
            path(p+'R',r,c-1);
        }
    }
    static ArrayList<String> pathRet(String p,int r,int c){
        if(r == 1 && c == 1){
             ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r>1){
            list.addAll(pathRet(p+'D',r-1,c));
        }
        if(c>1){
            list.addAll(pathRet(p+'R',r,c-1));
        }
        return list;
    }
    static ArrayList<String> pathRetDiagnoal(String p,int r,int c){
        if(r == 1 && c == 1){
             ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r>1 && c>1){
            list.addAll(pathRetDiagnoal(p+'D',r-1,c-1));//D for diagonal,V for Vertical and H for horizatonal
        }
        if(r>1){
            list.addAll(pathRetDiagnoal(p+'V',r-1,c));
        }
        if(c>1){
            list.addAll(pathRetDiagnoal(p+'H',r,c-1));
        }
        return list;
    }
    static void pathWithObstacles(String p,boolean[][] maze, int r,int c){
        if(r == maze.length-1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        if(r < maze.length-1){
            pathWithObstacles(p+'D',maze,r+1,c);//D for down and R for right
        }
        if(c < maze[0].length-1){
            pathWithObstacles(p+'R',maze,r,c+1);
        }
    }
}
