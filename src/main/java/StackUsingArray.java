public class StackUsingArray {

    int arr[] = null;
    int currentIndex=0;
    int size;

    public StackUsingArray(int size){
        this.size = size;
        arr = new int[size];
    }
    public StackUsingArray(){

        arr = new int[size];
    }
//
    public void push(int element){
        if(currentIndex>size){
            System.out.println("Not possible to store beyond size");
            throw new RuntimeException("Not possible to store beyond size\"") ;
        }
        arr[currentIndex] = element;
        currentIndex=currentIndex+1;

    }
    // returning the removing element from the stack
    public int pop(){
        if(currentIndex == 0){
            throw new RuntimeException("Not possible to remove element from empty array") ;
        }
        currentIndex=currentIndex-1;
        return arr[currentIndex+1];
    }
    public int currentPositionOfStack(){
        return currentIndex;

    }
}


//https://codecanyon.net/item/gromart-grocery-store-app-grocery-delivery-multi-vendor-grocery-app/37704885#