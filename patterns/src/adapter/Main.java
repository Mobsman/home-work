package adapter;

public class Main {
    public static void main(String[] args) {

        MemoryCard memoryCard = new MemoryCard();
        USBDevice usbAdapter = new MemoryCardAdapter(memoryCard);

        Computer computer = new Computer();
        computer.readFromUSB(usbAdapter);
    }
}
