package Public_Private_Protected;

public class Oak extends Plant{
    public Oak() {
        // Won't work --- type is private
        // type = "tree";
        // This works --- size is protected, Oak is a subclass of Plant.
        this.size = "large";
        // No access specifier; works because Oak and Plant in same package.
        this.height = 10;
    }
}
