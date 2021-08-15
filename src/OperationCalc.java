//Задание №5:
// Реализовать калькулятор в стиле ООП. Архитектуру приложения продумать самостоятельно.
public class OperationCalc {
double xval;
double yval;
double answ;
    public OperationCalc(double xval, double yval) {
        this.xval = xval;
        this.yval = yval;
    }
    public double getAnswPlus() {
        answ = xval+yval;
        return answ;
    }
    public double getAnswMinus() {
        answ = xval-yval;
        return answ;
    }
    public double getAnswUm() {
        answ = xval*yval;
        return answ;
    }
    public double getAnswDel() {
        if (yval==0){
            System.err.println("Ошибка: делние на ноль!");
            System.exit(0);
        }
        answ = xval / yval;
        return answ;

    }

}
