package Java1844;

public class B extends A{
    public B() {
        super();
        System.out.println("Đã tạo một phiên bản của B");
    }

    @Override
    public String toString() {
        return "Đây là B ";
    }

}
