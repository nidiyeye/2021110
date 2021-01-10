public class son extends Father {
    private String son_a;
    public son() {
        super();
        son_a="儿子;曹冲";
        System.out.println("我是,"+son_a);
    }
    @Override
    void something() {
        //访问父类的方法
        super.something() ;
    }
}
