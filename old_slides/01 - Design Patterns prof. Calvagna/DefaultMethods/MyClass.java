class MyClass implements TemplateAlgo {

    public void partA(){ 
        System.out.print("my partA\n"); 
    }
    public static void main (String[] args){


        new MyClass().algorithm(); 

    }
    @Override
    public void partB() {
        System.out.print("my partB\n"); 
        
    }
    @Override
    public void partC() {
        System.out.print("my partC\n"); 
        
    }

}