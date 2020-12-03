public class Stacktext {
    public String [] history = new String[10];
    public int top=0;
    public String name;

    Stacktext(String name){
        this.name=name;
    }

    public void push (String update) throws Exception{
        if(!isFull()){
            history[top] = update;
            top++;
            //System.out.println(name+" push and now point at"+top+" = "+history[top]+"\n"+(top-1)+" is "+history[top-1]);
        }
        else{
            throw new Exception("Stack overflow");
        }
    }

    public String pop () throws Exception{
        if(!isEmpty()){
            String ret = history[top-1];
            history[top-1] = null;
            top--;
            //System.out.println(name+" pop and now point at"+(top)+" = "+history[top]);
            return ret;
        }
        else{
            throw new Exception("Stack Underflow");
        }
    }

    public boolean isEmpty() {
        if (top == -1){
            return true;
        }
            else {
                return false;
            }
    }

    public boolean isFull() {
        if (top == 9){
            return true;
        }
        else {
            return false;
        }
    }

    public void reset(){
        top = 0;
        for(int i=0;i<10;i++){
            history[i] = null;
        }
    }
}
