import java.util.Scanner;
public class Doing {
    public static void main(String[] args) throws Exception {
        Stacktext undo = new Stacktext("undo");
        Stacktext redo = new Stacktext("redo");
        Scanner in = new Scanner(System.in);
        String c, temp;
        while(true){
            while(true){
                temp=null;
                System.out.println(
                    "-------------------------\n"+
                    "< for undo\n"+
                    "> for redo\n"+
                    "+ for add new word\n"+
                    "* for exit\n"
                );
                c=in.next();
                if(c.equals("+")){
                    undo.push(in.next());
                    redo.reset();
                    break;
                }
                else if(c.equals("<")){//undo
                    System.out.println("undo");
                    redo.push(undo.pop());
                    System.out.println(undo.history[undo.top-1]);
                    break;
                }
                else if(c.equals(">")){//redo
                    System.out.println("redo");
                    undo.push(redo.pop());
                    System.out.println(undo.history[undo.top-1]);
                    break;
                }
                else if(c.equals("*")){
                    break;
                }
                else{
                    continue;
                }
            }
            if(c.equals("*")){
                break;
            }
        }
    }

    
}