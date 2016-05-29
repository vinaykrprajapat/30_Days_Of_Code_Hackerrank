// Day 18: Queues and Stacks

public class Solution { // Write your code here. 
    Stack st = new Stack(); 
    Queue li = new LinkedList();
    public void pushCharacter(char ch)
    { st.push(ch); }
    
    public void enqueueCharacter(char ch){
    li.add(ch);
    }
    
    public char popCharacter(){
        return (char)st.pop();}

    public char dequeueCharacter(){
    return (char)li.remove(); }
