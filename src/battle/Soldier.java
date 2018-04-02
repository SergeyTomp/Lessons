package battle;

abstract class Soldier {
    protected int health;
    protected int attackScore;
    public  boolean isAlive(){
        return health > 0;
    }

    public Soldier (int health, int attackScore){
        this.health = health;
        this.attackScore = attackScore;
    }

    public void attack (Soldier enemy){
        enemy.health -= attackScore;
    }
}

class Red extends Soldier{

    public Red (){
        super(200, 100);
    }
    @Override
    public void attack(Soldier enemy){
        enemy.health -= attackScore + 10;
    }
}

class White extends Soldier{

    public White (){
        super(200, 100);
    }
    @Override
    public void attack(Soldier enemy){
        enemy.health -= attackScore + 20;
    }
}



//
//
//    class White {
//        int health;
//        int attackScore;
//        public  boolean isAlive(){
//            return health > 0;
//        }
//        public void attack (Red red){
//            red.health -= attackScore;
//}