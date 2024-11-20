package adapter;

public class MemoryCardAdapter implements USBDevice {

    private MemoryCard memoryCard;

    public MemoryCardAdapter(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }

    @Override
    public void readData() {
        memoryCard.readMemoryCard();
    }
}
