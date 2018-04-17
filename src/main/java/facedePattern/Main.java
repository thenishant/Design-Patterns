package facedePattern;

public class Main {
    public static void main(String[] args) {
        CPU cpu =  new CPU();
        Memory memory = new Memory();
        HDD hdd = new HDD();


        ComputerFacade computerFacade = new ComputerFacade(cpu,memory,hdd);
        computerFacade.assemblePC();
    }
}
