package FabricMethod;

public class FabricMethod {

    //usage  FabricMethod fabricMethod = FabricMethod.create();

    private FabricMethod() {

    }

    public static FabricMethod create() {
        return new FabricMethod();
    }
}

