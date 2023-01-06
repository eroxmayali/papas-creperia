public class CreperiaMain{
    public static void main(String[] args) {
            //new Customer();
    Customer  cu = new Customer();
    Creperia c1 = new Creperia();
    c1.showOrder(cu);
    c1.chooseSize();
    c1.chooseFilling();
    c1.chooseTopping();
    c1.showScore(cu);
    }
}