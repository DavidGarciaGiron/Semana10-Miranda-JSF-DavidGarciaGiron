package controlador;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@RequestScoped
public class AppControlador2 
{
    private int num1;
    private int num2;
    private int rpta;
    private String operacion;

    public int getNum1() 
    {
        return num1;
    }

    public void setNum1(int num1) 
    {
        this.num1 = num1;
    }

    public int getNum2() 
    {
        return num2;
    }

    public void setNum2(int num2) 
    {
        this.num2 = num2;
    }

    
    public int getRpta() {
        return rpta;
    }

    public void setRpta(int rpta) {
        this.rpta = rpta;
    }
    
    public String getOperacion() 
    {
        return operacion;
    }

    public void setOperacion(String operacion) 
    {
        this.operacion = operacion;
    }
    
    //Numeros - Metodos
    public String procesar(String operacion)
    {
        String destino;
        
        try
        {
            validar(num1);
            validar(num2);
            this.operacion = operacion;
            
            if(operacion.equals("SUMA"))
            {
                rpta = num1+num2;
            }else if(operacion.equals("PRODUCTO"))
            {
                rpta = num1*num2;
            }
            
            destino = "resultado3";
            
        }catch(Exception e1)
        {
            FacesMessage msgError = new FacesMessage(
                    FacesMessage.SEVERITY_ERROR, "Error en el Proceso", e1.getMessage()
            );
            
            FacesContext.getCurrentInstance().addMessage(null, msgError);
        
            destino = "registro2";
        }
        return destino;              
    }
    
    public void validar (int num)
    {
        if(num<0)
        {
            throw new RuntimeException("No se permite valores negativos");
        }
        if (num>100)
        {
            throw new RuntimeException("No se permite valores superiores a 100");
        }
    }


    
    
    
    
}
