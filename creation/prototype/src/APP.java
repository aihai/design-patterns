import java.util.Hashtable;

public class APP {

    public static void main(String[] args) {
        SymbolLoader myLoader = new SymbolLoader();
        Hashtable mySymbols = myLoader.getSymbols();

        Graphic myLine = (Graphic) ((Graphic) mySymbols.get("Line")).clone();
        myLine.DoSomething();
    }
}