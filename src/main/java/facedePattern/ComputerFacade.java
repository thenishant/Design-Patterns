package facedePattern;

public class ComputerFacade {
    CPU cpu;
    Memory memory;
    HDD hdd;

    public ComputerFacade(CPU cpu, Memory memory, HDD hdd) {
        this.cpu = cpu;
        this.memory = memory;
        this.hdd = hdd;
    }

    public void assemblePC(){
        cpu.startOn();
        cpu.startingTheFans();
        memory.loadingMemory();
        hdd.writeOnHdd(" I am loading this onto HDD");
    }
}
