public class ExampleBoolean {
    public static void main(String[] args) {
        Boolean bool11 = Boolean.valueOf(true);
        Boolean bool12 = Boolean.valueOf("true");
        Boolean bool13 = Boolean.valueOf("anything else"); // возвращает false
        
        Boolean bool21 = new Boolean("true");  // создаст новый объект, значение true
        Boolean bool22 = new Boolean("false"); // false
        
        Boolean bool31 = new Boolean(true);
        Boolean bool32 = new Boolean(false);
        
        boolean primitive = true;
        Boolean boolObject = primitive;
        
        Boolean boolObject2 = true;
    }
}