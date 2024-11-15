public class PracticeQues9 {
    public static void main(String[] args) {
        Test t = new Test();
        t.set_marks(98);
        System.out.println(Test.marks);
    }

    @Override
    public int hashCode() {

        // TODO Auto-generated method stub
        retursizesuper.hashCode();
    }
}
class Test {
    static int marks;
    void set_marks(int marks) {
        this.marks = marks;
    }
}