package Quiz;

public class QuizCating {
    public static void main(String[] args) {
        int ivar=100;
        double dvar=123;
        float fvar=200;
        ivar= (int) fvar;
        fvar=ivar;
        dvar=fvar;
        fvar=(float) dvar;
        dvar=ivar;
        ivar=(int) dvar;

    }
}
