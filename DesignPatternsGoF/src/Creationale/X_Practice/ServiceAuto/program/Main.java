package Creationale.X_Practice.ServiceAuto.program;

import Creationale.X_Practice.ServiceAuto.models.ModeleMasini;
import Creationale.X_Practice.ServiceAuto.models.PrototypeFactory;
import Creationale.X_Practice.ServiceAuto.models.Sticker;

public class Main {
    public static void main(String[] args) {
        PrototypeFactory factory = new PrototypeFactory();

        Sticker stickerSkode = factory.getPrototype(ModeleMasini.SKODA);
        System.out.println("Sticker Skoda: " + stickerSkode);

        Sticker stickerVolvo = factory.getPrototype(ModeleMasini.VOLVO);
        System.out.println("Sticker Volvo: " + stickerVolvo);

        Sticker stickerBMW = factory.getPrototype(ModeleMasini.BMW);
        System.out.println("Sticker BMW: " + stickerBMW);

        stickerSkode.setLungime(0.5);
        stickerSkode.setLatime(0.5);

        System.out.println(stickerSkode);
        System.out.println(stickerVolvo);
    }
}
