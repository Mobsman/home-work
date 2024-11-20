package factory;

public class Americano implements Coffee{

    @Override
    public String brew() {
        return "americano ready";
    }
}
