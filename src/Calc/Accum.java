package Calc;

public class Accum {

    int value;
    Operation operation;
    Accum (Operation operation, int value){
        this.value = value;
        this.operation = operation;
    }

    protected void accum (int someInt){
       this.value = this.operation.execute(this.value, someInt);
    }

    protected int getValue (){
        return this.value;
    }

    public static void main (String []args){
        Accum acc = new Accum(new Plus(), 3);
        System.out.println(acc.getValue());
        acc.accum(5);
        System.out.println(acc.getValue());
    }
}
