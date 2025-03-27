package Facade;

import Facade.records.*;
import java.util.LinkedList;

/* Facade */
public class Calculator {
    private CPU cpu = new CPU(100, 8, 120);
    private GPU gpu = new GPU(100, 50);
    private LinkedList<Memory> listMemory = new LinkedList<>();
    
    public void addRAM() {
        Memory memory = new Memory(16, 50, "RAM");
        listMemory.add(memory);
    }

    public void addSSD() {
        Memory memory = new Memory(512, 50, "SSD");
        listMemory.add(memory);
    }

    public int getPrice() {
        int price = 0;
        for(Memory memory : listMemory) {
            price += memory.cost();
        }
        price += gpu.price() + cpu.price();

        return price;
    }

    public void printComponents() {
        System.out.println("Calculator details:\n");
        System.out.println("CPU: " + this.cpu + "\n");
        System.out.println("GPU: " + this.gpu + "\n");
        System.out.println("> Memories:\n");
        System.out.println(">> " + this.listMemory);
    }

}
