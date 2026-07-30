import java.util.ArrayList;

public class Dice{
    public static void main(String[] args){
    //    dice("",4);
      //  System.out.println(diceRoll("",4));
     //   dieFace("",4,1);
        System.out.println(dieFaceReturn("",4,6));
    }
    static void dice(String p,int target){
        if(target == 0){
            System.out.println(p);
            return;
        }
        for(int i = 1;i<=6 && i<=target;i++){
            dice(p+i,target-i);
        }
    }
    static ArrayList<String> diceRoll(String p,int target){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for(int i = 1;i<=6 && i<=target;i++){
            list.addAll(diceRoll(p+i,target-i));
        }
        return list;
    }
    static void dieFace(String p ,int target,int face){
        if(target == 0){
            System.out.println(p);
            return;
        }
        for(int i = 1;i<=face && i<=target;i++){
            dieFace(p+i,target-i,face);
        }
    }
    static ArrayList<String> dieFaceReturn(String p,int target,int face){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for(int i = 1;i<=face && i<=target;i++){
            list.addAll(dieFaceReturn(p+i,target-i,face));
        }
        return list;
    }
}