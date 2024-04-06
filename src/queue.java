public class queue{
    private int maxsize;
    int f;
    int r;
    int arr[];

    //contructor class
    public queue(int size){
        maxsize=size;
        f=-1;
        r=-1;
        arr=new int[maxsize];
    }
    public boolean isfull(){
        if(r==maxsize-1){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isempty(){
        if(f==-1){
            return true;
        }
        else{
            return false;
        }
    }
    public void enqueue(int data){
        if(!isfull()){
            r++;
            arr[r]=data;
            if(f==-1){
                f=0;
            }
            else{
                System.out.println("Queue overflow");
            }
        }
    }
    public void dequeue(){
        if(isempty()){
            System.out.println("Stack underflow");
        }
        else{
            System.out.println(arr[f]+"  deleted");
        }
        if(f==r){
           r= f=-1;//checking for the condition i.e queue is empty
           
        }
        else{
            f++;
        }
    }
    public static void main(String[] args) {
        queue q= new queue(2);
        q.enqueue(10);
        q.enqueue(20);
        q.dequeue();
       
    }

}
