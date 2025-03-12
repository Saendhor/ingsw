public interface TemplateAlgo {
    
    void partA();
    void partB();
    void partC();
    
    default void algorithm(){
        partA();
        System.out.print("invariable part");
        partB();
        partC();
    }
}
