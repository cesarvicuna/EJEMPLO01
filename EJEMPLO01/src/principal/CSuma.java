package principal;
public class CSuma {
   private double n1,n2,resultado;
   private String op;

    /**
     * @param n1 the n1 to set
     */
    public void setN1(double n1) {
        this.n1 = n1;
    }

    /**
     * @param n2 the n2 to set
     */
    public void setN2(double n2) {
        this.n2 = n2;
    }

    /**
     * @param op the op to set
     */
    public void setOp(String op) {
        this.op = op;
    }

    /**
     * @return the resultado
     */
    public double getResultado() {
        
        if(this.op.equals("+"))
        {
            return this.n1+this.n2;
        }
        else if(this.op.equals("*"))
        {
            return this.n1*this.n2;
        }
        else if(this.op.equals("-"))
        {
            return this.n1-this.n2;
        }
        else
            return this.n1/this.n2;
        
    }
}
