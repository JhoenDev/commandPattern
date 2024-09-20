public class LDecBrightness implements Command{
    private Light light;

    public LDecBrightness(Light light){
        this.light = light;
    }

    @Override
    public String execute() {
        return light.decBrightness();
    }
    
}