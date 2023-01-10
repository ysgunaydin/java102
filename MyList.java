/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yusuf Sevki
 */
public class MyList<T> {

    private Object[] arr;   //object array
    public int len;
    public int counter;

    // class constructor
    public MyList() {
        // instantiate a new Object array of specified length
        this.arr = new Object[10];
        this.len = 10;
        counter = 0;
    }
    
    public MyList(int capacity) {
        // instantiate a new Object array of specified length
        this.arr = new Object[capacity];
        this.len = capacity;
        counter = 0;
    }
    
    void add(T t)
    {
        if(counter < len)
            arr[counter++] = t;
        else{
            Object[] temp = new Object[len*2];
            for(int i=0; i < len; i++){
                temp[i] = arr[i];
            }
            temp[counter++] = t;
            arr = temp;
            len = len*2;
        }
    }
    
    void remove(int i)
    {
        if(i < counter){
            System.out.println("deneme");
            for(int j=i+1; j<counter; j++){
                arr[j-1] = arr[j];
            }
            counter--;
            
        }
    }
    
    T get(int i)
    {       
        if(i<counter && i>-1){
            final T t = (T)arr[i];
            return t;
        }
        return null;
    }
    
    T set(int i, T data)
    {       
        if(i<counter && i>-1){
            arr[i] = data;
            return data;
        }
        else
            return null;
    }
    
    int indexOf(T data){
        for(int i=0; i<counter; i++){
            if(arr[i].equals(data)){
                return i;
            }
        }
        return -1;
    }
    
    int lastIndexOf(T data){
        int ind=-1;
        for(int i=0; i<counter; i++){
            if(arr[i].equals(data)){
                ind = i;
            }
        }
        return ind;
    }
    
    boolean isEmpty(){
        return counter == 0;
    }
    
    T[] toArray(){
        return(T[]) arr;
    }
    
    void clear(){
        for(int i=0; i<counter;i++){
            arr[i] = null;
        }
        counter = 0;
    }
    
    MyList<T> subList(int start,int finish){
        MyList<T> temp = new MyList<>();
        for(int i=start; i<=finish;i++){
            temp.add((T)arr[i]);
        }
        return temp;
    }
    
    boolean contains(T data){
        for(int i=0; i<counter;i++){
            if(arr[i].equals(data)){
                return true;
            }
        }
        return false;
    }
    
    public String toString(){
        String res = "[";
        int i;
        for(i=0; i<counter-1; i++){
            res += arr[i]+",";
        }
        if(counter!=0)
            res += arr[i];
        
        res+="]";
        return res;
    }
    
    int size(){
        return counter;
    }
    
    int getCapacity(){
        return len;
    }
}
