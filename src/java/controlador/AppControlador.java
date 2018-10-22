package controlador;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class AppControlador 
{
    private int num1;
    private int num2;
    private int num3;
    private int prom;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    public int getProm() {
        return prom;
    }

    public void setProm(int prom) {
        this.prom = prom;
    }
    public void promedio()
    {
        prom=(num1+num2+num3)/3;
    }
    

}
